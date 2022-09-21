package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsKnowledgebasesDocumentsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Whether to import custom metadata from Google Cloud Storage. Only valid when the document source is Google Cloud Storage URI.
    */
  var importGcsCustomMetadata: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. The knowledge base to create a document for. Format: `projects//locations//knowledgeBases/`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Document] = js.undefined
}
object ParamsResourceProjectsLocationsKnowledgebasesDocumentsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsKnowledgebasesDocumentsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsKnowledgebasesDocumentsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsKnowledgebasesDocumentsCreate](x: Self) {
    
    inline def setImportGcsCustomMetadata(value: Boolean): Self = StObject.set(x, "importGcsCustomMetadata", value.asInstanceOf[js.Any])
    
    inline def setImportGcsCustomMetadataUndefined: Self = StObject.set(x, "importGcsCustomMetadata", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudDialogflowV2beta1Document): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
