package typings.inboxsdk.inboxsdkMod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconHtmlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconHtml: String
}

object MessageAttachmentIconHtmlDescriptor {
  @scala.inline
  def apply(
    iconHtml: String,
    tooltip: String | HTMLElement,
    iconClass: String = null,
    onClick: () => Unit = null
  ): MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconHtmlDescriptor]
  }
}

