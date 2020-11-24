package typings.jpushReactNative.anon

import typings.jpushReactNative.jpushReactNativeStrings.notificationArrived
import typings.jpushReactNative.jpushReactNativeStrings.notificationOpened
import typings.jpushReactNative.mod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extras extends js.Object {
  
  /**
    * 对应“通知内容”字段
    */
  var content: String = js.native
  
  /**
    * 对应“附加内容”字段
    */
  var extras: Extra = js.native
  
  /**
    * 唯一标识通知消息的ID,可用于移除消息
    */
  var messageID: String = js.native
  
  var notificationEventType: notificationArrived | notificationOpened = js.native
  
  /**
    * 对应“通知标题”字段
    */
  var title: String = js.native
}
object Extras {
  
  @scala.inline
  def apply(
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    title: String
  ): Extras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extras]
  }
  
  @scala.inline
  implicit class ExtrasOps[Self <: Extras] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtras(value: Extra): Self = this.set("extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = this.set("messageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEventType(value: notificationArrived | notificationOpened): Self = this.set("notificationEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
}
