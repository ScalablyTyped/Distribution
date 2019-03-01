package typings
package jsonDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorError extends js.Object {
  var message: java.lang.String
  var path: java.lang.String
  var property: java.lang.String
}

object JSONEditorError {
  @scala.inline
  def apply(message: java.lang.String, path: java.lang.String, property: java.lang.String): JSONEditorError = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("property")(property)
    __obj.asInstanceOf[JSONEditorError]
  }
}

