package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest extends StObject {
  
  /**
    * Required. Document template used for importing all the documents.
    */
  var documentTemplate: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1ImportDocumentTemplate] = js.undefined
  
  /**
    * The Google Cloud Storage location for the documents. The path can include a wildcard. These URIs may have the forms `gs:///`. `gs:////x.`.
    */
  var gcsSource: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1GcsSources] = js.undefined
  
  /**
    * Whether to import custom metadata from Google Cloud Storage. Only valid when the document source is Google Cloud Storage URI.
    */
  var importGcsCustomMetadata: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ImportDocumentsRequest](x: Self) {
    
    inline def setDocumentTemplate(value: SchemaGoogleCloudDialogflowV2beta1ImportDocumentTemplate): Self = StObject.set(x, "documentTemplate", value.asInstanceOf[js.Any])
    
    inline def setDocumentTemplateUndefined: Self = StObject.set(x, "documentTemplate", js.undefined)
    
    inline def setGcsSource(value: SchemaGoogleCloudDialogflowV2beta1GcsSources): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    inline def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
    
    inline def setImportGcsCustomMetadata(value: Boolean): Self = StObject.set(x, "importGcsCustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setImportGcsCustomMetadataNull: Self = StObject.set(x, "importGcsCustomMetadata", null)
    
    inline def setImportGcsCustomMetadataUndefined: Self = StObject.set(x, "importGcsCustomMetadata", js.undefined)
  }
}
