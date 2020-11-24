package typings.maximMazurokGapiClientCloudidentity.gapi.client.cloudidentity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAppsCloudidentityDevicesV1AndroidAttributes extends js.Object {
  
  /** Whether applications from unknown sources can be installed on device. */
  var enabledUnknownSources: js.UndefOr[Boolean] = js.native
  
  /** Whether this account is on an owner/primary profile. For phones, only true for owner profiles. Android 4+ devices can have secondary or restricted user profiles. */
  var ownerProfileAccount: js.UndefOr[Boolean] = js.native
  
  /** Ownership privileges on device. */
  var ownershipPrivilege: js.UndefOr[String] = js.native
  
  /** Whether device supports Android work profiles. If false, this service will not block access to corp data even if an administrator turns on the "Enforce Work Profile" policy. */
  var supportsWorkProfile: js.UndefOr[Boolean] = js.native
}
object GoogleAppsCloudidentityDevicesV1AndroidAttributes {
  
  @scala.inline
  def apply(): GoogleAppsCloudidentityDevicesV1AndroidAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAppsCloudidentityDevicesV1AndroidAttributes]
  }
  
  @scala.inline
  implicit class GoogleAppsCloudidentityDevicesV1AndroidAttributesOps[Self <: GoogleAppsCloudidentityDevicesV1AndroidAttributes] (val x: Self) extends AnyVal {
    
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
    def setEnabledUnknownSources(value: Boolean): Self = this.set("enabledUnknownSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabledUnknownSources: Self = this.set("enabledUnknownSources", js.undefined)
    
    @scala.inline
    def setOwnerProfileAccount(value: Boolean): Self = this.set("ownerProfileAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerProfileAccount: Self = this.set("ownerProfileAccount", js.undefined)
    
    @scala.inline
    def setOwnershipPrivilege(value: String): Self = this.set("ownershipPrivilege", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnershipPrivilege: Self = this.set("ownershipPrivilege", js.undefined)
    
    @scala.inline
    def setSupportsWorkProfile(value: Boolean): Self = this.set("supportsWorkProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsWorkProfile: Self = this.set("supportsWorkProfile", js.undefined)
  }
}
