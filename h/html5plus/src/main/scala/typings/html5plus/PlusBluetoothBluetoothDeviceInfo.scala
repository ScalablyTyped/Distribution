package typings.html5plus

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
@js.native
trait PlusBluetoothBluetoothDeviceInfo extends js.Object {
  
  /**
    * 蓝牙设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var RSSI: js.UndefOr[String] = js.native
  
  /**
    * 蓝牙设备的广播数据段中的ManufacturerData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisData: js.UndefOr[ArrayBuffer] = js.native
  
  /**
    * 蓝牙设备的广播数据段中的ServiceUUIDs数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * 蓝牙设备的id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var deviceId: js.UndefOr[String] = js.native
  
  /**
    * 蓝牙设备的广播数据段中的LocalName数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var localName: js.UndefOr[String] = js.native
  
  /**
    * 蓝牙设备名称
    * 某些设备可能没有此字段值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * 蓝牙设备的广播数据段中的ServiceData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var serviceData: js.UndefOr[js.Any] = js.native
}
object PlusBluetoothBluetoothDeviceInfo {
  
  @scala.inline
  def apply(): PlusBluetoothBluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothDeviceInfo]
  }
  
  @scala.inline
  implicit class PlusBluetoothBluetoothDeviceInfoOps[Self <: PlusBluetoothBluetoothDeviceInfo] (val x: Self) extends AnyVal {
    
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
    def setRSSI(value: String): Self = this.set("RSSI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRSSI: Self = this.set("RSSI", js.undefined)
    
    @scala.inline
    def setAdvertisData(value: ArrayBuffer): Self = this.set("advertisData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisData: Self = this.set("advertisData", js.undefined)
    
    @scala.inline
    def setAdvertisServiceUUIDsVarargs(value: js.Any*): Self = this.set("advertisServiceUUIDs", js.Array(value :_*))
    
    @scala.inline
    def setAdvertisServiceUUIDs(value: js.Array[_]): Self = this.set("advertisServiceUUIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisServiceUUIDs: Self = this.set("advertisServiceUUIDs", js.undefined)
    
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalName: Self = this.set("localName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setServiceData(value: js.Any): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceData: Self = this.set("serviceData", js.undefined)
  }
}
