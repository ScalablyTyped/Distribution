package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the result of conversational query or event processing.
  */
trait SchemaGoogleCloudDialogflowV2QueryResult extends StObject {
  
  /**
    * The action name from the matched intent.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * This field is set to: - `false` if the matched intent has required
    * parameters and not all of    the required parameter values have been
    * collected. - `true` if all required parameter values have been collected,
    * or if the    matched intent doesn&#39;t contain any required parameters.
    */
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The free-form diagnostic info. For example, this field could contain
    * webhook call latency. The string keys of the Struct&#39;s fields map can
    * change without notice.
    */
  var diagnosticInfo: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The collection of rich messages to present to the user.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.undefined
  
  /**
    * The text to be pronounced to the user or shown on the screen. Note: This
    * is a legacy field, `fulfillment_messages` should be preferred.
    */
  var fulfillmentText: js.UndefOr[String] = js.undefined
  
  /**
    * The intent that matched the conversational query. Some, not all fields
    * are filled in this message, including but not limited to: `name`,
    * `display_name` and `webhook_state`.
    */
  var intent: js.UndefOr[SchemaGoogleCloudDialogflowV2Intent] = js.undefined
  
  /**
    * The intent detection confidence. Values range from 0.0 (completely
    * uncertain) to 1.0 (completely certain). If there are `multiple
    * knowledge_answers` messages, this value is set to the greatest
    * `knowledgeAnswers.match_confidence` value in the list.
    */
  var intentDetectionConfidence: js.UndefOr[Double] = js.undefined
  
  /**
    * The language that was triggered during intent detection. See [Language
    * Support](https://cloud.google.com/dialogflow-enterprise/docs/reference/language)
    * for a list of the currently supported language codes.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * The collection of output contexts. If applicable,
    * `output_contexts.parameters` contains entries with name `&lt;parameter
    * name&gt;.original` containing the original parameter values before the
    * query.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.undefined
  
  /**
    * The collection of extracted parameters.
    */
  var parameters: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * The original conversational query text: - If natural language text was
    * provided as input, `query_text` contains   a copy of the input. - If
    * natural language speech audio was provided as input, `query_text`
    * contains the speech recognition result. If speech recognizer produced
    * multiple alternatives, a particular one is picked. - If an event was
    * provided as input, `query_text` is not set.
    */
  var queryText: js.UndefOr[String] = js.undefined
  
  /**
    * The sentiment analysis result, which depends on the
    * `sentiment_analysis_request_config` specified in the request.
    */
  var sentimentAnalysisResult: js.UndefOr[SchemaGoogleCloudDialogflowV2SentimentAnalysisResult] = js.undefined
  
  /**
    * The Speech recognition confidence between 0.0 and 1.0. A higher number
    * indicates an estimated greater likelihood that the recognized words are
    * correct. The default of 0.0 is a sentinel value indicating that
    * confidence was not set.  This field is not guaranteed to be accurate or
    * set. In particular this field isn&#39;t set for StreamingDetectIntent
    * since the streaming endpoint has separate confidence estimates per
    * portion of the audio in StreamingRecognitionResult.
    */
  var speechRecognitionConfidence: js.UndefOr[Double] = js.undefined
  
  /**
    * If the query was fulfilled by a webhook call, this field is set to the
    * value of the `payload` field returned in the webhook response.
    */
  var webhookPayload: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  
  /**
    * If the query was fulfilled by a webhook call, this field is set to the
    * value of the `source` field returned in the webhook response.
    */
  var webhookSource: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudDialogflowV2QueryResult {
  
  @scala.inline
  def apply(): SchemaGoogleCloudDialogflowV2QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2QueryResult]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudDialogflowV2QueryResultMutableBuilder[Self <: SchemaGoogleCloudDialogflowV2QueryResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setAllRequiredParamsPresent(value: Boolean): Self = StObject.set(x, "allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllRequiredParamsPresentUndefined: Self = StObject.set(x, "allRequiredParamsPresent", js.undefined)
    
    @scala.inline
    def setDiagnosticInfo(value: StringDictionary[js.Any]): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    @scala.inline
    def setFulfillmentMessages(value: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    @scala.inline
    def setFulfillmentMessagesVarargs(value: SchemaGoogleCloudDialogflowV2IntentMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value :_*))
    
    @scala.inline
    def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    @scala.inline
    def setIntent(value: SchemaGoogleCloudDialogflowV2Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    @scala.inline
    def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setOutputContexts(value: js.Array[SchemaGoogleCloudDialogflowV2Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    @scala.inline
    def setOutputContextsVarargs(value: SchemaGoogleCloudDialogflowV2Context*): Self = StObject.set(x, "outputContexts", js.Array(value :_*))
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    @scala.inline
    def setSentimentAnalysisResult(value: SchemaGoogleCloudDialogflowV2SentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    @scala.inline
    def setSpeechRecognitionConfidence(value: Double): Self = StObject.set(x, "speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeechRecognitionConfidenceUndefined: Self = StObject.set(x, "speechRecognitionConfidence", js.undefined)
    
    @scala.inline
    def setWebhookPayload(value: StringDictionary[js.Any]): Self = StObject.set(x, "webhookPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookPayloadUndefined: Self = StObject.set(x, "webhookPayload", js.undefined)
    
    @scala.inline
    def setWebhookSource(value: String): Self = StObject.set(x, "webhookSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebhookSourceUndefined: Self = StObject.set(x, "webhookSource", js.undefined)
  }
}
