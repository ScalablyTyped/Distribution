package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata extends StObject {
  
  /** Metadata for the Export Data Operation such as the destination of export. */
  var exportOperationMetadata: js.UndefOr[GoogleCloudDialogflowV2beta1ExportOperationMetadata] = js.undefined
  
  /** The name of the knowledge base interacted with during the operation. */
  var knowledgeBase: js.UndefOr[String] = js.undefined
  
  /** Required. Output only. The current state of this operation. */
  var state: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1KnowledgeOperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setExportOperationMetadata(value: GoogleCloudDialogflowV2beta1ExportOperationMetadata): Self = StObject.set(x, "exportOperationMetadata", value.asInstanceOf[js.Any])
    
    inline def setExportOperationMetadataUndefined: Self = StObject.set(x, "exportOperationMetadata", js.undefined)
    
    inline def setKnowledgeBase(value: String): Self = StObject.set(x, "knowledgeBase", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeBaseUndefined: Self = StObject.set(x, "knowledgeBase", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
