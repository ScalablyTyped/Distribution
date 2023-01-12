package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatOptions extends StObject {
  
  var actionClick: js.UndefOr[js.Function1[/* e */ ChatActionClickEvent, Unit]] = js.undefined
  
  var messages: js.UndefOr[ChatMessages] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var post: js.UndefOr[js.Function1[/* e */ ChatPostEvent, Unit]] = js.undefined
  
  var sendMessage: js.UndefOr[js.Function1[/* e */ ChatSendMessageEvent, Unit]] = js.undefined
  
  var typingEnd: js.UndefOr[js.Function1[/* e */ ChatTypingEndEvent, Unit]] = js.undefined
  
  var typingStart: js.UndefOr[js.Function1[/* e */ ChatTypingStartEvent, Unit]] = js.undefined
  
  var user: js.UndefOr[ChatUser] = js.undefined
}
object ChatOptions {
  
  inline def apply(): ChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatOptions] (val x: Self) extends AnyVal {
    
    inline def setActionClick(value: /* e */ ChatActionClickEvent => Unit): Self = StObject.set(x, "actionClick", js.Any.fromFunction1(value))
    
    inline def setActionClickUndefined: Self = StObject.set(x, "actionClick", js.undefined)
    
    inline def setMessages(value: ChatMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPost(value: /* e */ ChatPostEvent => Unit): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
    
    inline def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    inline def setSendMessage(value: /* e */ ChatSendMessageEvent => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
    
    inline def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
    
    inline def setTypingEnd(value: /* e */ ChatTypingEndEvent => Unit): Self = StObject.set(x, "typingEnd", js.Any.fromFunction1(value))
    
    inline def setTypingEndUndefined: Self = StObject.set(x, "typingEnd", js.undefined)
    
    inline def setTypingStart(value: /* e */ ChatTypingStartEvent => Unit): Self = StObject.set(x, "typingStart", js.Any.fromFunction1(value))
    
    inline def setTypingStartUndefined: Self = StObject.set(x, "typingStart", js.undefined)
    
    inline def setUser(value: ChatUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
