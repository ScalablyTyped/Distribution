package typings.hubot.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Envelope extends js.Object {
  var message: Message
  var room: String
  var user: User
}

object Envelope {
  @scala.inline
  def apply(message: Message, room: String, user: User): Envelope = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], room = room.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Envelope]
  }
}

