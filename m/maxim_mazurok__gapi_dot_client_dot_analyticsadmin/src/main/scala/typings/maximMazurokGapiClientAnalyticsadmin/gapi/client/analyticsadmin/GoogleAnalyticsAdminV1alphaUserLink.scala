package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaUserLink extends StObject {
  
  /**
    * Roles directly assigned to this user for this account or property. Valid values: predefinedRoles/viewer predefinedRoles/analyst predefinedRoles/editor predefinedRoles/admin
    * predefinedRoles/no-cost-data predefinedRoles/no-revenue-data Excludes roles that are inherited from a higher-level entity, group, or organization admin role. A UserLink that is
    * updated to have an empty list of direct_roles will be deleted.
    */
  var directRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Immutable. Email address of the user to link */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** Output only. Example format: properties/1234/userLinks/5678 */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaUserLink {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaUserLink]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaUserLink] (val x: Self) extends AnyVal {
    
    inline def setDirectRoles(value: js.Array[String]): Self = StObject.set(x, "directRoles", value.asInstanceOf[js.Any])
    
    inline def setDirectRolesUndefined: Self = StObject.set(x, "directRoles", js.undefined)
    
    inline def setDirectRolesVarargs(value: String*): Self = StObject.set(x, "directRoles", js.Array(value*))
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
