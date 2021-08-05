package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 登录授权认证信息
  * 此对象仅定义标准属性，登录授权认证服务可扩展自定义数据。
  *     例如“微信”登录授权服务，则包括以下数据：
  *     unionid - 用户统一标识，针对一个微信开放平台帐号下的应用，同一用户的unionid是唯一的。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
trait PlusOauthAuthInfo extends StObject {
  
  /**
    * 登录授权的访问令牌
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var access_token: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权访问令牌过期时间
    * 单位为秒，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var expires_in: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权用户的唯一标识
    * 如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var openid: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权的更新令牌
    * 用来获取下一次的访问令牌，如果登录授权服务不支持此属性，则返回"undefined"。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var refresh_token: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权的权限范围
    * 如果存在多个权限，则以","符号分割。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var scope: js.UndefOr[String] = js.undefined
}
object PlusOauthAuthInfo {
  
  inline def apply(): PlusOauthAuthInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOauthAuthInfo]
  }
  
  extension [Self <: PlusOauthAuthInfo](x: Self) {
    
    inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
    
    inline def setAccess_tokenUndefined: Self = StObject.set(x, "access_token", js.undefined)
    
    inline def setExpires_in(value: String): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    
    inline def setExpires_inUndefined: Self = StObject.set(x, "expires_in", js.undefined)
    
    inline def setOpenid(value: String): Self = StObject.set(x, "openid", value.asInstanceOf[js.Any])
    
    inline def setOpenidUndefined: Self = StObject.set(x, "openid", js.undefined)
    
    inline def setRefresh_token(value: String): Self = StObject.set(x, "refresh_token", value.asInstanceOf[js.Any])
    
    inline def setRefresh_tokenUndefined: Self = StObject.set(x, "refresh_token", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
  }
}
