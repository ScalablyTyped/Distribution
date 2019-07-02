package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconUrlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconUrl: java.lang.String
}

object MessageAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    tooltip: java.lang.String | stdLib.HTMLElement,
    iconClass: java.lang.String = null,
    onClick: () => scala.Unit = null
  ): MessageAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl, tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconUrlDescriptor]
  }
}

