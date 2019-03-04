package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactHoverEvent extends js.Object {
  var contact: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact
  var contactType: inboxsdkLib.inboxsdkLibStrings.sender | inboxsdkLib.inboxsdkLibStrings.recipient
  var messageView: MessageView
  var threadView: ThreadView
}

object ContactHoverEvent {
  @scala.inline
  def apply(
    contact: inboxsdkLib.inboxsdkMod.InboxSDKNs.CommonNs.Contact,
    contactType: inboxsdkLib.inboxsdkLibStrings.sender | inboxsdkLib.inboxsdkLibStrings.recipient,
    messageView: MessageView,
    threadView: ThreadView
  ): ContactHoverEvent = {
    val __obj = js.Dynamic.literal(contact = contact, contactType = contactType.asInstanceOf[js.Any], messageView = messageView, threadView = threadView)
  
    __obj.asInstanceOf[ContactHoverEvent]
  }
}

