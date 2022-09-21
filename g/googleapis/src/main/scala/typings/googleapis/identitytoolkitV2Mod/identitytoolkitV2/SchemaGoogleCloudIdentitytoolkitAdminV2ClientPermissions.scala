package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions extends StObject {
  
  /**
    * When true, end users cannot delete their account on the associated project through any of our API methods
    */
  var disabledUserDeletion: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * When true, end users cannot sign up for a new account on the associated project through any of our API methods
    */
  var disabledUserSignup: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2ClientPermissions](x: Self) {
    
    inline def setDisabledUserDeletion(value: Boolean): Self = StObject.set(x, "disabledUserDeletion", value.asInstanceOf[js.Any])
    
    inline def setDisabledUserDeletionNull: Self = StObject.set(x, "disabledUserDeletion", null)
    
    inline def setDisabledUserDeletionUndefined: Self = StObject.set(x, "disabledUserDeletion", js.undefined)
    
    inline def setDisabledUserSignup(value: Boolean): Self = StObject.set(x, "disabledUserSignup", value.asInstanceOf[js.Any])
    
    inline def setDisabledUserSignupNull: Self = StObject.set(x, "disabledUserSignup", null)
    
    inline def setDisabledUserSignupUndefined: Self = StObject.set(x, "disabledUserSignup", js.undefined)
  }
}
