package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1WipeDeviceResponse extends StObject {
  
  /** Resultant Device object for the action. Note that asset tags will not be returned in the device object. */
  var device: js.UndefOr[GoogleAppsCloudidentityDevicesV1Device] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1WipeDeviceResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1WipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1WipeDeviceResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1WipeDeviceResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1WipeDeviceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice(value: GoogleAppsCloudidentityDevicesV1Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
