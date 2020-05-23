package typings.inboxsdk.anon

import typings.inboxsdk.mod.Conversations.MessageViewViewStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageView extends js.Object {
  var messageView: this.type
  var newViewState: MessageViewViewStates
  var oldViewState: MessageViewViewStates
}

object MessageView {
  @scala.inline
  def apply(messageView: MessageView, newViewState: MessageViewViewStates, oldViewState: MessageViewViewStates): MessageView = {
    val __obj = js.Dynamic.literal(messageView = messageView.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], oldViewState = oldViewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageView]
  }
}

