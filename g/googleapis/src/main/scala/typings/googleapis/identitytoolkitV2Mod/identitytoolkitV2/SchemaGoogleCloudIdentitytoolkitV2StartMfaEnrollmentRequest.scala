package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest extends StObject {
  
  /**
    * Required. User's ID token.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Verification info to authorize sending an SMS for phone verification.
    */
  var phoneEnrollmentInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo] = js.undefined
  
  /**
    * The ID of the Identity Platform tenant that the user enrolling MFA belongs to. If not set, the user belongs to the default Identity Platform project.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentRequest](x: Self) {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setPhoneEnrollmentInfo(value: SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo): Self = StObject.set(x, "phoneEnrollmentInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneEnrollmentInfoUndefined: Self = StObject.set(x, "phoneEnrollmentInfo", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
