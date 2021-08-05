package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents media content, such as a photo, that can be attached to a
  * timeline item.
  */
trait SchemaAttachment extends StObject {
  
  /**
    * The MIME type of the attachment.
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The URL for the content.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the attachment.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the contentUrl is not available because the attachment
    * content is still being processed. If the caller wishes to retrieve the
    * content, it should try again later.
    */
  var isProcessingContent: js.UndefOr[Boolean] = js.undefined
}
object SchemaAttachment {
  
  inline def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  extension [Self <: SchemaAttachment](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsProcessingContent(value: Boolean): Self = StObject.set(x, "isProcessingContent", value.asInstanceOf[js.Any])
    
    inline def setIsProcessingContentUndefined: Self = StObject.set(x, "isProcessingContent", js.undefined)
  }
}
