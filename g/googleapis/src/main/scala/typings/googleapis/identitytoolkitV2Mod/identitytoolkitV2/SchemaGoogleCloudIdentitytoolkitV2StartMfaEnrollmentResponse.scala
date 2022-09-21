package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse extends StObject {
  
  /**
    * Verification info to authorize sending an SMS for phone verification.
    */
  var phoneSessionInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2StartMfaEnrollmentResponse](x: Self) {
    
    inline def setPhoneSessionInfo(value: SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneResponseInfo): Self = StObject.set(x, "phoneSessionInfo", value.asInstanceOf[js.Any])
    
    inline def setPhoneSessionInfoUndefined: Self = StObject.set(x, "phoneSessionInfo", js.undefined)
  }
}
