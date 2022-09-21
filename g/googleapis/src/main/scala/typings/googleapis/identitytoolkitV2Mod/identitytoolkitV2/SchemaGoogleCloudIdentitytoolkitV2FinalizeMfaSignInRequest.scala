package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest extends StObject {
  
  /**
    * Required. Pending credential from first factor sign-in.
    */
  var mfaPendingCredential: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Proof of completion of the SMS based MFA challenge.
    */
  var phoneVerificationInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo] = js.undefined
  
  /**
    * The ID of the Identity Platform tenant the user is signing in to. If not set, the user will sign in to the default Identity Platform project.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaSignInRequest](x: Self) {
    
    inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
    
    inline def setMfaPendingCredentialNull: Self = StObject.set(x, "mfaPendingCredential", null)
    
    inline def setMfaPendingCredentialUndefined: Self = StObject.set(x, "mfaPendingCredential", js.undefined)
    
    inline def setPhoneVerificationInfo(value: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo): Self = StObject.set(x, "phoneVerificationInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerificationInfoUndefined: Self = StObject.set(x, "phoneVerificationInfo", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
