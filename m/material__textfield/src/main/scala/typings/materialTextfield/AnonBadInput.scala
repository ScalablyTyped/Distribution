package typings.materialTextfield

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadInput extends js.Object {
  var badInput: Boolean
  var valid: Boolean
}

object AnonBadInput {
  @scala.inline
  def apply(badInput: Boolean, valid: Boolean): AnonBadInput = {
    val __obj = js.Dynamic.literal(badInput = badInput.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBadInput]
  }
}

