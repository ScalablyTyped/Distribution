package typings.intercomClient.messageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageModel extends js.Object {
  var body: String = js.native
  var message_type: String = js.native
  var subject: js.UndefOr[String] = js.native
}

object MessageModel {
  @scala.inline
  def apply(body: String, message_type: String): MessageModel = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], message_type = message_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageModel]
  }
  @scala.inline
  implicit class MessageModelOps[Self <: MessageModel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_type(value: String): Self = this.set("message_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
  
}

