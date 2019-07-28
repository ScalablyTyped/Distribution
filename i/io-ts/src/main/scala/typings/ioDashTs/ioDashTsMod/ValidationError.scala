package typings.ioDashTs.ioDashTsMod

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
    val __obj = js.Dynamic.literal(context = context, value = value)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ValidationError]
  }
}

