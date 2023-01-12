package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamitePrivateMessageInfo extends StObject {
  
  /** Annotations private to {@code userId}. */
  var annotations: js.UndefOr[js.Array[AppsDynamiteAnnotation]] = js.undefined
  
  /** Attachments private to {@code userId}. */
  var attachments: js.UndefOr[js.Array[AppsDynamiteAttachment]] = js.undefined
  
  var contextualAddOnMarkup: js.UndefOr[js.Array[GoogleChatV1ContextualAddOnMarkup]] = js.undefined
  
  var gsuiteIntegrationMetadata: js.UndefOr[js.Array[AppsDynamiteGsuiteIntegrationMetadata]] = js.undefined
  
  /** Text private to {@code user_id}. Initial restriction: Only one of public text or private text is rendered on the client. So if public text is set, private text is ignored. */
  var text: js.UndefOr[String] = js.undefined
  
  /** Required. The elements in this struct are visible to this user. */
  var userId: js.UndefOr[AppsDynamiteUserId] = js.undefined
}
object AppsDynamitePrivateMessageInfo {
  
  inline def apply(): AppsDynamitePrivateMessageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamitePrivateMessageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppsDynamitePrivateMessageInfo] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: js.Array[AppsDynamiteAnnotation]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: AppsDynamiteAnnotation*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAttachments(value: js.Array[AppsDynamiteAttachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: AppsDynamiteAttachment*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setContextualAddOnMarkup(value: js.Array[GoogleChatV1ContextualAddOnMarkup]): Self = StObject.set(x, "contextualAddOnMarkup", value.asInstanceOf[js.Any])
    
    inline def setContextualAddOnMarkupUndefined: Self = StObject.set(x, "contextualAddOnMarkup", js.undefined)
    
    inline def setContextualAddOnMarkupVarargs(value: GoogleChatV1ContextualAddOnMarkup*): Self = StObject.set(x, "contextualAddOnMarkup", js.Array(value*))
    
    inline def setGsuiteIntegrationMetadata(value: js.Array[AppsDynamiteGsuiteIntegrationMetadata]): Self = StObject.set(x, "gsuiteIntegrationMetadata", value.asInstanceOf[js.Any])
    
    inline def setGsuiteIntegrationMetadataUndefined: Self = StObject.set(x, "gsuiteIntegrationMetadata", js.undefined)
    
    inline def setGsuiteIntegrationMetadataVarargs(value: AppsDynamiteGsuiteIntegrationMetadata*): Self = StObject.set(x, "gsuiteIntegrationMetadata", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setUserId(value: AppsDynamiteUserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
