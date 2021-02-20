package typings.googleapis.mirrorV1Mod.mirrorV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents media content, such as a photo, that can be attached to a
  * timeline item.
  */
@js.native
trait SchemaAttachment extends StObject {
  
  /**
    * The MIME type of the attachment.
    */
  var contentType: js.UndefOr[String] = js.native
  
  /**
    * The URL for the content.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * The ID of the attachment.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Indicates that the contentUrl is not available because the attachment
    * content is still being processed. If the caller wishes to retrieve the
    * content, it should try again later.
    */
  var isProcessingContent: js.UndefOr[Boolean] = js.native
}
object SchemaAttachment {
  
  @scala.inline
  def apply(): SchemaAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttachment]
  }
  
  @scala.inline
  implicit class SchemaAttachmentMutableBuilder[Self <: SchemaAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIsProcessingContent(value: Boolean): Self = StObject.set(x, "isProcessingContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsProcessingContentUndefined: Self = StObject.set(x, "isProcessingContent", js.undefined)
  }
}
