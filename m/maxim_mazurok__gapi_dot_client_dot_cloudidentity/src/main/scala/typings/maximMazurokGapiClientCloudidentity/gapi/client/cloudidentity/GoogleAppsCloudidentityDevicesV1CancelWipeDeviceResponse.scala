package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse extends StObject {
  
  /** Resultant Device object for the action. Note that asset tags will not be returned in the device object. */
  var device: js.UndefOr[GoogleAppsCloudidentityDevicesV1Device] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1CancelWipeDeviceResponse](x: Self) {
    
    inline def setDevice(value: GoogleAppsCloudidentityDevicesV1Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
