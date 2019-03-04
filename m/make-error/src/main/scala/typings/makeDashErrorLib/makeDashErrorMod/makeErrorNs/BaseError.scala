package typings
package makeDashErrorLib.makeDashErrorMod.makeErrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseError
  extends stdLib.Error {
  @JSName("stack")
  var stack_BaseError: java.lang.String
}

object BaseError {
  @scala.inline
  def apply(message: java.lang.String, name: java.lang.String, stack: java.lang.String): BaseError = {
    val __obj = js.Dynamic.literal(message = message, name = name, stack = stack)
  
    __obj.asInstanceOf[BaseError]
  }
}

