package typings.mailgunDashJs.mailgunDashJsMod.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendResponse extends js.Object {
  var id: String
  var message: String
}

object SendResponse {
  @scala.inline
  def apply(id: String, message: String): SendResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendResponse]
  }
}

