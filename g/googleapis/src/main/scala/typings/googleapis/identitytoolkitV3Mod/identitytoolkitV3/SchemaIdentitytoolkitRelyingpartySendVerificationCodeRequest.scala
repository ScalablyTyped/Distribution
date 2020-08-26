package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for Identitytoolkit-SendVerificationCode
  */
@js.native
trait SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest extends js.Object {
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
  implicit class SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequestOps[Self <: SchemaIdentitytoolkitRelyingpartySendVerificationCodeRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIosReceipt(value: String): Self = this.set("iosReceipt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosReceipt: Self = this.set("iosReceipt", js.undefined)
    @scala.inline
    def setIosSecret(value: String): Self = this.set("iosSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIosSecret: Self = this.set("iosSecret", js.undefined)
    @scala.inline
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    @scala.inline
    def setRecaptchaToken(value: String): Self = this.set("recaptchaToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecaptchaToken: Self = this.set("recaptchaToken", js.undefined)
  }
  
}

