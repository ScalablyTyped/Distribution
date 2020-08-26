package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conversation extends js.Object {
  var datetime: Double = js.native
  var done: js.UndefOr[Boolean] = js.native
  var id: Double = js.native
  var last_message_preview: String = js.native
  var message_count: Double = js.native
  var messages: js.UndefOr[js.Array[Message]] = js.native
  var page: js.UndefOr[Double] = js.native
  var with_account: String = js.native
  var with_account_id: Double = js.native
}

object Conversation {
  @scala.inline
  def apply(
    datetime: Double,
    id: Double,
    last_message_preview: String,
    message_count: Double,
    with_account: String,
    with_account_id: Double
  ): Conversation = {
    val __obj = js.Dynamic.literal(datetime = datetime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_message_preview = last_message_preview.asInstanceOf[js.Any], message_count = message_count.asInstanceOf[js.Any], with_account = with_account.asInstanceOf[js.Any], with_account_id = with_account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conversation]
  }
  @scala.inline
  implicit class ConversationOps[Self <: Conversation] (val x: Self) extends AnyVal {
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
    def setDatetime(value: Double): Self = this.set("datetime", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_message_preview(value: String): Self = this.set("last_message_preview", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_count(value: Double): Self = this.set("message_count", value.asInstanceOf[js.Any])
    @scala.inline
    def setWith_account(value: String): Self = this.set("with_account", value.asInstanceOf[js.Any])
    @scala.inline
    def setWith_account_id(value: Double): Self = this.set("with_account_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: Boolean): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDone: Self = this.set("done", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: Message*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[Message]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
  }
  
}

