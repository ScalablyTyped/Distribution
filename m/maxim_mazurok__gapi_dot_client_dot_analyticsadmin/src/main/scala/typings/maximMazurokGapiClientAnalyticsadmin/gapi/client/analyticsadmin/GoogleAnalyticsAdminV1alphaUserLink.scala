package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaUserLink extends js.Object {
  
  /**
    * Roles directly assigned to this user for this account or property. Valid values: predefinedRoles/read predefinedRoles/collaborate predefinedRoles/edit predefinedRoles/manage-users
    * Excludes roles that are inherited from a higher-level entity, group, or organization admin role. A UserLink that is updated to have an empty list of direct_roles will be deleted.
    */
  var directRoles: js.UndefOr[js.Array[String]] = js.native
  
  /** Email address of the user to link */
  var emailAddress: js.UndefOr[String] = js.native
  
  /** Example format: properties/1234/userLinks/5678 */
  var name: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaUserLink {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaUserLink]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaUserLinkOps[Self <: GoogleAnalyticsAdminV1alphaUserLink] (val x: Self) extends AnyVal {
    
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
    def setDirectRolesVarargs(value: String*): Self = this.set("directRoles", js.Array(value :_*))
    
    @scala.inline
    def setDirectRoles(value: js.Array[String]): Self = this.set("directRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectRoles: Self = this.set("directRoles", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailAddress: Self = this.set("emailAddress", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
