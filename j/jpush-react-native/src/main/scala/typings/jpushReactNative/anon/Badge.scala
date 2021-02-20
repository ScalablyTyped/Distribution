package typings.jpushReactNative.anon

import typings.jpushReactNative.jpushReactNativeStrings.notificationArrived
import typings.jpushReactNative.jpushReactNativeStrings.notificationOpened
import typings.jpushReactNative.mod.Extra
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Badge extends StObject {
  
  /**
    *  badge:对应 Portal 推送通知界面上的可选设置里面的“badge”字段 (ios only)
    */
  var badge: String = js.native
  
  /**
    *  content:对应 Portal 推送通知界面上的“通知内容”字段
    */
  var content: String = js.native
  
  /**
    *  extras:对应 Portal 推送消息界面上的“可选设置”里的附加字段
    */
  var extras: Extra = js.native
  
  /**
    *  messageID:唯一标识通知消息的 ID
    */
  var messageID: String = js.native
  
  /**
    *  notificationEventType：分为notificationArrived和notificationOpened两种
    */
  var notificationEventType: notificationArrived | notificationOpened = js.native
  
  /**
    *  ring:对应 Portal 推送通知界面上的可选设置里面的“sound”字段 (ios only)
    */
  var ring: String = js.native
  
  /**
    *  title:对应 Portal 推送通知界面上的“通知标题”字段
    */
  var title: String = js.native
}
object Badge {
  
  @scala.inline
  def apply(
    badge: String,
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    ring: String,
    title: String
  ): Badge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], ring = ring.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Badge]
  }
  
  @scala.inline
  implicit class BadgeMutableBuilder[Self <: Badge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtras(value: Extra): Self = StObject.set(x, "extras", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageID(value: String): Self = StObject.set(x, "messageID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEventType(value: notificationArrived | notificationOpened): Self = StObject.set(x, "notificationEventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRing(value: String): Self = StObject.set(x, "ring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
