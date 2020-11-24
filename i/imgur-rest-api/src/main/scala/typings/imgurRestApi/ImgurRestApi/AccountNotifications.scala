package typings.imgurRestApi.ImgurRestApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountNotifications extends js.Object {
  
  var messages: js.Array[Notification[Conversation]] = js.native
  
  var replies: js.Array[Notification[Comment]] = js.native
}
object AccountNotifications {
  
  @scala.inline
  def apply(messages: js.Array[Notification[Conversation]], replies: js.Array[Notification[Comment]]): AccountNotifications = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], replies = replies.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountNotifications]
  }
  
  @scala.inline
  implicit class AccountNotificationsOps[Self <: AccountNotifications] (val x: Self) extends AnyVal {
    
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
    def setMessagesVarargs(value: Notification[Conversation]*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[Notification[Conversation]]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepliesVarargs(value: Notification[Comment]*): Self = this.set("replies", js.Array(value :_*))
    
    @scala.inline
    def setReplies(value: js.Array[Notification[Comment]]): Self = this.set("replies", value.asInstanceOf[js.Any])
  }
}
