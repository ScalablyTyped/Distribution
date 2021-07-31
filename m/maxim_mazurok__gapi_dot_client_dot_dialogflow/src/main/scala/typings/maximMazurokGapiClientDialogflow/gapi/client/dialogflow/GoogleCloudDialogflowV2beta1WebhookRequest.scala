package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1WebhookRequest extends StObject {
  
  /** Alternative query results from KnowledgeService. */
  var alternativeQueryResults: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1QueryResult]] = js.undefined
  
  /** Optional. The contents of the original request that was passed to `[Streaming]DetectIntent` call. */
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest] = js.undefined
  
  /** The result of the conversational query or event processing. Contains the same value as `[Streaming]DetectIntentResponse.query_result`. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2beta1QueryResult] = js.undefined
  
  /** The unique identifier of the response. Contains the same value as `[Streaming]DetectIntentResponse.response_id`. */
  var responseId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of detectIntent request session. Can be used to identify end-user inside webhook implementation. Supported formats: - `projects//agent/sessions/, -
    * `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`,
    */
  var session: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1WebhookRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1WebhookRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1WebhookRequestMutableBuilder[Self <: GoogleCloudDialogflowV2beta1WebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternativeQueryResults(value: js.Array[GoogleCloudDialogflowV2beta1QueryResult]): Self = StObject.set(x, "alternativeQueryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternativeQueryResultsUndefined: Self = StObject.set(x, "alternativeQueryResults", js.undefined)
    
    @scala.inline
    def setAlternativeQueryResultsVarargs(value: GoogleCloudDialogflowV2beta1QueryResult*): Self = StObject.set(x, "alternativeQueryResults", js.Array(value :_*))
    
    @scala.inline
    def setOriginalDetectIntentRequest(value: GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest): Self = StObject.set(x, "originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalDetectIntentRequestUndefined: Self = StObject.set(x, "originalDetectIntentRequest", js.undefined)
    
    @scala.inline
    def setQueryResult(value: GoogleCloudDialogflowV2beta1QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
