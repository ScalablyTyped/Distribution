package typings.inboxsdk.anon

import typings.inboxsdk.mod.Conversations.MessageViewViewStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageView extends js.Object {
  var messageView: this.type = js.native
  var newViewState: MessageViewViewStates = js.native
  var oldViewState: MessageViewViewStates = js.native
}

object MessageView {
  @scala.inline
  def apply(messageView: MessageView, newViewState: MessageViewViewStates, oldViewState: MessageViewViewStates): MessageView = {
    val __obj = js.Dynamic.literal(messageView = messageView.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], oldViewState = oldViewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageView]
  }
  @scala.inline
  implicit class MessageViewOps[Self <: MessageView] (val x: Self) extends AnyVal {
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
    def setMessageView(value: MessageView): Self = this.set("messageView", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewViewState(value: MessageViewViewStates): Self = this.set("newViewState", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldViewState(value: MessageViewViewStates): Self = this.set("oldViewState", value.asInstanceOf[js.Any])
  }
  
}

