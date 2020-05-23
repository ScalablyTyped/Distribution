package typings.jestValidate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HasDeprecationWarnings extends js.Object {
  var hasDeprecationWarnings: Boolean
  var isValid: Boolean
}

object HasDeprecationWarnings {
  @scala.inline
  def apply(hasDeprecationWarnings: Boolean, isValid: Boolean): HasDeprecationWarnings = {
    val __obj = js.Dynamic.literal(hasDeprecationWarnings = hasDeprecationWarnings.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasDeprecationWarnings]
  }
}

