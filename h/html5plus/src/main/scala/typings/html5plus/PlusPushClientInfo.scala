package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，获取的客户端标识信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
@js.native
trait PlusPushClientInfo extends js.Object {
  
  /**
    * 第三方推送服务的应用标识
    * 第三方推送服务器管理的应用标识，通常需要在第三方推送服务器平台进行注册获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appid: js.UndefOr[String] = js.native
  
  /**
    * 第三方推送服务器的应用键值
    * 第三方推送服务器管理的应用键值，通常需要在第三方推送服务器平台进行注册获取。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var appkey: js.UndefOr[String] = js.native
  
  /**
    * 推送服务令牌（设备唯一标识），用于标识推送信息接收者身份
    * 第三方推送服务器管理的设备唯一标识，在iOS平台此值通常与token不同；在其它平台此值通常与token值一致。
    *     此值与设备及应用都相关，即不同的apk/ipa安装到同一台设备上的值都不相同。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var clientid: js.UndefOr[String] = js.native
  
  /**
    * 设备令牌（iOS设备唯一标识），用于APNS服务推送中标识设备的身份
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
    */
  var token: js.UndefOr[String] = js.native
}
object PlusPushClientInfo {
  
  @scala.inline
  def apply(): PlusPushClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPushClientInfo]
  }
  
  @scala.inline
  implicit class PlusPushClientInfoOps[Self <: PlusPushClientInfo] (val x: Self) extends AnyVal {
    
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
    def setClientid(value: String): Self = this.set("clientid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientid: Self = this.set("clientid", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
