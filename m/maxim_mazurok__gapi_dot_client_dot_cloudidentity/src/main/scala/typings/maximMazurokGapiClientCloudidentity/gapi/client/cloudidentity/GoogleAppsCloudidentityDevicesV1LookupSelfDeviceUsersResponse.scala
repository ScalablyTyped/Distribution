package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse extends StObject {
  
  /** The obfuscated customer Id that may be passed back to other Devices API methods such as List, Get, etc. */
  var customer: js.UndefOr[String] = js.undefined
  
  /**
    * [Resource names](https://cloud.google.com/apis/design/resource_names) of the DeviceUsers in the format: `devices/{device}/deviceUsers/{user_resource}`, where device is the unique ID
    * assigned to a Device and user_resource is the unique user ID
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse {
  
  inline def apply(): GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse]
  }
  
  extension [Self <: GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse](x: Self) {
    
    inline def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    inline def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
