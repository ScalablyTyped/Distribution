package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowAttachmentIconUrlDescriptor
  extends ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: java.lang.String
}

object ThreadRowAttachmentIconUrlDescriptor {
  @scala.inline
  def apply(iconUrl: java.lang.String, iconClass: java.lang.String = null, tooltip: java.lang.String = null): ThreadRowAttachmentIconUrlDescriptor = {
    val __obj = js.Dynamic.literal(iconUrl = iconUrl)
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowAttachmentIconUrlDescriptor]
  }
}

