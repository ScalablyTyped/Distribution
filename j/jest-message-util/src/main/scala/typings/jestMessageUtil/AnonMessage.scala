package typings.jestMessageUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: String
  var stack: String
}

object AnonMessage {
  @scala.inline
  def apply(message: String, stack: String): AnonMessage = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMessage]
  }
}

