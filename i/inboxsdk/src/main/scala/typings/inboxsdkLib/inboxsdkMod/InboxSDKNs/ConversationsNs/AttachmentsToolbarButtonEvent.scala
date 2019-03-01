package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsToolbarButtonEvent extends js.Object {
  var attachmentCardViews: js.Array[AttachmentCardView]
}

object AttachmentsToolbarButtonEvent {
  @scala.inline
  def apply(attachmentCardViews: js.Array[AttachmentCardView]): AttachmentsToolbarButtonEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentCardViews")(attachmentCardViews)
    __obj.asInstanceOf[AttachmentsToolbarButtonEvent]
  }
}

