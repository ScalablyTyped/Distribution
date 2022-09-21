package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest extends StObject {
  
  /**
    * Required. MFA enrollment id from the user's list of current MFA enrollments.
    */
  var mfaEnrollmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Pending credential from first factor sign-in.
    */
  var mfaPendingCredential: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Verification info to authorize sending an SMS for phone verification.
    */
  var phoneSignInInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo] = js.undefined
  
  /**
    * The ID of the Identity Platform tenant the user is signing in to. If not set, the user will sign in to the default Identity Platform project.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2StartMfaSignInRequest](x: Self) {
    
    inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
    
    inline def setMfaEnrollmentIdNull: Self = StObject.set(x, "mfaEnrollmentId", null)
    
    inline def setMfaEnrollmentIdUndefined: Self = StObject.set(x, "mfaEnrollmentId", js.undefined)
    
    inline def setMfaPendingCredential(value: String): Self = StObject.set(x, "mfaPendingCredential", value.asInstanceOf[js.Any])
    
    inline def setMfaPendingCredentialNull: Self = StObject.set(x, "mfaPendingCredential", null)
    
    inline def setMfaPendingCredentialUndefined: Self = StObject.set(x, "mfaPendingCredential", js.undefined)
    
    inline def setPhoneSignInInfo(value: SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo): Self = StObject.set(x, "phoneSignInInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneSignInInfoUndefined: Self = StObject.set(x, "phoneSignInInfo", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
