package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerRemoveConfigurationRequest extends StObject {
  
  /** Required. The device to remove the configuration from. There are custom validations in RemoveConfigurationRequestValidator */
  var device: js.UndefOr[DeviceReference] = js.undefined
}
object CustomerRemoveConfigurationRequest {
  
  inline def apply(): CustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerRemoveConfigurationRequest]
  }
  
  extension [Self <: CustomerRemoveConfigurationRequest](x: Self) {
    
    inline def setDevice(value: DeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
