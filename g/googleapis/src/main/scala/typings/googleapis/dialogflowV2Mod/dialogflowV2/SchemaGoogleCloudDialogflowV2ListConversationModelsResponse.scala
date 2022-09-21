package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ListConversationModelsResponse extends StObject {
  
  /**
    * The list of models to return.
    */
  var conversationModels: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2ConversationModel]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListConversationModelsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListConversationModelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListConversationModelsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListConversationModelsResponse](x: Self) {
    
    inline def setConversationModels(value: js.Array[SchemaGoogleCloudDialogflowV2ConversationModel]): Self = StObject.set(x, "conversationModels", value.asInstanceOf[js.Any])
    
    inline def setConversationModelsUndefined: Self = StObject.set(x, "conversationModels", js.undefined)
    
    inline def setConversationModelsVarargs(value: SchemaGoogleCloudDialogflowV2ConversationModel*): Self = StObject.set(x, "conversationModels", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
