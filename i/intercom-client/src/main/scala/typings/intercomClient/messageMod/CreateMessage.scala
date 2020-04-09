package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMessage extends MessageModel {
  var from: FromToObject
  var template: js.UndefOr[String] = js.undefined
  var to: FromToObject
}

object CreateMessage {
  @scala.inline
  def apply(
    body: String,
    from: FromToObject,
    message_type: String,
    to: FromToObject,
    subject: String = null,
    template: String = null
  ): CreateMessage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMessage]
  }
}

