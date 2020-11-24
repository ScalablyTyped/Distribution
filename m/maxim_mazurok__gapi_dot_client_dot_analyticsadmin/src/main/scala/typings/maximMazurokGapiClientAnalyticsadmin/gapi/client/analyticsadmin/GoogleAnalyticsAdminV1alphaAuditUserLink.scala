package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaAuditUserLink extends js.Object {
  
  /**
    * Roles directly assigned to this user for this entity. Format: predefinedRoles/read Excludes roles that are inherited from an account (if this is for a property), group, or
    * organization admin role.
    */
  var directRoles: js.UndefOr[js.Array[String]] = js.native
  
  /** Union of all permissions a user has at this account or property (includes direct permissions, group-inherited permissions, etc.). Format: predefinedRoles/read */
  var effectiveRoles: js.UndefOr[js.Array[String]] = js.native
  
  /** Email address of the linked user */
  var emailAddress: js.UndefOr[String] = js.native
  
  /** Example format: properties/1234/userLinks/5678 */
  var name: js.UndefOr[String] = js.native
}
object GoogleAnalyticsAdminV1alphaAuditUserLink {
  
  @scala.inline
  def apply(): GoogleAnalyticsAdminV1alphaAuditUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAuditUserLink]
  }
  
  @scala.inline
  implicit class GoogleAnalyticsAdminV1alphaAuditUserLinkOps[Self <: GoogleAnalyticsAdminV1alphaAuditUserLink] (val x: Self) extends AnyVal {
    
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
    def setEffectiveRolesVarargs(value: String*): Self = this.set("effectiveRoles", js.Array(value :_*))
    
    @scala.inline
    def setEffectiveRoles(value: js.Array[String]): Self = this.set("effectiveRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveRoles: Self = this.set("effectiveRoles", js.undefined)
    
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
