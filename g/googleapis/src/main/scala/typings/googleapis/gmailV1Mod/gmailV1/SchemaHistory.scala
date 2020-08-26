package typings.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A record of a change to the user&#39;s mailbox. Each history change may
  * affect multiple messages in multiple ways.
  */
@js.native
trait SchemaHistory extends js.Object {
  /**
    * The mailbox sequence ID.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Labels added to messages in this history record.
    */
  var labelsAdded: js.UndefOr[js.Array[SchemaHistoryLabelAdded]] = js.native
  /**
    * Labels removed from messages in this history record.
    */
  var labelsRemoved: js.UndefOr[js.Array[SchemaHistoryLabelRemoved]] = js.native
  /**
    * List of messages changed in this history record. The fields for specific
    * change types, such as messagesAdded may duplicate messages in this field.
    * We recommend using the specific change-type fields instead of this.
    */
  var messages: js.UndefOr[js.Array[SchemaMessage]] = js.native
  /**
    * Messages added to the mailbox in this history record.
    */
  var messagesAdded: js.UndefOr[js.Array[SchemaHistoryMessageAdded]] = js.native
  /**
    * Messages deleted (not Trashed) from the mailbox in this history record.
    */
  var messagesDeleted: js.UndefOr[js.Array[SchemaHistoryMessageDeleted]] = js.native
}

object SchemaHistory {
  @scala.inline
  def apply(): SchemaHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaHistory]
  }
  @scala.inline
  implicit class SchemaHistoryOps[Self <: SchemaHistory] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLabelsAddedVarargs(value: SchemaHistoryLabelAdded*): Self = this.set("labelsAdded", js.Array(value :_*))
    @scala.inline
    def setLabelsAdded(value: js.Array[SchemaHistoryLabelAdded]): Self = this.set("labelsAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsAdded: Self = this.set("labelsAdded", js.undefined)
    @scala.inline
    def setLabelsRemovedVarargs(value: SchemaHistoryLabelRemoved*): Self = this.set("labelsRemoved", js.Array(value :_*))
    @scala.inline
    def setLabelsRemoved(value: js.Array[SchemaHistoryLabelRemoved]): Self = this.set("labelsRemoved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelsRemoved: Self = this.set("labelsRemoved", js.undefined)
    @scala.inline
    def setMessagesVarargs(value: SchemaMessage*): Self = this.set("messages", js.Array(value :_*))
    @scala.inline
    def setMessages(value: js.Array[SchemaMessage]): Self = this.set("messages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    @scala.inline
    def setMessagesAddedVarargs(value: SchemaHistoryMessageAdded*): Self = this.set("messagesAdded", js.Array(value :_*))
    @scala.inline
    def setMessagesAdded(value: js.Array[SchemaHistoryMessageAdded]): Self = this.set("messagesAdded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesAdded: Self = this.set("messagesAdded", js.undefined)
    @scala.inline
    def setMessagesDeletedVarargs(value: SchemaHistoryMessageDeleted*): Self = this.set("messagesDeleted", js.Array(value :_*))
    @scala.inline
    def setMessagesDeleted(value: js.Array[SchemaHistoryMessageDeleted]): Self = this.set("messagesDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessagesDeleted: Self = this.set("messagesDeleted", js.undefined)
  }
  
}

