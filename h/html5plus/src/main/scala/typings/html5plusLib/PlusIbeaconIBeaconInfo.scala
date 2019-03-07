package typings
package html5plusLib

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
  var accuracy: js.UndefOr[scala.Double] = js.undefined
  /**
    * iBeacon设备的主id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var major: js.UndefOr[java.lang.String] = js.undefined
  /**
    * iBeacon设备的次id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var minor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * iBeacon设备的距离
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var proximity: js.UndefOr[scala.Double] = js.undefined
  /**
    * iBeacon设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var rssi: js.UndefOr[java.lang.String] = js.undefined
  /**
    * iBeacon设备广播的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
    */
  var uuid: js.UndefOr[java.lang.String] = js.undefined
}

object PlusIbeaconIBeaconInfo {
  @scala.inline
  def apply(
    accuracy: scala.Int | scala.Double = null,
    major: java.lang.String = null,
    minor: java.lang.String = null,
    proximity: scala.Int | scala.Double = null,
    rssi: java.lang.String = null,
    uuid: java.lang.String = null
  ): PlusIbeaconIBeaconInfo = {
    val __obj = js.Dynamic.literal()
    if (accuracy != null) __obj.updateDynamic("accuracy")(accuracy.asInstanceOf[js.Any])
    if (major != null) __obj.updateDynamic("major")(major)
    if (minor != null) __obj.updateDynamic("minor")(minor)
    if (proximity != null) __obj.updateDynamic("proximity")(proximity.asInstanceOf[js.Any])
    if (rssi != null) __obj.updateDynamic("rssi")(rssi)
    if (uuid != null) __obj.updateDynamic("uuid")(uuid)
    __obj.asInstanceOf[PlusIbeaconIBeaconInfo]
  }
}

