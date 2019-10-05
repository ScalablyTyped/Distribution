package typings.inboxsdk.inboxsdkMod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsInstance extends js.Object {
  def registerFileAttachmentCardViewHandler(handler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit]): js.Function0[Unit]
  def registerMessageViewHandler(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit]
  def registerMessageViewHandlerAll(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit]
  def registerThreadViewHandler(handler: js.Function1[/* threadView */ ThreadView, Unit]): js.Function0[Unit]
}

object ConversationsInstance {
  @scala.inline
  def apply(
    registerFileAttachmentCardViewHandler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit],
    registerMessageViewHandler: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerMessageViewHandlerAll: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerThreadViewHandler: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]
  ): ConversationsInstance = {
    val __obj = js.Dynamic.literal(registerFileAttachmentCardViewHandler = js.Any.fromFunction1(registerFileAttachmentCardViewHandler), registerMessageViewHandler = js.Any.fromFunction1(registerMessageViewHandler), registerMessageViewHandlerAll = js.Any.fromFunction1(registerMessageViewHandlerAll), registerThreadViewHandler = js.Any.fromFunction1(registerThreadViewHandler))
  
    __obj.asInstanceOf[ConversationsInstance]
  }
}

