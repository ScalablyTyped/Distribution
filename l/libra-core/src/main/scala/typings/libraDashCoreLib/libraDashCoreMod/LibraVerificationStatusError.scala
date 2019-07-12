package typings
package libraDashCoreLib.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraVerificationStatusError extends js.Object {
  var error: LibraVerificationError
  var message: java.lang.String
  var moduleIndex: scala.Double
  var status: LibraVerificationStatusKind
}

object LibraVerificationStatusError {
  @scala.inline
  def apply(
    error: LibraVerificationError,
    message: java.lang.String,
    moduleIndex: scala.Double,
    status: LibraVerificationStatusKind
  ): LibraVerificationStatusError = {
    val __obj = js.Dynamic.literal(error = error, message = message, moduleIndex = moduleIndex, status = status)
  
    __obj.asInstanceOf[LibraVerificationStatusError]
  }
}

