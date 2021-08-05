package typings.inboxsdk

import typings.inboxsdk.mod.Conversations.MessageViewViewStates
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Added extends StObject {
    
    var added: js.Array[typings.inboxsdk.mod.Common.Contact]
    
    var removed: js.Array[typings.inboxsdk.mod.Common.Contact]
  }
  object Added {
    
    inline def apply(
      added: js.Array[typings.inboxsdk.mod.Common.Contact],
      removed: js.Array[typings.inboxsdk.mod.Common.Contact]
    ): Added = {
      val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], removed = removed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Added]
    }
    
    extension [Self <: Added](x: Self) {
      
      inline def setAdded(value: js.Array[typings.inboxsdk.mod.Common.Contact]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: typings.inboxsdk.mod.Common.Contact*): Self = StObject.set(x, "added", js.Array(value :_*))
      
      inline def setRemoved(value: js.Array[typings.inboxsdk.mod.Common.Contact]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: typings.inboxsdk.mod.Common.Contact*): Self = StObject.set(x, "removed", js.Array(value :_*))
    }
  }
  
  trait Cancel extends StObject {
    
    def cancel(): Unit
  }
  object Cancel {
    
    inline def apply(cancel: () => Unit): Cancel = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancel]
    }
    
    extension [Self <: Cancel](x: Self) {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  trait ClosedByInboxSDK extends StObject {
    
    var closedByInboxSDK: Boolean
    
    var messageID: String
  }
  object ClosedByInboxSDK {
    
    inline def apply(closedByInboxSDK: Boolean, messageID: String): ClosedByInboxSDK = {
      val __obj = js.Dynamic.literal(closedByInboxSDK = closedByInboxSDK.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClosedByInboxSDK]
    }
    
    extension [Self <: ClosedByInboxSDK](x: Self) {
      
      inline def setClosedByInboxSDK(value: Boolean): Self = StObject.set(x, "closedByInboxSDK", value.asInstanceOf[js.Any])
      
      inline def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
    }
  }
  
  trait Contact extends StObject {
    
    var contact: typings.inboxsdk.mod.Common.Contact
  }
  object Contact {
    
    inline def apply(contact: typings.inboxsdk.mod.Common.Contact): Contact = {
      val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    extension [Self <: Contact](x: Self) {
      
      inline def setContact(value: typings.inboxsdk.mod.Common.Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    }
  }
  
  trait Fullscreen extends StObject {
    
    var fullscreen: Boolean
  }
  object Fullscreen {
    
    inline def apply(fullscreen: Boolean): Fullscreen = {
      val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fullscreen]
    }
    
    extension [Self <: Fullscreen](x: Self) {
      
      inline def setFullscreen(value: Boolean): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetMessageID extends StObject {
    
    def getMessageID(): js.Promise[String]
    
    def getThreadID(): js.Promise[String]
  }
  object GetMessageID {
    
    inline def apply(getMessageID: () => js.Promise[String], getThreadID: () => js.Promise[String]): GetMessageID = {
      val __obj = js.Dynamic.literal(getMessageID = js.Any.fromFunction0(getMessageID), getThreadID = js.Any.fromFunction0(getThreadID))
      __obj.asInstanceOf[GetMessageID]
    }
    
    extension [Self <: GetMessageID](x: Self) {
      
      inline def setGetMessageID(value: () => js.Promise[String]): Self = StObject.set(x, "getMessageID", js.Any.fromFunction0(value))
      
      inline def setGetThreadID(value: () => js.Promise[String]): Self = StObject.set(x, "getThreadID", js.Any.fromFunction0(value))
    }
  }
  
  trait IsForward extends StObject {
    
    var isForward: Boolean
  }
  object IsForward {
    
    inline def apply(isForward: Boolean): IsForward = {
      val __obj = js.Dynamic.literal(isForward = isForward.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsForward]
    }
    
    extension [Self <: IsForward](x: Self) {
      
      inline def setIsForward(value: Boolean): Self = StObject.set(x, "isForward", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageView extends StObject {
    
    var messageView: this.type
    
    var newViewState: MessageViewViewStates
    
    var oldViewState: MessageViewViewStates
  }
  object MessageView {
    
    inline def apply(messageView: MessageView, newViewState: MessageViewViewStates, oldViewState: MessageViewViewStates): MessageView = {
      val __obj = js.Dynamic.literal(messageView = messageView.asInstanceOf[js.Any], newViewState = newViewState.asInstanceOf[js.Any], oldViewState = oldViewState.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageView]
    }
    
    extension [Self <: MessageView](x: Self) {
      
      inline def setMessageView(value: MessageView): Self = StObject.set(x, "messageView", value.asInstanceOf[js.Any])
      
      inline def setNewViewState(value: MessageViewViewStates): Self = StObject.set(x, "newViewState", value.asInstanceOf[js.Any])
      
      inline def setOldViewState(value: MessageViewViewStates): Self = StObject.set(x, "oldViewState", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreventDefault extends StObject {
    
    def preventDefault(): Unit
  }
  object PreventDefault {
    
    inline def apply(preventDefault: () => Unit): PreventDefault = {
      val __obj = js.Dynamic.literal(preventDefault = js.Any.fromFunction0(preventDefault))
      __obj.asInstanceOf[PreventDefault]
    }
    
    extension [Self <: PreventDefault](x: Self) {
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
}
