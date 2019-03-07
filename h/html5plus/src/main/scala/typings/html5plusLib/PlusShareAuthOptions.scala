package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，分享授权认证参数选项
  * 此对象支持的属性值由分享服务的授权认证模块定义。
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
  */
trait PlusShareAuthOptions extends js.Object {
  /**
    * 分享服务平台申请的appid
    * 动态设置分享服务授权认证时需要使用的appid，仅需要此参数的分享服务（如“微信”、“QQ”）支持。
    * 	如果未设置则使用运行环境中内置的appid值（如在HBuilder中可在manifest.json的“SDK配置”项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var appid: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享服务平台申请的appkey
    * 动态设置分享服务授权认证时需要使用的appkey，仅需要此参数的分享服务（如“新浪微博”）支持。
    * 	如果未设置则使用运行环境中内置的appkey值（如在HBuilder中可在manifest.json的“SDK配置”项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var appkey: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享服务平台申请的appsecret
    * 动态设置分享服务中需要使用的appsecret，仅需要此参数的分享服务（如“微信”、“新浪微博”）支持。
    * 	如果未设置则使用运行环境中内置的appsecret值（如在HBuilder中可在manifest.json的“SDK配置”项中进行设置）；当开放平台申请的appsecret值涉及到安全问题时，可在应用运行时从服务器获取，然后通过此api动态设置。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var appsecret: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 分享服务平台申请的redirect_url
    * 动态设置分享服务中需要使用的redirect_url，仅需要此参数的登录授权服务（如“新浪微博登录”）支持。
    * 	如果未设置则使用运行环境中内置的redirect_url值（如在HBuilder中可在manifest.json的SDK配置项中进行设置）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/share.html](http://www.html5plus.org/doc/zh_cn/share.html)
    */
  var redirect_url: js.UndefOr[java.lang.String] = js.undefined
}

object PlusShareAuthOptions {
  @scala.inline
  def apply(
    appid: java.lang.String = null,
    appkey: java.lang.String = null,
    appsecret: java.lang.String = null,
    redirect_url: java.lang.String = null
  ): PlusShareAuthOptions = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid)
    if (appkey != null) __obj.updateDynamic("appkey")(appkey)
    if (appsecret != null) __obj.updateDynamic("appsecret")(appsecret)
    if (redirect_url != null) __obj.updateDynamic("redirect_url")(redirect_url)
    __obj.asInstanceOf[PlusShareAuthOptions]
  }
}

