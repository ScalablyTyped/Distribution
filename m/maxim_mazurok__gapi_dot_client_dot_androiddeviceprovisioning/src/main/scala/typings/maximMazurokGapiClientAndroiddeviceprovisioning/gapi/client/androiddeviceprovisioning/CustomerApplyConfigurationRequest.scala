package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerApplyConfigurationRequest extends StObject {
  
  /** Required. The configuration applied to the device in the format `customers/[CUSTOMER_ID]/configurations/[CONFIGURATION_ID]`. */
  var configuration: js.UndefOr[String] = js.undefined
  
  /** Required. The device the configuration is applied to. */
  var device: js.UndefOr[DeviceReference] = js.undefined
}
object CustomerApplyConfigurationRequest {
  
  inline def apply(): CustomerApplyConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerApplyConfigurationRequest]
  }
  
  extension [Self <: CustomerApplyConfigurationRequest](x: Self) {
    
    inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
    
    inline def setDevice(value: DeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
