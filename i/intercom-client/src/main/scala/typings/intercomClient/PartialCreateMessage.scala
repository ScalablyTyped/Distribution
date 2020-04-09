package typings.intercomClient

import typings.intercomClient.messageMod.FromToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<intercom-client.intercom-client/Message.CreateMessage> */
trait PartialCreateMessage extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[FromToObject] = js.undefined
  var message_type: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
  var to: js.UndefOr[FromToObject] = js.undefined
}

object PartialCreateMessage {
  @scala.inline
  def apply(
    body: String = null,
    from: FromToObject = null,
    message_type: String = null,
    subject: String = null,
    template: String = null,
    to: FromToObject = null
  ): PartialCreateMessage = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (message_type != null) __obj.updateDynamic("message_type")(message_type.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCreateMessage]
  }
}

