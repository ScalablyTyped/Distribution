package typings
package inboxsdkLib.inboxsdkMod.InboxSDKNs.ConversationsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversationsInstance extends js.Object {
  def registerFileAttachmentCardViewHandler(handler: js.Function1[/* attachmentCardView */ AttachmentCardView, scala.Unit]): js.Function0[scala.Unit]
  def registerMessageViewHandler(handler: js.Function1[/* messageView */ MessageView, scala.Unit]): js.Function0[scala.Unit]
  def registerMessageViewHandlerAll(handler: js.Function1[/* messageView */ MessageView, scala.Unit]): js.Function0[scala.Unit]
  def registerThreadViewHandler(handler: js.Function1[/* threadView */ ThreadView, scala.Unit]): js.Function0[scala.Unit]
}

