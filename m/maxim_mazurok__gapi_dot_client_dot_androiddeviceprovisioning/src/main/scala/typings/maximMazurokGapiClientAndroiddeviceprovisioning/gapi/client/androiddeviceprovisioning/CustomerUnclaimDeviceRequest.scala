package typings.maximMazurokGapiClientAndroiddeviceprovisioning.gapi.client.androiddeviceprovisioning

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerUnclaimDeviceRequest extends StObject {
  
  /** Required. The device to unclaim. */
  var device: js.UndefOr[DeviceReference] = js.undefined
}
object CustomerUnclaimDeviceRequest {
  
  @scala.inline
  def apply(): CustomerUnclaimDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerUnclaimDeviceRequest]
  }
  
  @scala.inline
  implicit class CustomerUnclaimDeviceRequestMutableBuilder[Self <: CustomerUnclaimDeviceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: DeviceReference): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
