package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatRenderAttachmentsOptionsAttachments extends StObject {
  
  var content: js.UndefOr[js.Any] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
}
object ChatRenderAttachmentsOptionsAttachments {
  
  inline def apply(): ChatRenderAttachmentsOptionsAttachments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChatRenderAttachmentsOptionsAttachments]
  }
  
  extension [Self <: ChatRenderAttachmentsOptionsAttachments](x: Self) {
    
    inline def setContent(value: js.Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
  }
}
