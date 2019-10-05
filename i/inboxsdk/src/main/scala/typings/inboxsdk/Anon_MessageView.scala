package typings.inboxsdk

import typings.inboxsdk.inboxsdkMod.Conversations.MessageViewViewStates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageView extends js.Object {
  var messageView: this.type
  var newViewState: MessageViewViewStates
  var oldViewState: MessageViewViewStates
}

object Anon_MessageView {
  @scala.inline
  def apply(
    messageView: Anon_MessageView,
    newViewState: MessageViewViewStates,
    oldViewState: MessageViewViewStates
  ): Anon_MessageView = {
    val __obj = js.Dynamic.literal(messageView = messageView, newViewState = newViewState, oldViewState = oldViewState)
  
    __obj.asInstanceOf[Anon_MessageView]
  }
}

