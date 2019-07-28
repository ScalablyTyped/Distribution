package typings.mailgunDashJs.mailgunDashJsMod.messagesNs

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
    val __obj = js.Dynamic.literal(id = id, message = message)
  
    __obj.asInstanceOf[SendResponse]
  }
}

