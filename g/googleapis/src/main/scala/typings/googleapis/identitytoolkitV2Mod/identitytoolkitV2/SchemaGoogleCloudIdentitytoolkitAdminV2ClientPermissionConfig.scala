package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig extends StObject {
  
  /**
    * Configuration related to restricting a user's ability to affect their account.
    */
  var permissions: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissionConfig](x: Self) {
    
    inline def setPermissions(value: SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
  }
}
