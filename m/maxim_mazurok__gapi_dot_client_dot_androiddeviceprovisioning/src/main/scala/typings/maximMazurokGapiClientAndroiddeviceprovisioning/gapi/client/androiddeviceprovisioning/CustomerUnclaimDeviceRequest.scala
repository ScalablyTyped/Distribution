package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerUnclaimDeviceRequest extends StObject {
  
  /** Required. The device to unclaim. There are custom validations in UnclaimDeviceRequestValidator. */
  var device: js.UndefOr[DeviceReference] = js.undefined
}
object CustomerUnclaimDeviceRequest {
  
  inline def apply(): CustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerUnclaimDeviceRequest]
  }
  
  extension [Self <: CustomerUnclaimDeviceRequest](x: Self) {
    
    inline def setDevice(value: DeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
