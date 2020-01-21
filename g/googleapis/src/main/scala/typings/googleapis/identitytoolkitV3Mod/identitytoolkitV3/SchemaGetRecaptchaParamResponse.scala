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
  def apply(kind: String = null, recaptchaSiteKey: String = null, recaptchaStoken: String = null): SchemaGetRecaptchaParamResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (recaptchaSiteKey != null) __obj.updateDynamic("recaptchaSiteKey")(recaptchaSiteKey.asInstanceOf[js.Any])
    if (recaptchaStoken != null) __obj.updateDynamic("recaptchaStoken")(recaptchaStoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetRecaptchaParamResponse]
  }
}

