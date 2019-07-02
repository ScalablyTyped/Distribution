package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconHtmlDescriptor
  extends MessageAttachmentIconDescriptorBase
     with MessageAttachmentIconDescriptor {
  var iconHtml: java.lang.String
}

object MessageAttachmentIconHtmlDescriptor {
  @scala.inline
  def apply(
    iconHtml: java.lang.String,
    tooltip: java.lang.String | stdLib.HTMLElement,
    iconClass: java.lang.String = null,
    onClick: () => scala.Unit = null
  ): MessageAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml, tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconHtmlDescriptor]
  }
}

