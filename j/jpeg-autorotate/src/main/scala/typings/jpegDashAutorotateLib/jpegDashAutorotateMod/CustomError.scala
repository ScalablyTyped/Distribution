package typings
package jpegDashAutorotateLib.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomError
  extends stdLib.Error {
  var code: errors
}

object CustomError {
  @scala.inline
  def apply(code: errors, message: java.lang.String, name: java.lang.String, stack: java.lang.String = null): CustomError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CustomError]
  }
}

