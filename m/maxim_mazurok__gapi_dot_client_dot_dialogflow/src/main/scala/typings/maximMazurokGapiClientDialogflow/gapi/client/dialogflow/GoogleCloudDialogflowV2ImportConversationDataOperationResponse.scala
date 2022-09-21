package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ImportConversationDataOperationResponse extends StObject {
  
  /** The resource name of the imported conversation dataset. Format: `projects//locations//conversationDatasets/` */
  var conversationDataset: js.UndefOr[String] = js.undefined
  
  /** Number of conversations imported successfully. */
  var importCount: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDialogflowV2ImportConversationDataOperationResponse {
  
  inline def apply(): GoogleCloudDialogflowV2ImportConversationDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ImportConversationDataOperationResponse]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ImportConversationDataOperationResponse](x: Self) {
    
    inline def setConversationDataset(value: String): Self = StObject.set(x, "conversationDataset", value.asInstanceOf[js.Any])
    
    inline def setConversationDatasetUndefined: Self = StObject.set(x, "conversationDataset", js.undefined)
    
    inline def setImportCount(value: Double): Self = StObject.set(x, "importCount", value.asInstanceOf[js.Any])
    
    inline def setImportCountUndefined: Self = StObject.set(x, "importCount", js.undefined)
  }
}
