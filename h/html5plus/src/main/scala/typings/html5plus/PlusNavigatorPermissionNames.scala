package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 运行环境权限类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
  */
@js.native
trait PlusNavigatorPermissionNames extends js.Object {
  /**
    * 访问摄像头权限
    * 用于调用摄像头（plus.camera.*、plus.barcode.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var CAMERA: js.UndefOr[String] = js.native
  /**
    * 访问系统联系人权限
    * 用于访问（读、写）系统通讯录（plus.gallery.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var CONTACTS: js.UndefOr[String] = js.native
  /**
    * 访问系统相册权限
    * 用于访问（读、写）系统相册（plus.gallery.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var GALLERY: js.UndefOr[String] = js.native
  /**
    * 定位权限
    * 用于获取当前用户位置信息（plus.geolocation.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var LOCATION: js.UndefOr[String] = js.native
  /**
    * 消息通知权限
    * 用于接收系统消息通知（plus.push.*）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var NOTIFITION: js.UndefOr[String] = js.native
  /**
    * 录音权限
    * 用于进行本地录音操作（plus.audio.AudioRecorder）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var RECORD: js.UndefOr[String] = js.native
  /**
    * 创建桌面快捷方式权限
    * 用于在系统桌面创建快捷方式图标（plus.navigator.createShortcut）。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/navigator.html](http://www.html5plus.org/doc/zh_cn/navigator.html)
    */
  var SHORTCUT: js.UndefOr[String] = js.native
}

object PlusNavigatorPermissionNames {
  @scala.inline
  def apply(): PlusNavigatorPermissionNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusNavigatorPermissionNames]
  }
  @scala.inline
  implicit class PlusNavigatorPermissionNamesOps[Self <: PlusNavigatorPermissionNames] (val x: Self) extends AnyVal {
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
    def setCAMERA(value: String): Self = this.set("CAMERA", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCAMERA: Self = this.set("CAMERA", js.undefined)
    @scala.inline
    def setCONTACTS(value: String): Self = this.set("CONTACTS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCONTACTS: Self = this.set("CONTACTS", js.undefined)
    @scala.inline
    def setGALLERY(value: String): Self = this.set("GALLERY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGALLERY: Self = this.set("GALLERY", js.undefined)
    @scala.inline
    def setLOCATION(value: String): Self = this.set("LOCATION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLOCATION: Self = this.set("LOCATION", js.undefined)
    @scala.inline
    def setNOTIFITION(value: String): Self = this.set("NOTIFITION", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNOTIFITION: Self = this.set("NOTIFITION", js.undefined)
    @scala.inline
    def setRECORD(value: String): Self = this.set("RECORD", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRECORD: Self = this.set("RECORD", js.undefined)
    @scala.inline
    def setSHORTCUT(value: String): Self = this.set("SHORTCUT", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSHORTCUT: Self = this.set("SHORTCUT", js.undefined)
  }
  
}

