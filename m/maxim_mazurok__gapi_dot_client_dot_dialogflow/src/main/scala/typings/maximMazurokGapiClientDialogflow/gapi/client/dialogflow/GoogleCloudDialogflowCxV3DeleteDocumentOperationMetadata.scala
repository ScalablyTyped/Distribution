package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DeleteDocumentOperationMetadata extends StObject {
  
  /** The generic information of the operation. */
  var genericMetadata: js.UndefOr[GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata] = js.undefined
}
object GoogleCloudDialogflowCxV3DeleteDocumentOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3DeleteDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DeleteDocumentOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3DeleteDocumentOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
