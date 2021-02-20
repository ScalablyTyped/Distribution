package typings.inboxsdk.mod.Conversations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsToolbarButtonEvent extends StObject {
  
  var attachmentCardViews: js.Array[AttachmentCardView] = js.native
}
object AttachmentsToolbarButtonEvent {
  
  @scala.inline
  def apply(attachmentCardViews: js.Array[AttachmentCardView]): AttachmentsToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(attachmentCardViews = attachmentCardViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsToolbarButtonEvent]
  }
  
  @scala.inline
  implicit class AttachmentsToolbarButtonEventMutableBuilder[Self <: AttachmentsToolbarButtonEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentCardViews(value: js.Array[AttachmentCardView]): Self = StObject.set(x, "attachmentCardViews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentCardViewsVarargs(value: AttachmentCardView*): Self = StObject.set(x, "attachmentCardViews", js.Array(value :_*))
  }
}
