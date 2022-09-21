package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata extends StObject {
  
  /** The generic information of the operation. */
  var genericMetadata: js.UndefOr[GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata] = js.undefined
}
object GoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3ImportDocumentsOperationMetadata](x: Self) {
    
    inline def setGenericMetadata(value: GoogleCloudDialogflowCxV3GenericKnowledgeOperationMetadata): Self = StObject.set(x, "genericMetadata", value.asInstanceOf[js.Any])
    
    inline def setGenericMetadataUndefined: Self = StObject.set(x, "genericMetadata", js.undefined)
  }
}
