package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrivateMessageInfo extends StObject {
  
  /**
    * Annotations private to {@code userId\}.
    */
  var annotations: js.UndefOr[js.Array[SchemaAnnotation]] = js.undefined
  
  /**
    * Attachments private to {@code userId\}.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.undefined
  
  var contextualAddOnMarkup: js.UndefOr[js.Array[SchemaGoogleChatV1ContextualAddOnMarkup]] = js.undefined
  
  var gsuiteIntegrationMetadata: js.UndefOr[js.Array[SchemaGsuiteIntegrationMetadata]] = js.undefined
  
  /**
    * Text private to {@code user_id\}. Initial restriction: Only one of public text or private text is rendered on the client. So if public text is set, private text is ignored.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The elements in this struct are visible to this user.
    */
  var userId: js.UndefOr[SchemaUserId] = js.undefined
}
object SchemaPrivateMessageInfo {
  
  inline def apply(): SchemaPrivateMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrivateMessageInfo]
  }
  
  extension [Self <: SchemaPrivateMessageInfo](x: Self) {
    
    inline def setAnnotations(value: js.Array[SchemaAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: SchemaAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAttachments(value: js.Array[SchemaAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: SchemaAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setContextualAddOnMarkup(value: js.Array[SchemaGoogleChatV1ContextualAddOnMarkup]): Self = StObject.set(x, "contextualAddOnMarkup", value.asInstanceOf[js.Any])
    
    inline def setContextualAddOnMarkupUndefined: Self = StObject.set(x, "contextualAddOnMarkup", js.undefined)
    
    inline def setContextualAddOnMarkupVarargs(value: SchemaGoogleChatV1ContextualAddOnMarkup*): Self = StObject.set(x, "contextualAddOnMarkup", js.Array(value*))
    
    inline def setGsuiteIntegrationMetadata(value: js.Array[SchemaGsuiteIntegrationMetadata]): Self = StObject.set(x, "gsuiteIntegrationMetadata", value.asInstanceOf[js.Any])
    
    inline def setGsuiteIntegrationMetadataUndefined: Self = StObject.set(x, "gsuiteIntegrationMetadata", js.undefined)
    
    inline def setGsuiteIntegrationMetadataVarargs(value: SchemaGsuiteIntegrationMetadata*): Self = StObject.set(x, "gsuiteIntegrationMetadata", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUserId(value: SchemaUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
