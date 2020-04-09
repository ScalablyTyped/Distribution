package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageModel extends js.Object {
  var body: String
  var message_type: String
  var subject: js.UndefOr[String] = js.undefined
}

object MessageModel {
  @scala.inline
  def apply(body: String, message_type: String, subject: String = null): MessageModel = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageModel]
  }
}

