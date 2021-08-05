package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1WipeDeviceResponse extends StObject {
  
  /** Resultant Device object for the action. Note that asset tags will not be returned in the device object. */
  var device: js.UndefOr[GoogleAppsCloudidentityDevicesV1Device] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1WipeDeviceResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1WipeDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1WipeDeviceResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1WipeDeviceResponse](x: Self) {
    
    inline def setDevice(value: GoogleAppsCloudidentityDevicesV1Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
  }
}
