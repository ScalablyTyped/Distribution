package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse extends StObject {
  
  /**
    * The list of evaluations to return.
    */
  var conversationModelEvaluations: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2ListConversationModelEvaluationsResponse](x: Self) {
    
    inline def setConversationModelEvaluations(value: js.Array[SchemaGoogleCloudDialogflowV2ConversationModelEvaluation]): Self = StObject.set(x, "conversationModelEvaluations", value.asInstanceOf[js.Any])
    
    inline def setConversationModelEvaluationsUndefined: Self = StObject.set(x, "conversationModelEvaluations", js.undefined)
    
    inline def setConversationModelEvaluationsVarargs(value: SchemaGoogleCloudDialogflowV2ConversationModelEvaluation*): Self = StObject.set(x, "conversationModelEvaluations", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
