package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenderAttachmentsOptions extends StObject {
  
  var attachmentLayout: js.UndefOr[String] = js.undefined
  
  var attachments: js.UndefOr[ChatRenderAttachmentsOptionsAttachments] = js.undefined
}
object ChatRenderAttachmentsOptions {
  
  inline def apply(): ChatRenderAttachmentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptions]
  }
  
  extension [Self <: ChatRenderAttachmentsOptions](x: Self) {
    
    inline def setAttachmentLayout(value: String): Self = StObject.set(x, "attachmentLayout", value.asInstanceOf[js.Any])
    
    inline def setAttachmentLayoutUndefined: Self = StObject.set(x, "attachmentLayout", js.undefined)
    
    inline def setAttachments(value: ChatRenderAttachmentsOptionsAttachments): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
  }
}
