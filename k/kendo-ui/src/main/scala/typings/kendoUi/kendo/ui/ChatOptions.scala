package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatOptions extends StObject {
  
  var actionClick: js.UndefOr[js.Function1[/* e */ ChatActionClickEvent, Unit]] = js.native
  
  var messages: js.UndefOr[ChatMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var post: js.UndefOr[js.Function1[/* e */ ChatPostEvent, Unit]] = js.native
  
  var sendMessage: js.UndefOr[js.Function1[/* e */ ChatSendMessageEvent, Unit]] = js.native
  
  var typingEnd: js.UndefOr[js.Function1[/* e */ ChatTypingEndEvent, Unit]] = js.native
  
  var typingStart: js.UndefOr[js.Function1[/* e */ ChatTypingStartEvent, Unit]] = js.native
  
  var user: js.UndefOr[ChatUser] = js.native
}
object ChatOptions {
  
  @scala.inline
  def apply(): ChatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatOptions]
  }
  
  @scala.inline
  implicit class ChatOptionsMutableBuilder[Self <: ChatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionClick(value: /* e */ ChatActionClickEvent => Unit): Self = StObject.set(x, "actionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setActionClickUndefined: Self = StObject.set(x, "actionClick", js.undefined)
    
    @scala.inline
    def setMessages(value: ChatMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPost(value: /* e */ ChatPostEvent => Unit): Self = StObject.set(x, "post", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostUndefined: Self = StObject.set(x, "post", js.undefined)
    
    @scala.inline
    def setSendMessage(value: /* e */ ChatSendMessageEvent => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSendMessageUndefined: Self = StObject.set(x, "sendMessage", js.undefined)
    
    @scala.inline
    def setTypingEnd(value: /* e */ ChatTypingEndEvent => Unit): Self = StObject.set(x, "typingEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypingEndUndefined: Self = StObject.set(x, "typingEnd", js.undefined)
    
    @scala.inline
    def setTypingStart(value: /* e */ ChatTypingStartEvent => Unit): Self = StObject.set(x, "typingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTypingStartUndefined: Self = StObject.set(x, "typingStart", js.undefined)
    
    @scala.inline
    def setUser(value: ChatUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
