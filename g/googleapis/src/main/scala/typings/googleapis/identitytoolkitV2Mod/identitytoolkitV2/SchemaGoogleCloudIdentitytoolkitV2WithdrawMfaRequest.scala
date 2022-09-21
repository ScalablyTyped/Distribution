package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest extends StObject {
  
  /**
    * Required. User's ID token.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. MFA enrollment id from a current MFA enrollment.
    */
  var mfaEnrollmentId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the Identity Platform tenant that the user unenrolling MFA belongs to. If not set, the user belongs to the default Identity Platform project.
    */
  var tenantId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2WithdrawMfaRequest](x: Self) {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setMfaEnrollmentId(value: String): Self = StObject.set(x, "mfaEnrollmentId", value.asInstanceOf[js.Any])
    
    inline def setMfaEnrollmentIdNull: Self = StObject.set(x, "mfaEnrollmentId", null)
    
    inline def setMfaEnrollmentIdUndefined: Self = StObject.set(x, "mfaEnrollmentId", js.undefined)
    
    inline def setTenantId(value: String): Self = StObject.set(x, "tenantId", value.asInstanceOf[js.Any])
    
    inline def setTenantIdNull: Self = StObject.set(x, "tenantId", null)
    
    inline def setTenantIdUndefined: Self = StObject.set(x, "tenantId", js.undefined)
  }
}
