package typings.imgurRestApi.ImgurRestApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountNotifications extends StObject {
  
  var messages: js.Array[Notification[Conversation]]
  
  var replies: js.Array[Notification[Comment]]
}
object AccountNotifications {
  
  @scala.inline
  def apply(messages: js.Array[Notification[Conversation]], replies: js.Array[Notification[Comment]]): AccountNotifications = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], replies = replies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountNotifications]
  }
  
  @scala.inline
  implicit class AccountNotificationsMutableBuilder[Self <: AccountNotifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessages(value: js.Array[Notification[Conversation]]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesVarargs(value: Notification[Conversation]*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[Notification[Comment]]): Self = StObject.set(x, "replies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesVarargs(value: Notification[Comment]*): Self = StObject.set(x, "replies", js.Array(value :_*))
  }
}
