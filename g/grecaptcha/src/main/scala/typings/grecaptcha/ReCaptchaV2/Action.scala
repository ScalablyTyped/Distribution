package typings.grecaptcha.ReCaptchaV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * the name of the action. Actions may only contain alphanumeric characters and slashes, and must not be user-specific.
    */
  var action: String
}

object Action {
  @scala.inline
  def apply(action: String): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Action]
  }
}

