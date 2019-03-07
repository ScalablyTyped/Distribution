package typings
package html5plusLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 蓝牙设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothDeviceInfo extends js.Object {
  /**
    * 蓝牙设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var RSSI: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 蓝牙设备的广播数据段中的ManufacturerData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisData: js.UndefOr[stdLib.ArrayBuffer] = js.undefined
  /**
    * 蓝牙设备的广播数据段中的ServiceUUIDs数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 蓝牙设备的id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 蓝牙设备的广播数据段中的LocalName数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var localName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 蓝牙设备名称
    * 某些设备可能没有此字段值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 蓝牙设备的广播数据段中的ServiceData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var serviceData: js.UndefOr[js.Any] = js.undefined
}

object PlusBluetoothBluetoothDeviceInfo {
  @scala.inline
  def apply(
    RSSI: java.lang.String = null,
    advertisData: stdLib.ArrayBuffer = null,
    advertisServiceUUIDs: js.Array[_] = null,
    deviceId: java.lang.String = null,
    localName: java.lang.String = null,
    name: java.lang.String = null,
    serviceData: js.Any = null
  ): PlusBluetoothBluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (RSSI != null) __obj.updateDynamic("RSSI")(RSSI)
    if (advertisData != null) __obj.updateDynamic("advertisData")(advertisData)
    if (advertisServiceUUIDs != null) __obj.updateDynamic("advertisServiceUUIDs")(advertisServiceUUIDs)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (localName != null) __obj.updateDynamic("localName")(localName)
    if (name != null) __obj.updateDynamic("name")(name)
    if (serviceData != null) __obj.updateDynamic("serviceData")(serviceData)
    __obj.asInstanceOf[PlusBluetoothBluetoothDeviceInfo]
  }
}

