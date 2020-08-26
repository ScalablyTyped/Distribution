package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，授权认证参数选项
  * 此对象支持的属性值由登录授权认证服务定义。
  *     例如“微信”，则可配置以下参数：
  *     scope - 应用授权作用域；
  *     state - 用于保持请求和回调的状态参数。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
  */
@js.native
trait PlusOauthAuthOptions extends js.Object {
  /**
    * 登录授权认证服务平台申请的appid
    * 动态设置登录授权服务中需要使用的appid，仅需要此参数的登录授权服务（如“微信登录”、“QQ登录”）支持。
    *     如果未设置则使用运行环境中内置的appid值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appid: js.UndefOr[String] = js.native
  /**
    * 登录授权认证服务平台申请的appkey
    * 动态设置登录授权服务中需要使用的appkey，仅需要此参数的登录授权服务（如“新浪微博登录”、“360登录”）支持。
    *     如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appkey: js.UndefOr[String] = js.native
  /**
    * 登录授权认证服务平台申请的appsecret
    * 动态设置登录授权服务中需要使用的appsecret，仅需要此参数的登录授权服务（如“微信登录”、“新浪微博登录”）支持。
    *     如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）；当开放平台申请的appsecret值涉及到安全问题时，可在应用运行时从服务器获取，然后通过此api动态设置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var appsecret: js.UndefOr[String] = js.native
  /**
    * 登录授权认证服务平台申请的redirect_url
    * 动态设置登录授权服务中需要使用的redirect_url，仅需要此参数的登录授权服务（如“新浪微博登录”）支持。
    *     如果未设置则使用运行环境中内置的redirect_url值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var redirect_url: js.UndefOr[String] = js.native
  /**
    * 申请的权限作用范围
    * 如果存在多个权限，则以","符号分割。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * 客户端的当前状态，可以指定任意值，登录认证后原封不动的返回保存到AuthService对象的extra中
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/oauth.html](http://www.html5plus.org/doc/zh_cn/oauth.html)
    */
  var state: js.UndefOr[String] = js.native
}

object PlusOauthAuthOptions {
  @scala.inline
  def apply(): PlusOauthAuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusOauthAuthOptions]
  }
  @scala.inline
  implicit class PlusOauthAuthOptionsOps[Self <: PlusOauthAuthOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppid(value: String): Self = this.set("appid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppid: Self = this.set("appid", js.undefined)
    @scala.inline
    def setAppkey(value: String): Self = this.set("appkey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppkey: Self = this.set("appkey", js.undefined)
    @scala.inline
    def setAppsecret(value: String): Self = this.set("appsecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsecret: Self = this.set("appsecret", js.undefined)
    @scala.inline
    def setRedirect_url(value: String): Self = this.set("redirect_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect_url: Self = this.set("redirect_url", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

