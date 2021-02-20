package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatRenderAttachmentsOptions extends StObject {
  
  var attachmentLayout: js.UndefOr[String] = js.native
  
  var attachments: js.UndefOr[ChatRenderAttachmentsOptionsAttachments] = js.native
}
object ChatRenderAttachmentsOptions {
  
  @scala.inline
  def apply(): ChatRenderAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptions]
  }
  
  @scala.inline
  implicit class ChatRenderAttachmentsOptionsMutableBuilder[Self <: ChatRenderAttachmentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentLayout(value: String): Self = StObject.set(x, "attachmentLayout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentLayoutUndefined: Self = StObject.set(x, "attachmentLayout", js.undefined)
    
    @scala.inline
    def setAttachments(value: ChatRenderAttachmentsOptionsAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
  }
}
