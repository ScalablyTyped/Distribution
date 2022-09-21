package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo extends StObject {
  
  /**
    * Android only. Long-lived replacement for valid code tied to android device.
    */
  var androidVerificationProof: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Android only. Expiration time of verification proof in seconds.
    */
  var androidVerificationProofExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * For Android verification proof.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2FinalizeMfaPhoneResponseInfo](x: Self) {
    
    inline def setAndroidVerificationProof(value: String): Self = StObject.set(x, "androidVerificationProof", value.asInstanceOf[js.Any])
    
    inline def setAndroidVerificationProofExpireTime(value: String): Self = StObject.set(x, "androidVerificationProofExpireTime", value.asInstanceOf[js.Any])
    
    inline def setAndroidVerificationProofExpireTimeNull: Self = StObject.set(x, "androidVerificationProofExpireTime", null)
    
    inline def setAndroidVerificationProofExpireTimeUndefined: Self = StObject.set(x, "androidVerificationProofExpireTime", js.undefined)
    
    inline def setAndroidVerificationProofNull: Self = StObject.set(x, "androidVerificationProof", null)
    
    inline def setAndroidVerificationProofUndefined: Self = StObject.set(x, "androidVerificationProof", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
  }
}
