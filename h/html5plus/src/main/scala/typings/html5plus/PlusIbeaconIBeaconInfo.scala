package typings.html5plus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * iBeacon设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
  */
trait PlusIbeaconIBeaconInfo extends js.Object {
  /**
    * iBeacon设备的距离精度信息
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  /**
    * iBeacon设备的主id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var major: js.UndefOr[String] = js.undefined
  /**
    * iBeacon设备的次id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var minor: js.UndefOr[String] = js.undefined
  /**
    * iBeacon设备的距离
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var proximity: js.UndefOr[Double] = js.undefined
  /**
    * iBeacon设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var rssi: js.UndefOr[String] = js.undefined
  /**
    * iBeacon设备广播的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var uuid: js.UndefOr[String] = js.undefined
}

object PlusIbeaconIBeaconInfo {
  @scala.inline
  def apply(
    accuracy: Int | Double = null,
    major: String = null,
    minor: String = null,
    proximity: Int | Double = null,
    rssi: String = null,
    uuid: String = null
  ): PlusIbeaconIBeaconInfo = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major.asInstanceOf[js.Any])
    if (minor != null) __obj.updateDynamic("minor")(minor.asInstanceOf[js.Any])
    if (proximity != null) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    if (rssi != null) __obj.updateDynamic("rssi")(rssi.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlusIbeaconIBeaconInfo]
  }
}

