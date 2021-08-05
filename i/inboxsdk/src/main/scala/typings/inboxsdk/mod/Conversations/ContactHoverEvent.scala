package typings.inboxsdk.mod.Conversations

import typings.inboxsdk.inboxsdkStrings.recipient
import typings.inboxsdk.inboxsdkStrings.sender
import typings.inboxsdk.mod.Common.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactHoverEvent extends StObject {
  
  var contact: Contact
  
  var contactType: sender | recipient
  
  var messageView: MessageView
  
  var threadView: ThreadView
}
object ContactHoverEvent {
  
  inline def apply(
    contact: Contact,
    contactType: sender | recipient,
    messageView: MessageView,
    threadView: ThreadView
  ): ContactHoverEvent = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], contactType = contactType.asInstanceOf[js.Any], messageView = messageView.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactHoverEvent]
  }
  
  extension [Self <: ContactHoverEvent](x: Self) {
    
    inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    inline def setContactType(value: sender | recipient): Self = StObject.set(x, "contactType", value.asInstanceOf[js.Any])
    
    inline def setMessageView(value: MessageView): Self = StObject.set(x, "messageView", value.asInstanceOf[js.Any])
    
    inline def setThreadView(value: ThreadView): Self = StObject.set(x, "threadView", value.asInstanceOf[js.Any])
  }
}
