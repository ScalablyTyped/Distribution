package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo extends StObject {
  
  /**
    * Android only. Used by Google Play Services to identify the app for auto-retrieval.
    */
  var autoRetrievalInfo: js.UndefOr[SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo] = js.undefined
  
  /**
    * iOS only. Receipt of successful app token validation with APNS.
    */
  var iosReceipt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * iOS only. Secret delivered to iOS app via APNS.
    */
  var iosSecret: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required for enrollment. Phone number to be enrolled as MFA.
    */
  var phoneNumber: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Web only. Recaptcha solution.
    */
  var recaptchaToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Android only. Used to assert application identity in place of a recaptcha token. A SafetyNet Token can be generated via the [SafetyNet Android Attestation API](https://developer.android.com/training/safetynet/attestation.html), with the Base64 encoding of the `phone_number` field as the nonce.
    */
  var safetyNetToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitV2StartMfaPhoneRequestInfo](x: Self) {
    
    inline def setAutoRetrievalInfo(value: SchemaGoogleCloudIdentitytoolkitV2AutoRetrievalInfo): Self = StObject.set(x, "autoRetrievalInfo", value.asInstanceOf[js.Any])
    
    inline def setAutoRetrievalInfoUndefined: Self = StObject.set(x, "autoRetrievalInfo", js.undefined)
    
    inline def setIosReceipt(value: String): Self = StObject.set(x, "iosReceipt", value.asInstanceOf[js.Any])
    
    inline def setIosReceiptNull: Self = StObject.set(x, "iosReceipt", null)
    
    inline def setIosReceiptUndefined: Self = StObject.set(x, "iosReceipt", js.undefined)
    
    inline def setIosSecret(value: String): Self = StObject.set(x, "iosSecret", value.asInstanceOf[js.Any])
    
    inline def setIosSecretNull: Self = StObject.set(x, "iosSecret", null)
    
    inline def setIosSecretUndefined: Self = StObject.set(x, "iosSecret", js.undefined)
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberNull: Self = StObject.set(x, "phoneNumber", null)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    inline def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
    
    inline def setRecaptchaTokenNull: Self = StObject.set(x, "recaptchaToken", null)
    
    inline def setRecaptchaTokenUndefined: Self = StObject.set(x, "recaptchaToken", js.undefined)
    
    inline def setSafetyNetToken(value: String): Self = StObject.set(x, "safetyNetToken", value.asInstanceOf[js.Any])
    
    inline def setSafetyNetTokenNull: Self = StObject.set(x, "safetyNetToken", null)
    
    inline def setSafetyNetTokenUndefined: Self = StObject.set(x, "safetyNetToken", js.undefined)
  }
}
