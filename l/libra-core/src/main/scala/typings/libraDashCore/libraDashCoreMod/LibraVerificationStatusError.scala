package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraVerificationStatusError extends js.Object {
  var error: LibraVerificationError
  var message: String
  var moduleIndex: Double
  var status: LibraVerificationStatusKind
}

object LibraVerificationStatusError {
  @scala.inline
  def apply(
    error: LibraVerificationError,
    message: String,
    moduleIndex: Double,
    status: LibraVerificationStatusKind
  ): LibraVerificationStatusError = {
    val __obj = js.Dynamic.literal(error = error, message = message, moduleIndex = moduleIndex, status = status)
  
    __obj.asInstanceOf[LibraVerificationStatusError]
  }
}

