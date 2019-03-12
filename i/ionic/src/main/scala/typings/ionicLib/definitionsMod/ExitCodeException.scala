package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExitCodeException
  extends stdLib.Error {
  var exitCode: scala.Double
}

object ExitCodeException {
  @scala.inline
  def apply(
    exitCode: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): ExitCodeException = {
    val __obj = js.Dynamic.literal(exitCode = exitCode, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ExitCodeException]
  }
}

