package typings.inboxsdk.inboxsdkMod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconUrlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconUrl: String
}

object MessageAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(
    iconUrl: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: () => Unit = null
  ): MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconUrlDescriptor]
  }
}

