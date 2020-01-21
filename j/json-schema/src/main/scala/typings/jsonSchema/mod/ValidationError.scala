package typings.jsonSchema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var message: String
  var property: String
}

object ValidationError {
  @scala.inline
  def apply(message: String, property: String): ValidationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValidationError]
  }
}

