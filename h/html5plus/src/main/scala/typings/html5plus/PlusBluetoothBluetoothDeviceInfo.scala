package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothDeviceInfo extends StObject {
  
  /**
    * 蓝牙设备的信号强度
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var RSSI: js.UndefOr[String] = js.undefined
  
  /**
    * 蓝牙设备的广播数据段中的ManufacturerData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisData: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
  
  /**
    * 蓝牙设备的广播数据段中的ServiceUUIDs数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 蓝牙设备的id
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /**
    * 蓝牙设备的广播数据段中的LocalName数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var localName: js.UndefOr[String] = js.undefined
  
  /**
    * 蓝牙设备名称
    * 某些设备可能没有此字段值。
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * 蓝牙设备的广播数据段中的ServiceData数据段
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var serviceData: js.UndefOr[Any] = js.undefined
}
object PlusBluetoothBluetoothDeviceInfo {
  
  inline def apply(): PlusBluetoothBluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothDeviceInfo]
  }
  
  extension [Self <: PlusBluetoothBluetoothDeviceInfo](x: Self) {
    
    inline def setAdvertisData(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    inline def setAdvertisDataUndefined: Self = StObject.set(x, "advertisData", js.undefined)
    
    inline def setAdvertisServiceUUIDs(value: js.Array[Any]): Self = StObject.set(x, "advertisServiceUUIDs", value.asInstanceOf[js.Any])
    
    inline def setAdvertisServiceUUIDsUndefined: Self = StObject.set(x, "advertisServiceUUIDs", js.undefined)
    
    inline def setAdvertisServiceUUIDsVarargs(value: Any*): Self = StObject.set(x, "advertisServiceUUIDs", js.Array(value*))
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRSSI(value: String): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
    
    inline def setRSSIUndefined: Self = StObject.set(x, "RSSI", js.undefined)
    
    inline def setServiceData(value: Any): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
    
    inline def setServiceDataUndefined: Self = StObject.set(x, "serviceData", js.undefined)
  }
}
