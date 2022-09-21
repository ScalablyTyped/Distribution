package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2ImportConversationDataOperationMetadata extends StObject {
  
  /** The resource name of the imported conversation dataset. Format: `projects//locations//conversationDatasets/` */
  var conversationDataset: js.UndefOr[String] = js.undefined
  
  /** Timestamp when import conversation data request was created. The time is measured on server side. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Partial failures are failures that don't fail the whole long running operation, e.g. single files that couldn't be read. */
  var partialFailures: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDialogflowV2ImportConversationDataOperationMetadata {
  
  inline def apply(): GoogleCloudDialogflowV2ImportConversationDataOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2ImportConversationDataOperationMetadata]
  }
  
  extension [Self <: GoogleCloudDialogflowV2ImportConversationDataOperationMetadata](x: Self) {
    
    inline def setConversationDataset(value: String): Self = StObject.set(x, "conversationDataset", value.asInstanceOf[js.Any])
    
    inline def setConversationDatasetUndefined: Self = StObject.set(x, "conversationDataset", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setPartialFailures(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "partialFailures", value.asInstanceOf[js.Any])
    
    inline def setPartialFailuresUndefined: Self = StObject.set(x, "partialFailures", js.undefined)
    
    inline def setPartialFailuresVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "partialFailures", js.Array(value*))
  }
}
