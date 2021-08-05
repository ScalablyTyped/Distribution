package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceReference extends StObject {
  
  /** The ID of the device. */
  var deviceId: js.UndefOr[String] = js.undefined
  
  /** The hardware IDs of the device. */
  var deviceIdentifier: js.UndefOr[DeviceIdentifier] = js.undefined
}
object DeviceReference {
  
  inline def apply(): DeviceReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceReference]
  }
  
  extension [Self <: DeviceReference](x: Self) {
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setDeviceIdentifier(value: DeviceIdentifier): Self = StObject.set(x, "deviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdentifierUndefined: Self = StObject.set(x, "deviceIdentifier", js.undefined)
  }
}
