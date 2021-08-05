package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备服务信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothService extends StObject {
  
  /**
    * 是否为设备的主服务
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 蓝牙设备服务的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var uuid: js.UndefOr[String] = js.undefined
}
object PlusBluetoothBluetoothService {
  
  inline def apply(): PlusBluetoothBluetoothService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothService]
  }
  
  extension [Self <: PlusBluetoothBluetoothService](x: Self) {
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
