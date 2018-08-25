package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {

    List<UserInfo> findAll();
    List<UserAddress> getUserAddressList(String userId);
}
