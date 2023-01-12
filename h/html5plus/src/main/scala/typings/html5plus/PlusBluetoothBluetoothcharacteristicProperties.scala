package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 蓝牙设备特征值支持的操作类型
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
  */
trait PlusBluetoothBluetoothcharacteristicProperties extends StObject {
  
  /**
    * 特征值是否支持indicate操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var indicate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 特征值是否支持notify操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  @JSName("notify")
  var notify_FPlusBluetoothBluetoothcharacteristicProperties: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 特征值是否支持read操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var read: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 特征值是否支持write操作
    * 
    * 参考: [http://www.html5plus.org/doc/zh_cn/bluetooth.html](http://www.html5plus.org/doc/zh_cn/bluetooth.html)
    */
  var write: js.UndefOr[Boolean] = js.undefined
}
object PlusBluetoothBluetoothcharacteristicProperties {
  
  inline def apply(): PlusBluetoothBluetoothcharacteristicProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusBluetoothBluetoothcharacteristicProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlusBluetoothBluetoothcharacteristicProperties] (val x: Self) extends AnyVal {
    
    inline def setIndicate(value: Boolean): Self = StObject.set(x, "indicate", value.asInstanceOf[js.Any])
    
    inline def setIndicateUndefined: Self = StObject.set(x, "indicate", js.undefined)
    
    inline def setNotify_(value: Boolean): Self = StObject.set(x, "notify", value.asInstanceOf[js.Any])
    
    inline def setNotify_Undefined: Self = StObject.set(x, "notify", js.undefined)
    
    inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    inline def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
  }
}
