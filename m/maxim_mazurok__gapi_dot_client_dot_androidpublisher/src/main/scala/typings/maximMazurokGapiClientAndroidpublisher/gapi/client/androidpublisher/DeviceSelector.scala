package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSelector extends StObject {
  
  /** Conditions on the device's RAM. */
  var deviceRam: js.UndefOr[DeviceRam] = js.undefined
  
  /** Device models excluded by this selector, even if they match all other conditions. */
  var excludedDeviceIds: js.UndefOr[js.Array[DeviceId]] = js.undefined
  
  /** A device that has any of these system features is excluded by this selector, even if it matches all other conditions. */
  var forbiddenSystemFeatures: js.UndefOr[js.Array[SystemFeature]] = js.undefined
  
  /** Device models included by this selector. */
  var includedDeviceIds: js.UndefOr[js.Array[DeviceId]] = js.undefined
  
  /** A device needs to have all these system features to be included by the selector. */
  var requiredSystemFeatures: js.UndefOr[js.Array[SystemFeature]] = js.undefined
}
object DeviceSelector {
  
  inline def apply(): DeviceSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSelector]
  }
  
  extension [Self <: DeviceSelector](x: Self) {
    
    inline def setDeviceRam(value: DeviceRam): Self = StObject.set(x, "deviceRam", value.asInstanceOf[js.Any])
    
    inline def setDeviceRamUndefined: Self = StObject.set(x, "deviceRam", js.undefined)
    
    inline def setExcludedDeviceIds(value: js.Array[DeviceId]): Self = StObject.set(x, "excludedDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setExcludedDeviceIdsUndefined: Self = StObject.set(x, "excludedDeviceIds", js.undefined)
    
    inline def setExcludedDeviceIdsVarargs(value: DeviceId*): Self = StObject.set(x, "excludedDeviceIds", js.Array(value*))
    
    inline def setForbiddenSystemFeatures(value: js.Array[SystemFeature]): Self = StObject.set(x, "forbiddenSystemFeatures", value.asInstanceOf[js.Any])
    
    inline def setForbiddenSystemFeaturesUndefined: Self = StObject.set(x, "forbiddenSystemFeatures", js.undefined)
    
    inline def setForbiddenSystemFeaturesVarargs(value: SystemFeature*): Self = StObject.set(x, "forbiddenSystemFeatures", js.Array(value*))
    
    inline def setIncludedDeviceIds(value: js.Array[DeviceId]): Self = StObject.set(x, "includedDeviceIds", value.asInstanceOf[js.Any])
    
    inline def setIncludedDeviceIdsUndefined: Self = StObject.set(x, "includedDeviceIds", js.undefined)
    
    inline def setIncludedDeviceIdsVarargs(value: DeviceId*): Self = StObject.set(x, "includedDeviceIds", js.Array(value*))
    
    inline def setRequiredSystemFeatures(value: js.Array[SystemFeature]): Self = StObject.set(x, "requiredSystemFeatures", value.asInstanceOf[js.Any])
    
    inline def setRequiredSystemFeaturesUndefined: Self = StObject.set(x, "requiredSystemFeatures", js.undefined)
    
    inline def setRequiredSystemFeaturesVarargs(value: SystemFeature*): Self = StObject.set(x, "requiredSystemFeatures", js.Array(value*))
  }
}
