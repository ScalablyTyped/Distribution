package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse extends js.Object {
  
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
  implicit class GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponseOps[Self <: GoogleAppsCloudidentityDevicesV1ListDeviceUsersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeviceUsersVarargs(value: GoogleAppsCloudidentityDevicesV1DeviceUser*): Self = this.set("deviceUsers", js.Array(value :_*))
    
    @scala.inline
    def setDeviceUsers(value: js.Array[GoogleAppsCloudidentityDevicesV1DeviceUser]): Self = this.set("deviceUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceUsers: Self = this.set("deviceUsers", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
