package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAnalyticsAdminV1alphaAuditUserLink extends StObject {
  
  /**
    * Roles directly assigned to this user for this entity. Format: predefinedRoles/viewer Excludes roles that are inherited from an account (if this is for a property), group, or organization admin role.
    */
  var directRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Union of all permissions a user has at this account or property (includes direct permissions, group-inherited permissions, etc.). Format: predefinedRoles/viewer
    */
  var effectiveRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Email address of the linked user
    */
  var emailAddress: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Example format: properties/1234/userLinks/5678
    */
  var name: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAnalyticsAdminV1alphaAuditUserLink {
  
  inline def apply(): SchemaGoogleAnalyticsAdminV1alphaAuditUserLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAnalyticsAdminV1alphaAuditUserLink]
  }
  
  extension [Self <: SchemaGoogleAnalyticsAdminV1alphaAuditUserLink](x: Self) {
    
    inline def setDirectRoles(value: js.Array[String]): Self = StObject.set(x, "directRoles", value.asInstanceOf[js.Any])
    
    inline def setDirectRolesNull: Self = StObject.set(x, "directRoles", null)
    
    inline def setDirectRolesUndefined: Self = StObject.set(x, "directRoles", js.undefined)
    
    inline def setDirectRolesVarargs(value: String*): Self = StObject.set(x, "directRoles", js.Array(value*))
    
    inline def setEffectiveRoles(value: js.Array[String]): Self = StObject.set(x, "effectiveRoles", value.asInstanceOf[js.Any])
    
    inline def setEffectiveRolesNull: Self = StObject.set(x, "effectiveRoles", null)
    
    inline def setEffectiveRolesUndefined: Self = StObject.set(x, "effectiveRoles", js.undefined)
    
    inline def setEffectiveRolesVarargs(value: String*): Self = StObject.set(x, "effectiveRoles", js.Array(value*))
    
    inline def setEmailAddress(value: String): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
