package typings.jpegAutorotate.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomError extends Error {
  var code: errors
}

object CustomError {
  @scala.inline
  def apply(code: errors, message: String, name: String, stack: String = null): CustomError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomError]
  }
}

