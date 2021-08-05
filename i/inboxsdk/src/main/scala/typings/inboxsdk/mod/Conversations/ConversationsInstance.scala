package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConversationsInstance extends StObject {
  
  def registerFileAttachmentCardViewHandler(handler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit]): js.Function0[Unit]
  
  def registerMessageViewHandler(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit]
  
  def registerMessageViewHandlerAll(handler: js.Function1[/* messageView */ MessageView, Unit]): js.Function0[Unit]
  
  def registerThreadViewHandler(handler: js.Function1[/* threadView */ ThreadView, Unit]): js.Function0[Unit]
}
object ConversationsInstance {
  
  inline def apply(
    registerFileAttachmentCardViewHandler: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit],
    registerMessageViewHandler: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerMessageViewHandlerAll: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit],
    registerThreadViewHandler: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]
  ): ConversationsInstance = {
    val __obj = js.Dynamic.literal(registerFileAttachmentCardViewHandler = js.Any.fromFunction1(registerFileAttachmentCardViewHandler), registerMessageViewHandler = js.Any.fromFunction1(registerMessageViewHandler), registerMessageViewHandlerAll = js.Any.fromFunction1(registerMessageViewHandlerAll), registerThreadViewHandler = js.Any.fromFunction1(registerThreadViewHandler))
    __obj.asInstanceOf[ConversationsInstance]
  }
  
  extension [Self <: ConversationsInstance](x: Self) {
    
    inline def setRegisterFileAttachmentCardViewHandler(value: js.Function1[/* attachmentCardView */ AttachmentCardView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerFileAttachmentCardViewHandler", js.Any.fromFunction1(value))
    
    inline def setRegisterMessageViewHandler(value: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerMessageViewHandler", js.Any.fromFunction1(value))
    
    inline def setRegisterMessageViewHandlerAll(value: js.Function1[/* messageView */ MessageView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerMessageViewHandlerAll", js.Any.fromFunction1(value))
    
    inline def setRegisterThreadViewHandler(value: js.Function1[/* threadView */ ThreadView, Unit] => js.Function0[Unit]): Self = StObject.set(x, "registerThreadViewHandler", js.Any.fromFunction1(value))
  }
}
