package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttachmentIconDescriptor extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var tooltip: java.lang.String
}

object MessageAttachmentIconDescriptor {
  @scala.inline
  def apply(
    iconUrl: java.lang.String,
    tooltip: java.lang.String,
    iconClass: java.lang.String = null,
    onClick: js.Function0[scala.Unit] = null
  ): MessageAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iconUrl")(iconUrl)
    __obj.updateDynamic("tooltip")(tooltip)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    __obj.asInstanceOf[MessageAttachmentIconDescriptor]
  }
}

