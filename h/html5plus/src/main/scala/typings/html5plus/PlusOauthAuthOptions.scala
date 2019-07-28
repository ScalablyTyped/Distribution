package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，授权认证参数选项
  * 此对象支持的属性值由登录授权认证服务定义。
  * 	例如“微信”，则可配置以下参数：
  * 	scope - 应用授权作用域；
  * 	state - 用于保持请求和回调的状态参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
trait PlusOauthAuthOptions extends js.Object {
  /**
    * 登录授权认证服务平台申请的appid
    * 动态设置登录授权服务中需要使用的appid，仅需要此参数的登录授权服务（如“微信登录”、“QQ登录”）支持。
    * 	如果未设置则使用运行环境中内置的appid值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  /**
    * 登录授权认证服务平台申请的appkey
    * 动态设置登录授权服务中需要使用的appkey，仅需要此参数的登录授权服务（如“新浪微博登录”、“360登录”）支持。
    * 	如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appkey: js.UndefOr[String] = js.undefined
  /**
    * 登录授权认证服务平台申请的appsecret
    * 动态设置登录授权服务中需要使用的appsecret，仅需要此参数的登录授权服务（如“微信登录”、“新浪微博登录”）支持。
    * 	如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）；当开放平台申请的appsecret值涉及到安全问题时，可在应用运行时从服务器获取，然后通过此api动态设置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appsecret: js.UndefOr[String] = js.undefined
  /**
    * 登录授权认证服务平台申请的redirect_url
    * 动态设置登录授权服务中需要使用的redirect_url，仅需要此参数的登录授权服务（如“新浪微博登录”）支持。
    * 	如果未设置则使用运行环境中内置的redirect_url值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
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
  @scala.inline
  def apply(
    appid: String = null,
    appkey: String = null,
    appsecret: String = null,
    redirect_url: String = null,
    scope: String = null,
    state: String = null
  ): PlusOauthAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid)
    if (appkey != null) __obj.updateDynamic("appkey")(appkey)
    if (appsecret != null) __obj.updateDynamic("appsecret")(appsecret)
    if (redirect_url != null) __obj.updateDynamic("redirect_url")(redirect_url)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[PlusOauthAuthOptions]
  }
}

