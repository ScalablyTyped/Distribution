package typings.html5plus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * iBeacon设备信息
  * 
  * 参考: [http://www.html5plus.org/doc/zh_cn/ibeacon.html](http://www.html5plus.org/doc/zh_cn/ibeacon.html)
  */
trait PlusIbeaconIBeaconInfo extends StObject {
  
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
  
  inline def apply(): PlusIbeaconIBeaconInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlusIbeaconIBeaconInfo]
  }
  
  extension [Self <: PlusIbeaconIBeaconInfo](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMajorUndefined: Self = StObject.set(x, "major", js.undefined)
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    inline def setMinorUndefined: Self = StObject.set(x, "minor", js.undefined)
    
    inline def setProximity(value: Double): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    inline def setProximityUndefined: Self = StObject.set(x, "proximity", js.undefined)
    
    inline def setRssi(value: String): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
    
    inline def setRssiUndefined: Self = StObject.set(x, "rssi", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
