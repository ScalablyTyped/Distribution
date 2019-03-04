package typings
package jsoneditorLib.jsoneditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var message: java.lang.String
  var path: JSONPath
}

object ValidationError {
  @scala.inline
  def apply(message: java.lang.String, path: JSONPath): ValidationError = {
    val __obj = js.Dynamic.literal(message = message, path = path)
  
    __obj.asInstanceOf[ValidationError]
  }
}

