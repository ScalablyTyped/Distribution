package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconDescriptorBase extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tooltip: java.lang.String | stdLib.HTMLElement
}

object MessageAttachmentIconDescriptorBase {
  @scala.inline
  def apply(
    tooltip: java.lang.String | stdLib.HTMLElement,
    iconClass: java.lang.String = null,
    onClick: () => scala.Unit = null
  ): MessageAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconDescriptorBase]
  }
}

