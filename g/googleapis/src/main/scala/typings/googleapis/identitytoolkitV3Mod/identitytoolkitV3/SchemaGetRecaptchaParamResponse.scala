package typings.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of getting recaptcha param.
  */
@js.native
trait SchemaGetRecaptchaParamResponse extends js.Object {
  /**
    * The fixed string &quot;identitytoolkit#GetRecaptchaParamResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Site key registered at recaptcha.
    */
  var recaptchaSiteKey: js.UndefOr[String] = js.native
  /**
    * The stoken field for the recaptcha widget, used to request captcha
    * challenge.
    */
  var recaptchaStoken: js.UndefOr[String] = js.native
}

object SchemaGetRecaptchaParamResponse {
  @scala.inline
  def apply(): SchemaGetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetRecaptchaParamResponse]
  }
  @scala.inline
  implicit class SchemaGetRecaptchaParamResponseOps[Self <: SchemaGetRecaptchaParamResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setRecaptchaSiteKey(value: String): Self = this.set("recaptchaSiteKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecaptchaSiteKey: Self = this.set("recaptchaSiteKey", js.undefined)
    @scala.inline
    def setRecaptchaStoken(value: String): Self = this.set("recaptchaStoken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecaptchaStoken: Self = this.set("recaptchaStoken", js.undefined)
  }
  
}

