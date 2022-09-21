package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance extends StObject {
  
  /**
    * Whether to allow the tenant to inherit custom domains, email templates, and custom SMTP settings. If true, email sent from tenant will follow the project level email sending configurations. If false (by default), emails will go with the default settings with no customizations.
    */
  var emailSendingConfig: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2Inheritance](x: Self) {
    
    inline def setEmailSendingConfig(value: Boolean): Self = StObject.set(x, "emailSendingConfig", value.asInstanceOf[js.Any])
    
    inline def setEmailSendingConfigNull: Self = StObject.set(x, "emailSendingConfig", null)
    
    inline def setEmailSendingConfigUndefined: Self = StObject.set(x, "emailSendingConfig", js.undefined)
  }
}
