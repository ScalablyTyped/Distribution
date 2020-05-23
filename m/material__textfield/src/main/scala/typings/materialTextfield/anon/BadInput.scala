package typings.materialTextfield.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadInput extends js.Object {
  var badInput: Boolean
  var valid: Boolean
}

object BadInput {
  @scala.inline
  def apply(badInput: Boolean, valid: Boolean): BadInput = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadInput]
  }
}

