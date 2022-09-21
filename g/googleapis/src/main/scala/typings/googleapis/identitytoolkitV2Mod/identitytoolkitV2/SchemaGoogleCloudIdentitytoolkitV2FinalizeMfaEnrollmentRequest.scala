package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest extends StObject {
  
  /**
    * Display name which is entered by users to distinguish between different second factors with same type or different type.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. ID token.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Verification info to authorize sending an SMS for phone verification.
    */
  var phoneVerificationInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo] = js.undefined
  
  /**
    * The ID of the Identity Platform tenant that the user enrolling MFA belongs to. If not set, the user belongs to the default Identity Platform project.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentRequest](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setPhoneVerificationInfo(value: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo): Self = StObject.set(x, "phoneVerificationInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneVerificationInfoUndefined: Self = StObject.set(x, "phoneVerificationInfo", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
