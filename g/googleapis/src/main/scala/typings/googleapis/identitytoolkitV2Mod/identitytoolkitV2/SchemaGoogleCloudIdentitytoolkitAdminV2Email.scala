package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Email extends StObject {
  
  /**
    * Whether email auth is enabled for the project or not.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether a password is required for email auth or not. If true, both an email and password must be provided to sign in. If false, a user may sign in via either email/password or email link.
    */
  var passwordRequired: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Email {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Email = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Email]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Email](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setPasswordRequired(value: Boolean): Self = StObject.set(x, "passwordRequired", value.asInstanceOf[js.Any])
    
    inline def setPasswordRequiredNull: Self = StObject.set(x, "passwordRequired", null)
    
    inline def setPasswordRequiredUndefined: Self = StObject.set(x, "passwordRequired", js.undefined)
  }
}
