package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse extends StObject {
  
  /**
    * ID token updated to reflect MFA enrollment.
    */
  var idToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Auxiliary auth info specific to phone auth.
    */
  var phoneAuthInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo] = js.undefined
  
  /**
    * Refresh token updated to reflect MFA enrollment.
    */
  var refreshToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaEnrollmentResponse](x: Self) {
    
    inline def setIdToken(value: String): Self = StObject.set(x, "idToken", value.asInstanceOf[js.Any])
    
    inline def setIdTokenNull: Self = StObject.set(x, "idToken", null)
    
    inline def setIdTokenUndefined: Self = StObject.set(x, "idToken", js.undefined)
    
    inline def setPhoneAuthInfo(value: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo): Self = StObject.set(x, "phoneAuthInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneAuthInfoUndefined: Self = StObject.set(x, "phoneAuthInfo", js.undefined)
    
    inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    
    inline def setRefreshTokenNull: Self = StObject.set(x, "refreshToken", null)
    
    inline def setRefreshTokenUndefined: Self = StObject.set(x, "refreshToken", js.undefined)
  }
}
