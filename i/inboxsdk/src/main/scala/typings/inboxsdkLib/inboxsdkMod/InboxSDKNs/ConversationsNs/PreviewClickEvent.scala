package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewClickEvent extends js.Object {
  var attachmentCardView: AttachmentCardView
  def preventDefault(): scala.Unit
}

object PreviewClickEvent {
  @scala.inline
  def apply(attachmentCardView: AttachmentCardView, preventDefault: js.Function0[scala.Unit]): PreviewClickEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentCardView")(attachmentCardView)
    __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.asInstanceOf[PreviewClickEvent]
  }
}

