package typings.luminoDatagrid.celleditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellInputValidatorResponse extends js.Object {
  /**
    * Validation error message. Set only when input is invalid
    */
  var message: js.UndefOr[String] = js.undefined
  /**
    * Flag indicating cell input is valid or not
    */
  var valid: Boolean
}

object ICellInputValidatorResponse {
  @scala.inline
  def apply(valid: Boolean, message: String = null): ICellInputValidatorResponse = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellInputValidatorResponse]
  }
}

