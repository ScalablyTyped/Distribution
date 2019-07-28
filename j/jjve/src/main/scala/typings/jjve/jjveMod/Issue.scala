package typings.jjve.jjveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var code: String
  var data: js.Any
  var message: String
  var path: String
}

object Issue {
  @scala.inline
  def apply(code: String, data: js.Any, message: String, path: String): Issue = {
    val __obj = js.Dynamic.literal(code = code, data = data, message = message, path = path)
  
    __obj.asInstanceOf[Issue]
  }
}

