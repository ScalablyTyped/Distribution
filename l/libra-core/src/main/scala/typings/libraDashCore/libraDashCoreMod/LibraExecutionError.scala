package typings.libraDashCore.libraDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibraExecutionError extends js.Object {
  var errorType: LibraExecutionErrorType
}

object LibraExecutionError {
  @scala.inline
  def apply(errorType: LibraExecutionErrorType): LibraExecutionError = {
    val __obj = js.Dynamic.literal(errorType = errorType)
  
    __obj.asInstanceOf[LibraExecutionError]
  }
}

