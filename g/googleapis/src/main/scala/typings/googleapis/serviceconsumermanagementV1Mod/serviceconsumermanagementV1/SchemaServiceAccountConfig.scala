package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceAccountConfig extends StObject {
  
  /**
    * ID of the IAM service account to be created in tenant project. The email format of the service account is "@.iam.gserviceaccount.com". This account ID must be unique within tenant project and service producers have to guarantee it. The ID must be 6-30 characters long, and match the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])`.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Roles for the associated service account for the tenant project.
    */
  var tenantProjectRoles: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaServiceAccountConfig {
  
  inline def apply(): SchemaServiceAccountConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceAccountConfig]
  }
  
  extension [Self <: SchemaServiceAccountConfig](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setTenantProjectRoles(value: js.Array[String]): Self = StObject.set(x, "tenantProjectRoles", value.asInstanceOf[js.Any])
    
    inline def setTenantProjectRolesNull: Self = StObject.set(x, "tenantProjectRoles", null)
    
    inline def setTenantProjectRolesUndefined: Self = StObject.set(x, "tenantProjectRoles", js.undefined)
    
    inline def setTenantProjectRolesVarargs(value: String*): Self = StObject.set(x, "tenantProjectRoles", js.Array(value*))
  }
}
