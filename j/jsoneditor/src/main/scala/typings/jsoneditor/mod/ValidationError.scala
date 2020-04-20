package typings.jsoneditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var message: String
  var path: JSONPath
}

object ValidationError {
  @scala.inline
  def apply(message: String, path: JSONPath): ValidationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

