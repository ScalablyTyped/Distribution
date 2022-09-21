package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceTierConfig extends StObject {
  
  /** Definition of device groups for the app. */
  var deviceGroups: js.UndefOr[js.Array[DeviceGroup]] = js.undefined
  
  /** Output only. The device tier config ID. */
  var deviceTierConfigId: js.UndefOr[String] = js.undefined
  
  /** Definition of the set of device tiers for the app. */
  var deviceTierSet: js.UndefOr[DeviceTierSet] = js.undefined
}
object DeviceTierConfig {
  
  inline def apply(): DeviceTierConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceTierConfig]
  }
  
  extension [Self <: DeviceTierConfig](x: Self) {
    
    inline def setDeviceGroups(value: js.Array[DeviceGroup]): Self = StObject.set(x, "deviceGroups", value.asInstanceOf[js.Any])
    
    inline def setDeviceGroupsUndefined: Self = StObject.set(x, "deviceGroups", js.undefined)
    
    inline def setDeviceGroupsVarargs(value: DeviceGroup*): Self = StObject.set(x, "deviceGroups", js.Array(value*))
    
    inline def setDeviceTierConfigId(value: String): Self = StObject.set(x, "deviceTierConfigId", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierConfigIdUndefined: Self = StObject.set(x, "deviceTierConfigId", js.undefined)
    
    inline def setDeviceTierSet(value: DeviceTierSet): Self = StObject.set(x, "deviceTierSet", value.asInstanceOf[js.Any])
    
    inline def setDeviceTierSetUndefined: Self = StObject.set(x, "deviceTierSet", js.undefined)
  }
}
