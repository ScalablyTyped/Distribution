package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo extends StObject {
  
  /**
    * Android only. Uses for "instant" phone number verification though GmsCore.
    */
  var androidVerificationProof: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User-entered verification code.
    */
  var code: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required if Android verification proof is presented.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * An opaque string that represents the enrollment session.
    */
  var sessionInfo: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneRequestInfo](x: Self) {
    
    inline def setAndroidVerificationProof(value: String): Self = StObject.set(x, "androidVerificationProof", value.asInstanceOf[js.Any])
    
    inline def setAndroidVerificationProofNull: Self = StObject.set(x, "androidVerificationProof", null)
    
    inline def setAndroidVerificationProofUndefined: Self = StObject.set(x, "androidVerificationProof", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setSessionInfo(value: String): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoNull: Self = StObject.set(x, "sessionInfo", null)
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
  }
}
