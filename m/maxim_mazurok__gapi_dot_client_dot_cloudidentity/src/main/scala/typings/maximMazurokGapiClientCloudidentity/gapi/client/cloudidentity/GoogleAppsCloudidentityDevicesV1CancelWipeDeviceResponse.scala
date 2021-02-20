package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse extends StObject {
  
  /** Resultant Device object for the action. Note that asset tags will not be returned in the device object. */
  var device: js.UndefOr[GoogleAppsCloudidentityDevicesV1Device] = js.native
}
object GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: GoogleAppsCloudidentityDevicesV1Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
