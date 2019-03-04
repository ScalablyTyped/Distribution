package typings
package jsonschemaLib.jsonschemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorDetail extends js.Object {
  var argument: java.lang.String
  var message: java.lang.String
  var name: java.lang.String
}

object ErrorDetail {
  @scala.inline
  def apply(argument: java.lang.String, message: java.lang.String, name: java.lang.String): ErrorDetail = {
    val __obj = js.Dynamic.literal(argument = argument, message = message, name = name)
  
    __obj.asInstanceOf[ErrorDetail]
  }
}

