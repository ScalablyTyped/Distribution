package typings.jsonschema.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetail extends js.Object {
  var argument: String
  var message: String
  var name: String
}

object ErrorDetail {
  @scala.inline
  def apply(argument: String, message: String, name: String): ErrorDetail = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorDetail]
  }
}

