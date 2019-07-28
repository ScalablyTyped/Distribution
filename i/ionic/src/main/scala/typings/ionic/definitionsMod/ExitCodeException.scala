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
    val __obj = js.Dynamic.literal(exitCode = exitCode, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExitCodeException]
  }
}

