package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig extends StObject {
  
  /**
    * Quota for the Signup endpoint, if overwritten. Signup quota is measured in sign ups per project per hour per IP.
    */
  var signUpQuotaConfig: js.UndefOr[SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2QuotaConfig](x: Self) {
    
    inline def setSignUpQuotaConfig(value: SchemaGoogleCloudIdentitytoolkitAdminV2TemporaryQuota): Self = StObject.set(x, "signUpQuotaConfig", value.asInstanceOf[js.Any])
    
    inline def setSignUpQuotaConfigUndefined: Self = StObject.set(x, "signUpQuotaConfig", js.undefined)
  }
}
