package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleAnalyticsAdminV1alphaUserLink extends StObject {
  
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
  implicit class GoogleAnalyticsAdminV1alphaUserLinkMutableBuilder[Self <: GoogleAnalyticsAdminV1alphaUserLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectRoles(value: js.Array[String]): Self = StObject.set(x, "directRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectRolesUndefined: Self = StObject.set(x, "directRoles", js.undefined)
    
    @scala.inline
    def setDirectRolesVarargs(value: String*): Self = StObject.set(x, "directRoles", js.Array(value :_*))
    
    @scala.inline
    def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
