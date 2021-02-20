package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备服务信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
@js.native
trait PlusBluetoothBluetoothService extends StObject {
  
  /**
    * 是否为设备的主服务
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
  
  /**
    * 蓝牙设备服务的uuid
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var uuid: js.UndefOr[String] = js.native
}
object PlusBluetoothBluetoothService {
  
  @scala.inline
  def apply(): PlusBluetoothBluetoothService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothService]
  }
  
  @scala.inline
  implicit class PlusBluetoothBluetoothServiceMutableBuilder[Self <: PlusBluetoothBluetoothService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
