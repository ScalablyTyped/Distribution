package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraValidationStatusError extends js.Object {
  var code: LibraValidationStatusCode
  var message: String
}

object LibraValidationStatusError {
  @scala.inline
  def apply(code: LibraValidationStatusCode, message: String): LibraValidationStatusError = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[LibraValidationStatusError]
  }
}

