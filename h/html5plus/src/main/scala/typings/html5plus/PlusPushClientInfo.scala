package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON对象，获取的客户端标识信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
trait PlusPushClientInfo extends js.Object {
  /**
    * 第三方推送服务的应用标识
    * 第三方推送服务器管理的应用标识，通常需要在第三方推送服务器平台进行注册获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appid: js.UndefOr[String] = js.undefined
  /**
    * 第三方推送服务器的应用键值
    * 第三方推送服务器管理的应用键值，通常需要在第三方推送服务器平台进行注册获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appkey: js.UndefOr[String] = js.undefined
  /**
    * 推送服务令牌（设备唯一标识），用于标识推送信息接收者身份
    * 第三方推送服务器管理的设备唯一标识，在iOS平台此值通常与token不同；在其它平台此值通常与token值一致。
    * 	此值与设备及应用都相关，即不同的apk/ipa安装到同一台设备上的值都不相同。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var clientid: js.UndefOr[String] = js.undefined
  /**
    * 设备令牌（iOS设备唯一标识），用于APNS服务推送中标识设备的身份
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var token: js.UndefOr[String] = js.undefined
}

object PlusPushClientInfo {
  @scala.inline
  def apply(appid: String = null, appkey: String = null, clientid: String = null, token: String = null): PlusPushClientInfo = {
    val __obj = js.Dynamic.literal()
    if (appid != null) __obj.updateDynamic("appid")(appid)
    if (appkey != null) __obj.updateDynamic("appkey")(appkey)
    if (clientid != null) __obj.updateDynamic("clientid")(clientid)
    if (token != null) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[PlusPushClientInfo]
  }
}

