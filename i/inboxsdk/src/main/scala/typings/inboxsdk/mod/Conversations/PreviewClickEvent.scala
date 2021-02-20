package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewClickEvent extends StObject {
  
  var attachmentCardView: AttachmentCardView = js.native
  
  def preventDefault(): Unit = js.native
}
object PreviewClickEvent {
  
  @scala.inline
  def apply(attachmentCardView: AttachmentCardView, preventDefault: () => Unit): PreviewClickEvent = {
    val __obj = js.Dynamic.literal(attachmentCardView = attachmentCardView.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault))
    __obj.asInstanceOf[PreviewClickEvent]
  }
  
  @scala.inline
  implicit class PreviewClickEventMutableBuilder[Self <: PreviewClickEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentCardView(value: AttachmentCardView): Self = StObject.set(x, "attachmentCardView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
  }
}
