package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.recipient
import typings.inboxsdk.inboxsdkStrings.sender
import typings.inboxsdk.mod.Common.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactHoverEvent extends js.Object {
  
  var contact: Contact = js.native
  
  var contactType: sender | recipient = js.native
  
  var messageView: MessageView = js.native
  
  var threadView: ThreadView = js.native
}
object ContactHoverEvent {
  
  @scala.inline
  def apply(
    contact: Contact,
    contactType: sender | recipient,
    messageView: MessageView,
    threadView: ThreadView
  ): ContactHoverEvent = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], contactType = contactType.asInstanceOf[js.Any], messageView = messageView.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactHoverEvent]
  }
  
  @scala.inline
  implicit class ContactHoverEventOps[Self <: ContactHoverEvent] (val x: Self) extends AnyVal {
    
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
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactType(value: sender | recipient): Self = this.set("contactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageView(value: MessageView): Self = this.set("messageView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThreadView(value: ThreadView): Self = this.set("threadView", value.asInstanceOf[js.Any])
  }
}
