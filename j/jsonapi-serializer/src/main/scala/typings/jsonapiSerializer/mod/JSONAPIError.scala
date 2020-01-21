package typings.jsonapiSerializer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONAPIError extends js.Object {
  var errors: js.Array[_]
}

object JSONAPIError {
  @scala.inline
  def apply(errors: js.Array[_]): JSONAPIError = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONAPIError]
  }
}

