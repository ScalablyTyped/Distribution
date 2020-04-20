package typings.inboxsdk

import typings.inboxsdk.mod.Conversations.MessageViewViewStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessageView extends js.Object {
  var messageView: this.type
  var newViewState: MessageViewViewStates
  var oldViewState: MessageViewViewStates
}

object AnonMessageView {
  @scala.inline
  def apply(
    messageView: AnonMessageView,
    newViewState: MessageViewViewStates,
    oldViewState: MessageViewViewStates
  ): AnonMessageView = {
    val __obj = js.Dynamic.literal(messageView = messageView.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], oldViewState = oldViewState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessageView]
  }
}

