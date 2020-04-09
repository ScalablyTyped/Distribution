package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends MessageModel {
  var created_at: Double
  var id: String
  var owner: Owner
  var `type`: String
}

object Message {
  @scala.inline
  def apply(
    body: String,
    created_at: Double,
    id: String,
    message_type: String,
    owner: Owner,
    `type`: String,
    subject: String = null
  ): Message = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

