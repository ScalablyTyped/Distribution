package typings.ionic.definitionsMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitCodeException extends Error {
  var exitCode: Double
}

object ExitCodeException {
  @scala.inline
  def apply(exitCode: Double, message: String, name: String, stack: String = null): ExitCodeException = {
    val __obj = js.Dynamic.literal(exitCode = exitCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitCodeException]
  }
}

