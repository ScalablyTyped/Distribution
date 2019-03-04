package typings
package ioDashTsLib.ioDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  /** where the error originated */
  val context: Context
  /** optional custom error message */
  val message: js.UndefOr[java.lang.String] = js.undefined
  /** the offending (sub)value */
  val value: js.Any
}

object ValidationError {
  @scala.inline
  def apply(context: Context, value: js.Any, message: java.lang.String = null): ValidationError = {
    val __obj = js.Dynamic.literal(context = context, value = value)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ValidationError]
  }
}

