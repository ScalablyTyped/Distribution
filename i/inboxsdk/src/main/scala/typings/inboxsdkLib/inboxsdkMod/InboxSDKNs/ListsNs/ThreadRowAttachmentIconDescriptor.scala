package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowAttachmentIconDescriptor extends js.Object {
  var iconClass: js.UndefOr[java.lang.String] = js.undefined
  var iconUrl: js.UndefOr[java.lang.String] = js.undefined
  var tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object ThreadRowAttachmentIconDescriptor {
  @scala.inline
  def apply(
    iconClass: java.lang.String = null,
    iconUrl: java.lang.String = null,
    tooltip: java.lang.String = null
  ): ThreadRowAttachmentIconDescriptor = {
    val __obj = js.Dynamic.literal()
    if (iconClass != null) __obj.updateDynamic("iconClass")(iconClass)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptor]
  }
}

