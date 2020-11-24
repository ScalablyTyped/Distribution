package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1QueryResult extends js.Object {
  
  /** The action name from the matched intent. */
  var action: js.UndefOr[String] = js.native
  
  /**
    * This field is set to: - `false` if the matched intent has required parameters and not all of the required parameter values have been collected. - `true` if all required parameter
    * values have been collected, or if the matched intent doesn't contain any required parameters.
    */
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.native
  
  /**
    * Free-form diagnostic information for the associated detect intent request. The fields of this data can change without notice, so you should not write code that depends on its
    * structure. The data may contain: - webhook call latency - webhook errors
    */
  var diagnosticInfo: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult with TopLevel[js.Any]
  ] = js.native
  
  /** The collection of rich messages to present to the user. */
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessage]] = js.native
  
  /** The text to be pronounced to the user or shown on the screen. Note: This is a legacy field, `fulfillment_messages` should be preferred. */
  var fulfillmentText: js.UndefOr[String] = js.native
  
  /**
    * The intent that matched the conversational query. Some, not all fields are filled in this message, including but not limited to: `name`, `display_name`, `end_interaction` and
    * `is_fallback`.
    */
  var intent: js.UndefOr[GoogleCloudDialogflowV2beta1Intent] = js.native
  
  /**
    * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). This value is for informational purpose only and is only used to help
    * match the best intent within the classification threshold. This value may change for the same end-user expression at any time due to a model retraining or change in implementation.
    * If there are `multiple knowledge_answers` messages, this value is set to the greatest `knowledgeAnswers.match_confidence` value in the list.
    */
  var intentDetectionConfidence: js.UndefOr[Double] = js.native
  
  /** The result from Knowledge Connector (if any), ordered by decreasing `KnowledgeAnswers.match_confidence`. */
  var knowledgeAnswers: js.UndefOr[GoogleCloudDialogflowV2beta1KnowledgeAnswers] = js.native
  
  /**
    * The language that was triggered during intent detection. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently supported
    * language codes.
    */
  var languageCode: js.UndefOr[String] = js.native
  
  /** The collection of output contexts. If applicable, `output_contexts.parameters` contains entries with name `.original` containing the original parameter values before the query. */
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1Context]] = js.native
  
  /**
    * The collection of extracted parameters. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of
    * a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite entity: map - Else:
    * string or number, depending on parameter value type - MapValue value: - If parameter's entity type is a composite entity: map from composite entity property names to property values
    * - Else: parameter value
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult with TopLevel[js.Any]
  ] = js.native
  
  /**
    * The original conversational query text: - If natural language text was provided as input, `query_text` contains a copy of the input. - If natural language speech audio was provided
    * as input, `query_text` contains the speech recognition result. If speech recognizer produced multiple alternatives, a particular one is picked. - If automatic spell correction is
    * enabled, `query_text` will contain the corrected user input.
    */
  var queryText: js.UndefOr[String] = js.native
  
  /** The sentiment analysis result, which depends on the `sentiment_analysis_request_config` specified in the request. */
  var sentimentAnalysisResult: js.UndefOr[GoogleCloudDialogflowV2beta1SentimentAnalysisResult] = js.native
  
  /**
    * The Speech recognition confidence between 0.0 and 1.0. A higher number indicates an estimated greater likelihood that the recognized words are correct. The default of 0.0 is a
    * sentinel value indicating that confidence was not set. This field is not guaranteed to be accurate or set. In particular this field isn't set for StreamingDetectIntent since the
    * streaming endpoint has separate confidence estimates per portion of the audio in StreamingRecognitionResult.
    */
  var speechRecognitionConfidence: js.UndefOr[Double] = js.native
  
  /** If the query was fulfilled by a webhook call, this field is set to the value of the `payload` field returned in the webhook response. */
  var webhookPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult with TopLevel[js.Any]
  ] = js.native
  
  /** If the query was fulfilled by a webhook call, this field is set to the value of the `source` field returned in the webhook response. */
  var webhookSource: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1QueryResult {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1QueryResult]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1QueryResultOps[Self <: GoogleCloudDialogflowV2beta1QueryResult] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAllRequiredParamsPresent(value: Boolean): Self = this.set("allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllRequiredParamsPresent: Self = this.set("allRequiredParamsPresent", js.undefined)
    
    @scala.inline
    def setDiagnosticInfo(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult with TopLevel[js.Any]
    ): Self = this.set("diagnosticInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiagnosticInfo: Self = this.set("diagnosticInfo", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: GoogleCloudDialogflowV2beta1IntentMessage*): Self = this.set("fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessage]): Self = this.set("fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentMessages: Self = this.set("fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentText(value: String): Self = this.set("fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFulfillmentText: Self = this.set("fulfillmentText", js.undefined)
    
    @scala.inline
    def setIntent(value: GoogleCloudDialogflowV2beta1Intent): Self = this.set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntent: Self = this.set("intent", js.undefined)
    
    @scala.inline
    def setIntentDetectionConfidence(value: Double): Self = this.set("intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntentDetectionConfidence: Self = this.set("intentDetectionConfidence", js.undefined)
    
    @scala.inline
    def setKnowledgeAnswers(value: GoogleCloudDialogflowV2beta1KnowledgeAnswers): Self = this.set("knowledgeAnswers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKnowledgeAnswers: Self = this.set("knowledgeAnswers", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: GoogleCloudDialogflowV2beta1Context*): Self = this.set("outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2beta1Context]): Self = this.set("outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputContexts: Self = this.set("outputContexts", js.undefined)
    
    @scala.inline
    def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult with TopLevel[js.Any]
    ): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
    
    @scala.inline
    def setQueryText(value: String): Self = this.set("queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryText: Self = this.set("queryText", js.undefined)
    
    @scala.inline
    def setSentimentAnalysisResult(value: GoogleCloudDialogflowV2beta1SentimentAnalysisResult): Self = this.set("sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentimentAnalysisResult: Self = this.set("sentimentAnalysisResult", js.undefined)
    
    @scala.inline
    def setSpeechRecognitionConfidence(value: Double): Self = this.set("speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpeechRecognitionConfidence: Self = this.set("speechRecognitionConfidence", js.undefined)
    
    @scala.inline
    def setWebhookPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult with TopLevel[js.Any]
    ): Self = this.set("webhookPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookPayload: Self = this.set("webhookPayload", js.undefined)
    
    @scala.inline
    def setWebhookSource(value: String): Self = this.set("webhookSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebhookSource: Self = this.set("webhookSource", js.undefined)
  }
}
