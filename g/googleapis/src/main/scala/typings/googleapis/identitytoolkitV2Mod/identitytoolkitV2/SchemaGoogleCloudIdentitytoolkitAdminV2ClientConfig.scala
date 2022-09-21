package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig extends StObject {
  
  /**
    * Output only. API key that can be used when making requests for this project.
    */
  var apiKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Firebase subdomain.
    */
  var firebaseSubdomain: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Configuration related to restricting a user's ability to affect their account.
    */
  var permissions: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2Permissions] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ClientConfig](x: Self) {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiKeyNull: Self = StObject.set(x, "apiKey", null)
    
    inline def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
    
    inline def setFirebaseSubdomain(value: String): Self = StObject.set(x, "firebaseSubdomain", value.asInstanceOf[js.Any])
    
    inline def setFirebaseSubdomainNull: Self = StObject.set(x, "firebaseSubdomain", null)
    
    inline def setFirebaseSubdomainUndefined: Self = StObject.set(x, "firebaseSubdomain", js.undefined)
    
    inline def setPermissions(value: SchemaGoogleCloudIdentitytoolkitAdminV2Permissions): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
  }
}
