package typings.jpushReactNative.anon

import typings.jpushReactNative.jpushReactNativeStrings.notificationArrived
import typings.jpushReactNative.jpushReactNativeStrings.notificationOpened
import typings.jpushReactNative.mod.Extra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extras extends StObject {
  
  /**
    * 对应“通知内容”字段
    */
  var content: String
  
  /**
    * 对应“附加内容”字段
    */
  var extras: Extra
  
  /**
    * 唯一标识通知消息的ID,可用于移除消息
    */
  var messageID: String
  
  var notificationEventType: notificationArrived | notificationOpened
  
  /**
    * 对应“通知标题”字段
    */
  var title: String
}
object Extras {
  
  inline def apply(
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    title: String
  ): Extras = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extras]
  }
  
  extension [Self <: Extras](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setExtras(value: Extra): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    inline def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
    
    inline def setNotificationEventType(value: notificationArrived | notificationOpened): Self = StObject.set(x, "notificationEventType", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
