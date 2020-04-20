package typings.jpushReactNative

import typings.jpushReactNative.jpushReactNativeStrings.notificationArrived
import typings.jpushReactNative.jpushReactNativeStrings.notificationOpened
import typings.jpushReactNative.mod.Extra
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBadge extends js.Object {
  /**
    *  badge:对应 Portal 推送通知界面上的可选设置里面的“badge”字段 (ios only)
    */
  var badge: String
  /**
    *  content:对应 Portal 推送通知界面上的“通知内容”字段
    */
  var content: String
  /**
    *  extras:对应 Portal 推送消息界面上的“可选设置”里的附加字段
    */
  var extras: Extra
  /**
    *  messageID:唯一标识通知消息的 ID
    */
  var messageID: String
  /**
    *  notificationEventType：分为notificationArrived和notificationOpened两种
    */
  var notificationEventType: notificationArrived | notificationOpened
  /**
    *  ring:对应 Portal 推送通知界面上的可选设置里面的“sound”字段 (ios only)
    */
  var ring: String
  /**
    *  title:对应 Portal 推送通知界面上的“通知标题”字段
    */
  var title: String
}

object AnonBadge {
  @scala.inline
  def apply(
    badge: String,
    content: String,
    extras: Extra,
    messageID: String,
    notificationEventType: notificationArrived | notificationOpened,
    ring: String,
    title: String
  ): AnonBadge = {
    val __obj = js.Dynamic.literal(badge = badge.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], messageID = messageID.asInstanceOf[js.Any], notificationEventType = notificationEventType.asInstanceOf[js.Any], ring = ring.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBadge]
  }
}

