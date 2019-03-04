package typings
package inboxsdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MessageView extends js.Object {
  var messageView: this.type
  var newViewState: inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.MessageViewViewStates
  var oldViewState: inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.MessageViewViewStates
}

object Anon_MessageView {
  @scala.inline
  def apply(
    messageView: Anon_MessageView,
    newViewState: inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.MessageViewViewStates,
    oldViewState: inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs.MessageViewViewStates
  ): Anon_MessageView = {
    val __obj = js.Dynamic.literal(messageView = messageView, newViewState = newViewState, oldViewState = oldViewState)
  
    __obj.asInstanceOf[Anon_MessageView]
  }
}

