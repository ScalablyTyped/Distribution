package typings.hcaptchaReactHcaptcha.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HCaptchaState extends js.Object {
  var captchaId: String
  var elementId: String
  var isApiReady: Boolean
  var isRemoved: Boolean
}

object HCaptchaState {
  @scala.inline
  def apply(captchaId: String, elementId: String, isApiReady: Boolean, isRemoved: Boolean): HCaptchaState = {
    val __obj = js.Dynamic.literal(captchaId = captchaId.asInstanceOf[js.Any], elementId = elementId.asInstanceOf[js.Any], isApiReady = isApiReady.asInstanceOf[js.Any], isRemoved = isRemoved.asInstanceOf[js.Any])
    __obj.asInstanceOf[HCaptchaState]
  }
}

