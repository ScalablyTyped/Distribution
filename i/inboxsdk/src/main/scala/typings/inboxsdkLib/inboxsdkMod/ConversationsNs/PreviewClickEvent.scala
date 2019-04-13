package typings
package inboxsdkLib.inboxsdkMod.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewClickEvent extends js.Object {
  var attachmentCardView: AttachmentCardView
  def preventDefault(): scala.Unit
}

object PreviewClickEvent {
  @scala.inline
  def apply(attachmentCardView: AttachmentCardView, preventDefault: () => scala.Unit): PreviewClickEvent = {
    val __obj = js.Dynamic.literal(attachmentCardView = attachmentCardView, preventDefault = js.Any.fromFunction0(preventDefault))
  
    __obj.asInstanceOf[PreviewClickEvent]
  }
}

