package com.dao;

import com.entity.CantingxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CantingxinxiVO;
import com.entity.view.CantingxinxiView;


/**
 * 餐厅信息
 * 
 * @author 
 * @email 
 * @date 2021-01-25 10:23:22
 */
public interface CantingxinxiDao extends BaseMapper<CantingxinxiEntity> {
	
	List<CantingxinxiVO> selectListVO(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
	
	CantingxinxiVO selectVO(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
	
	List<CantingxinxiView> selectListView(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);

	List<CantingxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
	
	CantingxinxiView selectView(@Param("ew") Wrapper<CantingxinxiEntity> wrapper);
	
}
