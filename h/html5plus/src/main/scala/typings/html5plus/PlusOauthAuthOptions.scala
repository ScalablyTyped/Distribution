package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，授权认证参数选项
  * 此对象支持的属性值由登录授权认证服务定义。
  *     例如“微信”，则可配置以下参数：
  *     scope - 应用授权作用域；
  *     state - 用于保持请求和回调的状态参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
trait PlusOauthAuthOptions extends StObject {
  
  /**
    * 登录授权认证服务平台申请的appid
    * 动态设置登录授权服务中需要使用的appid，仅需要此参数的登录授权服务（如“微信登录”、“QQ登录”）支持。
    *     如果未设置则使用运行环境中内置的appid值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权认证服务平台申请的appkey
    * 动态设置登录授权服务中需要使用的appkey，仅需要此参数的登录授权服务（如“新浪微博登录”、“360登录”）支持。
    *     如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appkey: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权认证服务平台申请的appsecret
    * 动态设置登录授权服务中需要使用的appsecret，仅需要此参数的登录授权服务（如“微信登录”、“新浪微博登录”）支持。
    *     如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）；当开放平台申请的appsecret值涉及到安全问题时，可在应用运行时从服务器获取，然后通过此api动态设置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appsecret: js.UndefOr[String] = js.undefined
  
  /**
    * 登录授权认证服务平台申请的redirect_url
    * 动态设置登录授权服务中需要使用的redirect_url，仅需要此参数的登录授权服务（如“新浪微博登录”）支持。
    *     如果未设置则使用运行环境中内置的redirect_url值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var redirect_url: js.UndefOr[String] = js.undefined
  
  /**
    * 申请的权限作用范围
    * 如果存在多个权限，则以","符号分割。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var scope: js.UndefOr[String] = js.undefined
  
  /**
    * 客户端的当前状态，可以指定任意值，登录认证后原封不动的返回保存到AuthService对象的extra中
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var state: js.UndefOr[String] = js.undefined
}
object PlusOauthAuthOptions {
  
  inline def apply(): PlusOauthAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOauthAuthOptions]
  }
  
  extension [Self <: PlusOauthAuthOptions](x: Self) {
    
    inline def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setAppkey(value: String): Self = StObject.set(x, "appkey", value.asInstanceOf[js.Any])
    
    inline def setAppkeyUndefined: Self = StObject.set(x, "appkey", js.undefined)
    
    inline def setAppsecret(value: String): Self = StObject.set(x, "appsecret", value.asInstanceOf[js.Any])
    
    inline def setAppsecretUndefined: Self = StObject.set(x, "appsecret", js.undefined)
    
    inline def setRedirect_url(value: String): Self = StObject.set(x, "redirect_url", value.asInstanceOf[js.Any])
    
    inline def setRedirect_urlUndefined: Self = StObject.set(x, "redirect_url", js.undefined)
    
    inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    
    inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
