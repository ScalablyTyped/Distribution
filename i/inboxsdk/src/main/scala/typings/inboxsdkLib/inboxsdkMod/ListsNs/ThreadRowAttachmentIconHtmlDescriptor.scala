package typings
package inboxsdkLib.inboxsdkMod.ListsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreadRowAttachmentIconHtmlDescriptor
  extends ThreadRowAttachmentIconDescriptorBase
     with ThreadRowAttachmentIconDescriptor {
  var iconHtml: java.lang.String
}

object ThreadRowAttachmentIconHtmlDescriptor {
  @scala.inline
  def apply(iconHtml: java.lang.String, tooltip: java.lang.String = null): ThreadRowAttachmentIconHtmlDescriptor = {
    val __obj = js.Dynamic.literal(iconHtml = iconHtml)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[ThreadRowAttachmentIconHtmlDescriptor]
  }
}

