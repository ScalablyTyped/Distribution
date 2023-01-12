package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 运行环境权限类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
trait PlusNavigatorPermissionNames extends StObject {
  
  /**
    * 访问摄像头权限
    * 用于调用摄像头（plus.camera.*、plus.barcode.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var CAMERA: js.UndefOr[String] = js.undefined
  
  /**
    * 访问系统联系人权限
    * 用于访问（读、写）系统通讯录（plus.gallery.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var CONTACTS: js.UndefOr[String] = js.undefined
  
  /**
    * 访问系统相册权限
    * 用于访问（读、写）系统相册（plus.gallery.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var GALLERY: js.UndefOr[String] = js.undefined
  
  /**
    * 定位权限
    * 用于获取当前用户位置信息（plus.geolocation.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var LOCATION: js.UndefOr[String] = js.undefined
  
  /**
    * 消息通知权限
    * 用于接收系统消息通知（plus.push.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var NOTIFITION: js.UndefOr[String] = js.undefined
  
  /**
    * 录音权限
    * 用于进行本地录音操作（plus.audio.AudioRecorder）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var RECORD: js.UndefOr[String] = js.undefined
  
  /**
    * 创建桌面快捷方式权限
    * 用于在系统桌面创建快捷方式图标（plus.navigator.createShortcut）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var SHORTCUT: js.UndefOr[String] = js.undefined
}
object PlusNavigatorPermissionNames {
  
  inline def apply(): PlusNavigatorPermissionNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNavigatorPermissionNames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusNavigatorPermissionNames] (val x: Self) extends AnyVal {
    
    inline def setCAMERA(value: String): Self = StObject.set(x, "CAMERA", value.asInstanceOf[js.Any])
    
    inline def setCAMERAUndefined: Self = StObject.set(x, "CAMERA", js.undefined)
    
    inline def setCONTACTS(value: String): Self = StObject.set(x, "CONTACTS", value.asInstanceOf[js.Any])
    
    inline def setCONTACTSUndefined: Self = StObject.set(x, "CONTACTS", js.undefined)
    
    inline def setGALLERY(value: String): Self = StObject.set(x, "GALLERY", value.asInstanceOf[js.Any])
    
    inline def setGALLERYUndefined: Self = StObject.set(x, "GALLERY", js.undefined)
    
    inline def setLOCATION(value: String): Self = StObject.set(x, "LOCATION", value.asInstanceOf[js.Any])
    
    inline def setLOCATIONUndefined: Self = StObject.set(x, "LOCATION", js.undefined)
    
    inline def setNOTIFITION(value: String): Self = StObject.set(x, "NOTIFITION", value.asInstanceOf[js.Any])
    
    inline def setNOTIFITIONUndefined: Self = StObject.set(x, "NOTIFITION", js.undefined)
    
    inline def setRECORD(value: String): Self = StObject.set(x, "RECORD", value.asInstanceOf[js.Any])
    
    inline def setRECORDUndefined: Self = StObject.set(x, "RECORD", js.undefined)
    
    inline def setSHORTCUT(value: String): Self = StObject.set(x, "SHORTCUT", value.asInstanceOf[js.Any])
    
    inline def setSHORTCUTUndefined: Self = StObject.set(x, "SHORTCUT", js.undefined)
  }
}
