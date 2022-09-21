package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ImportConversationDataOperationResponse extends StObject {
  
  /**
    * The resource name of the imported conversation dataset. Format: `projects//locations//conversationDatasets/`
    */
  var conversationDataset: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Number of conversations imported successfully.
    */
  var importCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ImportConversationDataOperationResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ImportConversationDataOperationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ImportConversationDataOperationResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ImportConversationDataOperationResponse](x: Self) {
    
    inline def setConversationDataset(value: String): Self = StObject.set(x, "conversationDataset", value.asInstanceOf[js.Any])
    
    inline def setConversationDatasetNull: Self = StObject.set(x, "conversationDataset", null)
    
    inline def setConversationDatasetUndefined: Self = StObject.set(x, "conversationDataset", js.undefined)
    
    inline def setImportCount(value: Double): Self = StObject.set(x, "importCount", value.asInstanceOf[js.Any])
    
    inline def setImportCountNull: Self = StObject.set(x, "importCount", null)
    
    inline def setImportCountUndefined: Self = StObject.set(x, "importCount", js.undefined)
  }
}
