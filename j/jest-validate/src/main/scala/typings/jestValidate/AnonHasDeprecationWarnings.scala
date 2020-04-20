package typings.jestValidate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean
  var isValid: Boolean
}

object AnonHasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, isValid: Boolean): AnonHasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHasDeprecationWarnings]
  }
}

