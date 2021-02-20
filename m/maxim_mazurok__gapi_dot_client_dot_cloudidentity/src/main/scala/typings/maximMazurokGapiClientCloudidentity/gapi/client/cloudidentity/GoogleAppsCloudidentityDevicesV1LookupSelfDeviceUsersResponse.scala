package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse extends StObject {
  
  /** The obfuscated customer Id that may be passed back to other Devices API methods such as List, Get, etc. */
  var customer: js.UndefOr[String] = js.native
  
  /**
    * [Resource names](https://cloud.google.com/apis/design/resource_names) of the DeviceUsers in the format: `devices/{device_id}/deviceUsers/{user_resource_id}`, where device_id is the
    * unique ID assigned to a Device and user_resource_id is the unique user ID
    */
  var names: js.UndefOr[js.Array[String]] = js.native
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1LookupSelfDeviceUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomer(value: String): Self = StObject.set(x, "customer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerUndefined: Self = StObject.set(x, "customer", js.undefined)
    
    @scala.inline
    def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    @scala.inline
    def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
