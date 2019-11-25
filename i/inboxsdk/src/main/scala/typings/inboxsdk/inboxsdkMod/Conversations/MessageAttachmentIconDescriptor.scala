package typings.inboxsdk.inboxsdkMod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.inboxsdk.inboxsdkMod.Conversations.MessageAttachmentIconUrlDescriptor
  - typings.inboxsdk.inboxsdkMod.Conversations.MessageAttachmentIconHtmlDescriptor
*/
trait MessageAttachmentIconDescriptor extends js.Object

object MessageAttachmentIconDescriptor {
  @scala.inline
  def MessageAttachmentIconUrlDescriptor(
    iconUrl: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: () => Unit = null
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
  @scala.inline
  def MessageAttachmentIconHtmlDescriptor(
    iconHtml: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: () => Unit = null
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
}

