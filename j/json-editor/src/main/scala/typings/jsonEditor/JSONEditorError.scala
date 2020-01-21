package typings.jsonEditor

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
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JSONEditorError]
  }
}

