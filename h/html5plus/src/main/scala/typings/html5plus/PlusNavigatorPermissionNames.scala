package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 运行环境权限类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
trait PlusNavigatorPermissionNames extends js.Object {
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
  @scala.inline
  def apply(
    CAMERA: String = null,
    CONTACTS: String = null,
    GALLERY: String = null,
    LOCATION: String = null,
    NOTIFITION: String = null,
    RECORD: String = null,
    SHORTCUT: String = null
  ): PlusNavigatorPermissionNames = {
    val __obj = js.Dynamic.literal()
    if (CAMERA != null) __obj.updateDynamic("CAMERA")(CAMERA)
    if (CONTACTS != null) __obj.updateDynamic("CONTACTS")(CONTACTS)
    if (GALLERY != null) __obj.updateDynamic("GALLERY")(GALLERY)
    if (LOCATION != null) __obj.updateDynamic("LOCATION")(LOCATION)
    if (NOTIFITION != null) __obj.updateDynamic("NOTIFITION")(NOTIFITION)
    if (RECORD != null) __obj.updateDynamic("RECORD")(RECORD)
    if (SHORTCUT != null) __obj.updateDynamic("SHORTCUT")(SHORTCUT)
    __obj.asInstanceOf[PlusNavigatorPermissionNames]
  }
}

