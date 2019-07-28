package typings.jsonDashEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorError extends js.Object {
  var message: String
  var path: String
  var property: String
}

object JSONEditorError {
  @scala.inline
  def apply(message: String, path: String, property: String): JSONEditorError = {
    val __obj = js.Dynamic.literal(message = message, path = path, property = property)
  
    __obj.asInstanceOf[JSONEditorError]
  }
}

