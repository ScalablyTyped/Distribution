package typings.jasmine.jasmine.errors

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpectationFailed extends Error

object ExpectationFailed {
  @scala.inline
  def apply(message: String, name: String, stack: String = null): ExpectationFailed = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpectationFailed]
  }
}

