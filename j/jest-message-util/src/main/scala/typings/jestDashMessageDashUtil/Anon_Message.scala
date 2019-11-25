package typings.jestDashMessageDashUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Message extends js.Object {
  var message: String
  var stack: String
}

object Anon_Message {
  @scala.inline
  def apply(message: String, stack: String): Anon_Message = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Message]
  }
}

