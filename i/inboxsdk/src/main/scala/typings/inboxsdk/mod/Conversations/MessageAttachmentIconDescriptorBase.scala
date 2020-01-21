package typings.inboxsdk.mod.Conversations

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconDescriptorBase extends js.Object {
  var iconClass: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var tooltip: String | HTMLElement
}

object MessageAttachmentIconDescriptorBase {
  @scala.inline
  def apply(tooltip: String | HTMLElement, iconClass: String = null, onClick: () => Unit = null): MessageAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    __obj.asInstanceOf[MessageAttachmentIconDescriptorBase]
  }
}

