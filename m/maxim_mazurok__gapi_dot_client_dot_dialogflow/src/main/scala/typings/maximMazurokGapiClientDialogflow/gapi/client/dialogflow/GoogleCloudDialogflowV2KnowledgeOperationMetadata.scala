package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2KnowledgeOperationMetadata extends StObject {
  
  /** Metadata for the Export Data Operation such as the destination of export. */
  var exportOperationMetadata: js.UndefOr[GoogleCloudDialogflowV2ExportOperationMetadata] = js.undefined
  
  /** The name of the knowledge base interacted with during the operation. */
  var knowledgeBase: js.UndefOr[String] = js.undefined
  
  /** Output only. The current state of this operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2KnowledgeOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2KnowledgeOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV2KnowledgeOperationMetadata](x: Self) {
    
    inline def setExportOperationMetadata(value: GoogleCloudDialogflowV2ExportOperationMetadata): Self = StObject.set(x, "exportOperationMetadata", value.asInstanceOf[js.Any])
    
    inline def setExportOperationMetadataUndefined: Self = StObject.set(x, "exportOperationMetadata", js.undefined)
    
    inline def setKnowledgeBase(value: String): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
