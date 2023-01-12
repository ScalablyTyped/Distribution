package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON对象，获取的客户端标识信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/push.html](http://www.html5plus.org/doc/zh_cn/push.html)
  */
trait PlusPushClientInfo extends StObject {
  
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
    *     此值与设备及应用都相关，即不同的apk/ipa安装到同一台设备上的值都不相同。
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
  
  inline def apply(): PlusPushClientInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusPushClientInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusPushClientInfo] (val x: Self) extends AnyVal {
    
    inline def setAppid(value: String): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setAppidUndefined: Self = StObject.set(x, "appid", js.undefined)
    
    inline def setAppkey(value: String): Self = StObject.set(x, "appkey", value.asInstanceOf[js.Any])
    
    inline def setAppkeyUndefined: Self = StObject.set(x, "appkey", js.undefined)
    
    inline def setClientid(value: String): Self = StObject.set(x, "clientid", value.asInstanceOf[js.Any])
    
    inline def setClientidUndefined: Self = StObject.set(x, "clientid", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
