package typings.ioTs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  /** where the error originated */
  val context: Context
  /** optional custom error message */
  val message: js.UndefOr[String] = js.undefined
  /** the offending (sub)value */
  val value: js.Any
}

object ValidationError {
  @scala.inline
  def apply(context: Context, value: js.Any, message: String = null): ValidationError = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

