package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomerRemoveConfigurationRequest extends StObject {
  
  /** Required. The device to remove the configuration from. */
  var device: js.UndefOr[DeviceReference] = js.native
}
object CustomerRemoveConfigurationRequest {
  
  @scala.inline
  def apply(): CustomerRemoveConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerRemoveConfigurationRequest]
  }
  
  @scala.inline
  implicit class CustomerRemoveConfigurationRequestMutableBuilder[Self <: CustomerRemoveConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: DeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
