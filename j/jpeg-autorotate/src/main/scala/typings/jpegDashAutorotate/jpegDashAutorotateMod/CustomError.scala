package typings.jpegDashAutorotate.jpegDashAutorotateMod

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
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CustomError]
  }
}

