package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1WebhookRequest extends js.Object {
  
  /** Alternative query results from KnowledgeService. */
  var alternativeQueryResults: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1QueryResult]] = js.native
  
  /** Optional. The contents of the original request that was passed to `[Streaming]DetectIntent` call. */
  var originalDetectIntentRequest: js.UndefOr[GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest] = js.native
  
  /** The result of the conversational query or event processing. Contains the same value as `[Streaming]DetectIntentResponse.query_result`. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowV2beta1QueryResult] = js.native
  
  /** The unique identifier of the response. Contains the same value as `[Streaming]DetectIntentResponse.response_id`. */
  var responseId: js.UndefOr[String] = js.native
  
  /**
    * The unique identifier of detectIntent request session. Can be used to identify end-user inside webhook implementation. Supported formats: - `projects//agent/sessions/, -
    * `projects//locations//agent/sessions/`, - `projects//agent/environments//users//sessions/`, - `projects//locations//agent/environments//users//sessions/`,
    */
  var session: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1WebhookRequest {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1WebhookRequest]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1WebhookRequestOps[Self <: GoogleCloudDialogflowV2beta1WebhookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlternativeQueryResultsVarargs(value: GoogleCloudDialogflowV2beta1QueryResult*): Self = this.set("alternativeQueryResults", js.Array(value :_*))
    
    @scala.inline
    def setAlternativeQueryResults(value: js.Array[GoogleCloudDialogflowV2beta1QueryResult]): Self = this.set("alternativeQueryResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternativeQueryResults: Self = this.set("alternativeQueryResults", js.undefined)
    
    @scala.inline
    def setOriginalDetectIntentRequest(value: GoogleCloudDialogflowV2beta1OriginalDetectIntentRequest): Self = this.set("originalDetectIntentRequest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalDetectIntentRequest: Self = this.set("originalDetectIntentRequest", js.undefined)
    
    @scala.inline
    def setQueryResult(value: GoogleCloudDialogflowV2beta1QueryResult): Self = this.set("queryResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryResult: Self = this.set("queryResult", js.undefined)
    
    @scala.inline
    def setResponseId(value: String): Self = this.set("responseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseId: Self = this.set("responseId", js.undefined)
    
    @scala.inline
    def setSession(value: String): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
}
