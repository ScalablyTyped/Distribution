package typings.inboxsdk.mod.Conversations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachmentsToolbarButtonEvent extends js.Object {
  
  var attachmentCardViews: js.Array[AttachmentCardView] = js.native
}
object AttachmentsToolbarButtonEvent {
  
  @scala.inline
  def apply(attachmentCardViews: js.Array[AttachmentCardView]): AttachmentsToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(attachmentCardViews = attachmentCardViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsToolbarButtonEvent]
  }
  
  @scala.inline
  implicit class AttachmentsToolbarButtonEventOps[Self <: AttachmentsToolbarButtonEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachmentCardViewsVarargs(value: AttachmentCardView*): Self = this.set("attachmentCardViews", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentCardViews(value: js.Array[AttachmentCardView]): Self = this.set("attachmentCardViews", value.asInstanceOf[js.Any])
  }
}
