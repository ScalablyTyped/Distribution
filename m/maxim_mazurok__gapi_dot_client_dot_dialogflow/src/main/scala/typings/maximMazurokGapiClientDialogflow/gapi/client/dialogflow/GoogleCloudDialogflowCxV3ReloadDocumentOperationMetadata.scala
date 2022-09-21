package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ReloadDocumentOperationMetadata extends StObject {
  
  /** The generic information of the operation. */
  var genericMetadata: js.UndefOr[GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata] = js.undefined
}
object GoogleCloudDialogflowCxV3ReloadDocumentOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3ReloadDocumentOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ReloadDocumentOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ReloadDocumentOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
