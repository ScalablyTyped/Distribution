package typings
package jpegDashAutorotateLib.jpegDashAutorotateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomError
  extends nodeLib.Error {
  var code: errors
}

object CustomError {
  @scala.inline
  def apply(code: errors, stack: java.lang.String = null): CustomError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[CustomError]
  }
}

