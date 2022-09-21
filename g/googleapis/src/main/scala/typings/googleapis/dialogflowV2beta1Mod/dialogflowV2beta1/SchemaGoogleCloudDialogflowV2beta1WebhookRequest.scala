package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1WebhookRequest extends StObject {
  
  /**
    * Alternative query results from KnowledgeService.
    */
  var alternativeQueryResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]] = js.undefined
  
  /**
    * Optional. The contents of the original request that was passed to `[Streaming]DetectIntent` call.
    */
  var originalDetectIntentRequest: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest] = js.undefined
  
  /**
    * The result of the conversational query or event processing. Contains the same value as `[Streaming]DetectIntentResponse.query_result`.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryResult] = js.undefined
  
  /**
    * The unique identifier of the response. Contains the same value as `[Streaming]DetectIntentResponse.response_id`.
    */
  var responseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of detectIntent request session. Can be used to identify end-user inside webhook implementation. Supported formats: - `projects//agent/sessions/, - `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`,
    */
  var session: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1WebhookRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1WebhookRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1WebhookRequest](x: Self) {
    
    inline def setAlternativeQueryResults(value: js.Array[SchemaGoogleCloudDialogflowV2beta1QueryResult]): Self = StObject.set(x, "alternativeQueryResults", value.asInstanceOf[js.Any])
    
    inline def setAlternativeQueryResultsUndefined: Self = StObject.set(x, "alternativeQueryResults", js.undefined)
    
    inline def setAlternativeQueryResultsVarargs(value: SchemaGoogleCloudDialogflowV2beta1QueryResult*): Self = StObject.set(x, "alternativeQueryResults", js.Array(value*))
    
    inline def setOriginalDetectIntentRequest(value: SchemaGoogleCloudDialogflowV2beta1OriginalDetectIntentRequest): Self = StObject.set(x, "originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    inline def setOriginalDetectIntentRequestUndefined: Self = StObject.set(x, "originalDetectIntentRequest", js.undefined)
    
    inline def setQueryResult(value: SchemaGoogleCloudDialogflowV2beta1QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionNull: Self = StObject.set(x, "session", null)
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
