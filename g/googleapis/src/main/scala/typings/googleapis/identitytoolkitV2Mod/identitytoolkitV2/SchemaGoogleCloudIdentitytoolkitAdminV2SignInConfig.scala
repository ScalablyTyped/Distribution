package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig extends StObject {
  
  /**
    * Whether to allow more than one account to have the same email.
    */
  var allowDuplicateEmails: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Configuration options related to authenticating an anonymous user.
    */
  var anonymous: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous] = js.undefined
  
  /**
    * Configuration options related to authenticating a user by their email address.
    */
  var email: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2Email] = js.undefined
  
  /**
    * Output only. Hash config information.
    */
  var hashConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig] = js.undefined
  
  /**
    * Configuration options related to authenticated a user by their phone number.
    */
  var phoneNumber: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2SignInConfig](x: Self) {
    
    inline def setAllowDuplicateEmails(value: Boolean): Self = StObject.set(x, "allowDuplicateEmails", value.asInstanceOf[js.Any])
    
    inline def setAllowDuplicateEmailsNull: Self = StObject.set(x, "allowDuplicateEmails", null)
    
    inline def setAllowDuplicateEmailsUndefined: Self = StObject.set(x, "allowDuplicateEmails", js.undefined)
    
    inline def setAnonymous(value: SchemaGoogleCloudIdentitytoolkitAdminV2Anonymous): Self = StObject.set(x, "anonymous", value.asInstanceOf[js.Any])
    
    inline def setAnonymousUndefined: Self = StObject.set(x, "anonymous", js.undefined)
    
    inline def setEmail(value: SchemaGoogleCloudIdentitytoolkitAdminV2Email): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setHashConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2HashConfig): Self = StObject.set(x, "hashConfig", value.asInstanceOf[js.Any])
    
    inline def setHashConfigUndefined: Self = StObject.set(x, "hashConfig", js.undefined)
    
    inline def setPhoneNumber(value: SchemaGoogleCloudIdentitytoolkitAdminV2PhoneNumber): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
