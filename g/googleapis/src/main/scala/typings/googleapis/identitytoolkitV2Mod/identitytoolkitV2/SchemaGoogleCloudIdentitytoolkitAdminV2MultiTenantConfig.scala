package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig extends StObject {
  
  /**
    * Whether this project can have tenants or not.
    */
  var allowTenants: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The default cloud parent org or folder that the tenant project should be created under. The parent resource name should be in the format of "/", such as "folders/123" or "organizations/456". If the value is not set, the tenant will be created under the same organization or folder as the agent project.
    */
  var defaultTenantLocation: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2MultiTenantConfig](x: Self) {
    
    inline def setAllowTenants(value: Boolean): Self = StObject.set(x, "allowTenants", value.asInstanceOf[js.Any])
    
    inline def setAllowTenantsNull: Self = StObject.set(x, "allowTenants", null)
    
    inline def setAllowTenantsUndefined: Self = StObject.set(x, "allowTenants", js.undefined)
    
    inline def setDefaultTenantLocation(value: String): Self = StObject.set(x, "defaultTenantLocation", value.asInstanceOf[js.Any])
    
    inline def setDefaultTenantLocationNull: Self = StObject.set(x, "defaultTenantLocation", null)
    
    inline def setDefaultTenantLocationUndefined: Self = StObject.set(x, "defaultTenantLocation", js.undefined)
  }
}
