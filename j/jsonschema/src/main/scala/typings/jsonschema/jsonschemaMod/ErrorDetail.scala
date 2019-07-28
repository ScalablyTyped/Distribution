package typings.jsonschema.jsonschemaMod

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
    val __obj = js.Dynamic.literal(argument = argument, message = message, name = name)
  
    __obj.asInstanceOf[ErrorDetail]
  }
}

