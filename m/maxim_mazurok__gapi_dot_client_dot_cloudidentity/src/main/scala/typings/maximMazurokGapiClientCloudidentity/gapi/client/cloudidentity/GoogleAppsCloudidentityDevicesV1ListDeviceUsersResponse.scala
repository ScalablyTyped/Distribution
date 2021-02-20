package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse extends StObject {
  
  /** Devices meeting the list restrictions. */
  var deviceUsers: js.UndefOr[js.Array[GoogleAppsCloudidentityDevicesV1DeviceUser]] = js.native
  
  /** Token to retrieve the next page of results. Empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponseMutableBuilder[Self <: GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceUsers(value: js.Array[GoogleAppsCloudidentityDevicesV1DeviceUser]): Self = StObject.set(x, "deviceUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUsersUndefined: Self = StObject.set(x, "deviceUsers", js.undefined)
    
    @scala.inline
    def setDeviceUsersVarargs(value: GoogleAppsCloudidentityDevicesV1DeviceUser*): Self = StObject.set(x, "deviceUsers", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
