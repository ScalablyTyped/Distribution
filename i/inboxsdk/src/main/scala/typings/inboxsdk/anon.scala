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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Added] (val x: Self) extends AnyVal {
      
      inline def setAdded(value: js.Array[typings.inboxsdk.mod.Common.Contact]): Self = StObject.set(x, "added", value.asInstanceOf[js.Any])
      
      inline def setAddedVarargs(value: typings.inboxsdk.mod.Common.Contact*): Self = StObject.set(x, "added", js.Array(value*))
      
      inline def setRemoved(value: js.Array[typings.inboxsdk.mod.Common.Contact]): Self = StObject.set(x, "removed", value.asInstanceOf[js.Any])
      
      inline def setRemovedVarargs(value: typings.inboxsdk.mod.Common.Contact*): Self = StObject.set(x, "removed", js.Array(value*))
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClosedByInboxSDK] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fullscreen] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetMessageID] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsForward] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageView] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreventDefault] (val x: Self) extends AnyVal {
      
      inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    }
  }
}
