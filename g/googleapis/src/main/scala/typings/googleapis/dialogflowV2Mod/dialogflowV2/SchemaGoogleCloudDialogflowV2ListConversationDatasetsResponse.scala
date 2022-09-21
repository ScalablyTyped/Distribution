package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse extends StObject {
  
  /**
    * The list of datasets to return.
    */
  var conversationDatasets: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2ConversationDataset]] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListConversationDatasetsResponse](x: Self) {
    
    inline def setConversationDatasets(value: js.Array[SchemaGoogleCloudDialogflowV2ConversationDataset]): Self = StObject.set(x, "conversationDatasets", value.asInstanceOf[js.Any])
    
    inline def setConversationDatasetsUndefined: Self = StObject.set(x, "conversationDatasets", js.undefined)
    
    inline def setConversationDatasetsVarargs(value: SchemaGoogleCloudDialogflowV2ConversationDataset*): Self = StObject.set(x, "conversationDatasets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
