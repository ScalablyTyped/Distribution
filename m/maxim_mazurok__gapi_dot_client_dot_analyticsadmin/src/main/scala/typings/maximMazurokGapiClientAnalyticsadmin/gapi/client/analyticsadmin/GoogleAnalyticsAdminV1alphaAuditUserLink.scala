package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAuditUserLink extends StObject {
  
  /**
    * Roles directly assigned to this user for this entity. Format: predefinedRoles/read Excludes roles that are inherited from an account (if this is for a property), group, or
    * organization admin role.
    */
  var directRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Union of all permissions a user has at this account or property (includes direct permissions, group-inherited permissions, etc.). Format: predefinedRoles/read */
  var effectiveRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Email address of the linked user */
  var emailAddress: js.UndefOr[String] = js.undefined
  
  /** Example format: properties/1234/userLinks/5678 */
  var name: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAuditUserLink {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAuditUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAuditUserLink]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAuditUserLink](x: Self) {
    
    inline def setDirectRoles(value: js.Array[String]): Self = StObject.set(x, "directRoles", value.asInstanceOf[js.Any])
    
    inline def setDirectRolesUndefined: Self = StObject.set(x, "directRoles", js.undefined)
    
    inline def setDirectRolesVarargs(value: String*): Self = StObject.set(x, "directRoles", js.Array(value :_*))
    
    inline def setEffectiveRoles(value: js.Array[String]): Self = StObject.set(x, "effectiveRoles", value.asInstanceOf[js.Any])
    
    inline def setEffectiveRolesUndefined: Self = StObject.set(x, "effectiveRoles", js.undefined)
    
    inline def setEffectiveRolesVarargs(value: String*): Self = StObject.set(x, "effectiveRoles", js.Array(value :_*))
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
