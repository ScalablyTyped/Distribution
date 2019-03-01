package typings
package jsonapiDashSerializerLib.jsonapiDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAPIError extends js.Object {
  var errors: js.Array[_]
}

object JSONAPIError {
  @scala.inline
  def apply(errors: js.Array[_]): JSONAPIError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.asInstanceOf[JSONAPIError]
  }
}

