package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备特征值
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothcharacteristic extends StObject {
  
  /**
    * 设备特征值支持的操作类型
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var properties: js.UndefOr[PlusBluetoothBluetoothcharacteristicProperties] = js.undefined
  
  /**
    * 蓝牙设备特征值的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var uuid: js.UndefOr[String] = js.undefined
}
object PlusBluetoothBluetoothcharacteristic {
  
  inline def apply(): PlusBluetoothBluetoothcharacteristic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothcharacteristic]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusBluetoothBluetoothcharacteristic] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: PlusBluetoothBluetoothcharacteristicProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
