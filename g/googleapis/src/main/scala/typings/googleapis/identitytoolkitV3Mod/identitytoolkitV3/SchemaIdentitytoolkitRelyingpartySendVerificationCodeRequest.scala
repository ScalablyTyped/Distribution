package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request for Identitytoolkit-SendVerificationCode
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest extends StObject {
  
  /**
    * Receipt of successful app token validation with APNS.
    */
  var iosReceipt: js.UndefOr[String] = js.native
  
  /**
    * Secret delivered to iOS app via APNS.
    */
  var iosSecret: js.UndefOr[String] = js.native
  
  /**
    * The phone number to send the verification code to in E.164 format.
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * Recaptcha solution.
    */
  var recaptchaToken: js.UndefOr[String] = js.native
}
object SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest {
  
  @scala.inline
  def apply(): SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest]
  }
  
  @scala.inline
  implicit class SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequestMutableBuilder[Self <: SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIosReceipt(value: String): Self = StObject.set(x, "iosReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosReceiptUndefined: Self = StObject.set(x, "iosReceipt", js.undefined)
    
    @scala.inline
    def setIosSecret(value: String): Self = StObject.set(x, "iosSecret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosSecretUndefined: Self = StObject.set(x, "iosSecret", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: String): Self = StObject.set(x, "phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "phoneNumber", js.undefined)
    
    @scala.inline
    def setRecaptchaToken(value: String): Self = StObject.set(x, "recaptchaToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecaptchaTokenUndefined: Self = StObject.set(x, "recaptchaToken", js.undefined)
  }
}
