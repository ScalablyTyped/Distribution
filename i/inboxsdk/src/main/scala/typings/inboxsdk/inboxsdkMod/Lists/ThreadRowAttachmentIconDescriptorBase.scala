package typings.inboxsdk.inboxsdkMod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowAttachmentIconDescriptorBase extends js.Object {
  var tooltip: js.UndefOr[String] = js.undefined
}

object ThreadRowAttachmentIconDescriptorBase {
  @scala.inline
  def apply(tooltip: String = null): ThreadRowAttachmentIconDescriptorBase = {
    val __obj = js.Dynamic.literal()
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowAttachmentIconDescriptorBase]
  }
}

