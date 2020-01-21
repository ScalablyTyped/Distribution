package typings.jjve.mod

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Issue]
  }
}

