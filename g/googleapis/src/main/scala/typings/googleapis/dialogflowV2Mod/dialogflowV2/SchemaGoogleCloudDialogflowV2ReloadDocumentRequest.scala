package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ReloadDocumentRequest extends StObject {
  
  /**
    * Optional. The path of gcs source file for reloading document content. For now, only gcs uri is supported. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`.
    */
  var contentUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Whether to import custom metadata from Google Cloud Storage. Only valid when the document source is Google Cloud Storage URI.
    */
  var importGcsCustomMetadata: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional. When enabled, the reload request is to apply partial update to the smart messaging allowlist.
    */
  var smartMessagingPartialUpdate: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ReloadDocumentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ReloadDocumentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ReloadDocumentRequest](x: Self) {
    
    inline def setContentUri(value: String): Self = StObject.set(x, "contentUri", value.asInstanceOf[js.Any])
    
    inline def setContentUriNull: Self = StObject.set(x, "contentUri", null)
    
    inline def setContentUriUndefined: Self = StObject.set(x, "contentUri", js.undefined)
    
    inline def setImportGcsCustomMetadata(value: Boolean): Self = StObject.set(x, "importGcsCustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setImportGcsCustomMetadataNull: Self = StObject.set(x, "importGcsCustomMetadata", null)
    
    inline def setImportGcsCustomMetadataUndefined: Self = StObject.set(x, "importGcsCustomMetadata", js.undefined)
    
    inline def setSmartMessagingPartialUpdate(value: Boolean): Self = StObject.set(x, "smartMessagingPartialUpdate", value.asInstanceOf[js.Any])
    
    inline def setSmartMessagingPartialUpdateNull: Self = StObject.set(x, "smartMessagingPartialUpdate", null)
    
    inline def setSmartMessagingPartialUpdateUndefined: Self = StObject.set(x, "smartMessagingPartialUpdate", js.undefined)
  }
}
