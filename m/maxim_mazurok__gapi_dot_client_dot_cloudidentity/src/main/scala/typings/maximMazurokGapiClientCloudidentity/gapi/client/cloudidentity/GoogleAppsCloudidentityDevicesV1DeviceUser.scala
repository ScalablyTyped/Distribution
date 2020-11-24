package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1DeviceUser extends js.Object {
  
  /** Compromised State of the DeviceUser object */
  var compromisedState: js.UndefOr[String] = js.native
  
  /** When the user first signed in to the device */
  var createTime: js.UndefOr[String] = js.native
  
  /** Output only. Most recent time when user registered with this service. */
  var firstSyncTime: js.UndefOr[String] = js.native
  
  /** Output only. Default locale used on device, in IETF BCP-47 format. */
  var languageCode: js.UndefOr[String] = js.native
  
  /** Output only. Last time when user synced with policies. */
  var lastSyncTime: js.UndefOr[String] = js.native
  
  /** Output only. Management state of the user on the device. */
  var managementState: js.UndefOr[String] = js.native
  
  /**
    * Output only. [Resource name](https://cloud.google.com/apis/design/resource_names) of the DeviceUser in format: `devices/{device_id}/deviceUsers/{user_id}`, where user_id is the ID
    * of the user associated with the user session.
    */
  var name: js.UndefOr[String] = js.native
  
  /** Password state of the DeviceUser object */
  var passwordState: js.UndefOr[String] = js.native
  
  /** Output only. User agent on the device for this specific user */
  var userAgent: js.UndefOr[String] = js.native
  
  /** Email address of the user registered on the device. */
  var userEmail: js.UndefOr[String] = js.native
}
object GoogleAppsCloudidentityDevicesV1DeviceUser {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1DeviceUser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1DeviceUser]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1DeviceUserOps[Self <: GoogleAppsCloudidentityDevicesV1DeviceUser] (val x: Self) extends AnyVal {
    
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
    def setCompromisedState(value: String): Self = this.set("compromisedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompromisedState: Self = this.set("compromisedState", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setFirstSyncTime(value: String): Self = this.set("firstSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstSyncTime: Self = this.set("firstSyncTime", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setLastSyncTime(value: String): Self = this.set("lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastSyncTime: Self = this.set("lastSyncTime", js.undefined)
    
    @scala.inline
    def setManagementState(value: String): Self = this.set("managementState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManagementState: Self = this.set("managementState", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPasswordState(value: String): Self = this.set("passwordState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasswordState: Self = this.set("passwordState", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    
    @scala.inline
    def setUserEmail(value: String): Self = this.set("userEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEmail: Self = this.set("userEmail", js.undefined)
  }
}
