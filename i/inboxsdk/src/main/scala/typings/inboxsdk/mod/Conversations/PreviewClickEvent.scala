package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewClickEvent extends js.Object {
  var attachmentCardView: AttachmentCardView
  def preventDefault(): Unit
}

object PreviewClickEvent {
  @scala.inline
  def apply(attachmentCardView: AttachmentCardView, preventDefault: () => Unit): PreviewClickEvent = {
    val __obj = js.Dynamic.literal(attachmentCardView = attachmentCardView.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[PreviewClickEvent]
  }
}

