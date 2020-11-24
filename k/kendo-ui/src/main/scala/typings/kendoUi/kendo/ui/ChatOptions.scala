package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatOptions extends js.Object {
  
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
  implicit class ChatOptionsOps[Self <: ChatOptions] (val x: Self) extends AnyVal {
    
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
    def setActionClick(value: /* e */ ChatActionClickEvent => Unit): Self = this.set("actionClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteActionClick: Self = this.set("actionClick", js.undefined)
    
    @scala.inline
    def setMessages(value: ChatMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPost(value: /* e */ ChatPostEvent => Unit): Self = this.set("post", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePost: Self = this.set("post", js.undefined)
    
    @scala.inline
    def setSendMessage(value: /* e */ ChatSendMessageEvent => Unit): Self = this.set("sendMessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSendMessage: Self = this.set("sendMessage", js.undefined)
    
    @scala.inline
    def setTypingEnd(value: /* e */ ChatTypingEndEvent => Unit): Self = this.set("typingEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTypingEnd: Self = this.set("typingEnd", js.undefined)
    
    @scala.inline
    def setTypingStart(value: /* e */ ChatTypingStartEvent => Unit): Self = this.set("typingStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTypingStart: Self = this.set("typingStart", js.undefined)
    
    @scala.inline
    def setUser(value: ChatUser): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
