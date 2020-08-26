package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iBeacon设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
  */
@js.native
trait PlusIbeaconIBeaconInfo extends js.Object {
  /**
    * iBeacon设备的距离精度信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var accuracy: js.UndefOr[Double] = js.native
  /**
    * iBeacon设备的主id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var major: js.UndefOr[String] = js.native
  /**
    * iBeacon设备的次id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var minor: js.UndefOr[String] = js.native
  /**
    * iBeacon设备的距离
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var proximity: js.UndefOr[Double] = js.native
  /**
    * iBeacon设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var rssi: js.UndefOr[String] = js.native
  /**
    * iBeacon设备广播的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var uuid: js.UndefOr[String] = js.native
}

object PlusIbeaconIBeaconInfo {
  @scala.inline
  def apply(): PlusIbeaconIBeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIbeaconIBeaconInfo]
  }
  @scala.inline
  implicit class PlusIbeaconIBeaconInfoOps[Self <: PlusIbeaconIBeaconInfo] (val x: Self) extends AnyVal {
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
    def setAccuracy(value: Double): Self = this.set("accuracy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccuracy: Self = this.set("accuracy", js.undefined)
    @scala.inline
    def setMajor(value: String): Self = this.set("major", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMajor: Self = this.set("major", js.undefined)
    @scala.inline
    def setMinor(value: String): Self = this.set("minor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinor: Self = this.set("minor", js.undefined)
    @scala.inline
    def setProximity(value: Double): Self = this.set("proximity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProximity: Self = this.set("proximity", js.undefined)
    @scala.inline
    def setRssi(value: String): Self = this.set("rssi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRssi: Self = this.set("rssi", js.undefined)
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
  
}

