package typings.inboxsdk.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowAttachmentIconUrlDescriptor
  extends ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  var iconClass: js.UndefOr[String] = js.undefined
  var iconUrl: String
}

object ThreadRowAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(iconUrl: String, iconClass: String = null, tooltip: String = null): ThreadRowAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowAttachmentIconUrlDescriptor]
  }
}

