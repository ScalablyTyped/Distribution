package typings.ldapjs.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var code: Double
  var message: String
  var name: String
}

object Error {
  @scala.inline
  def apply(code: Double, message: String, name: String): Error = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
  
    __obj.asInstanceOf[Error]
  }
}

