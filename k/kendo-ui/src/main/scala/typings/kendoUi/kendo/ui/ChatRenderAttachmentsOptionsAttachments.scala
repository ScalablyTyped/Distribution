package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenderAttachmentsOptionsAttachments extends StObject {
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
}
object ChatRenderAttachmentsOptionsAttachments {
  
  @scala.inline
  def apply(): ChatRenderAttachmentsOptionsAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptionsAttachments]
  }
  
  @scala.inline
  implicit class ChatRenderAttachmentsOptionsAttachmentsMutableBuilder[Self <: ChatRenderAttachmentsOptionsAttachments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
