package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest extends StObject {
  
  /**
    * The path for a Cloud Storage source file for reloading document content. If not provided, the Document's existing source will be reloaded.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1GcsSource] = js.undefined
  
  /**
    * Whether to import custom metadata from Google Cloud Storage. Only valid when the document source is Google Cloud Storage URI.
    */
  var importGcsCustomMetadata: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ReloadDocumentRequest](x: Self) {
    
    inline def setGcsSource(value: SchemaGoogleCloudDialogflowV2beta1GcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setImportGcsCustomMetadata(value: Boolean): Self = StObject.set(x, "importGcsCustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setImportGcsCustomMetadataNull: Self = StObject.set(x, "importGcsCustomMetadata", null)
    
    inline def setImportGcsCustomMetadataUndefined: Self = StObject.set(x, "importGcsCustomMetadata", js.undefined)
  }
}
