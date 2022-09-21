package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1QueryResult extends StObject {
  
  /** The action name from the matched intent. */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * This field is set to: - `false` if the matched intent has required parameters and not all of the required parameter values have been collected. - `true` if all required parameter
    * values have been collected, or if the matched intent doesn't contain any required parameters.
    */
  var allRequiredParamsPresent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the conversational query triggers a cancellation for slot filling. For more information, see the [cancel slot filling
    * documentation](https://cloud.google.com/dialogflow/es/docs/intents-actions-parameters#cancel).
    */
  var cancelsSlotFilling: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Free-form diagnostic information for the associated detect intent request. The fields of this data can change without notice, so you should not write code that depends on its
    * structure. The data may contain: - webhook call latency - webhook errors
    */
  var diagnosticInfo: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult & TopLevel[Any]
  ] = js.undefined
  
  /** The collection of rich messages to present to the user. */
  var fulfillmentMessages: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessage]] = js.undefined
  
  /** The text to be pronounced to the user or shown on the screen. Note: This is a legacy field, `fulfillment_messages` should be preferred. */
  var fulfillmentText: js.UndefOr[String] = js.undefined
  
  /**
    * The intent that matched the conversational query. Some, not all fields are filled in this message, including but not limited to: `name`, `display_name`, `end_interaction` and
    * `is_fallback`.
    */
  var intent: js.UndefOr[GoogleCloudDialogflowV2beta1Intent] = js.undefined
  
  /**
    * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). This value is for informational purpose only and is only used to help
    * match the best intent within the classification threshold. This value may change for the same end-user expression at any time due to a model retraining or change in implementation.
    * If there are `multiple knowledge_answers` messages, this value is set to the greatest `knowledgeAnswers.match_confidence` value in the list.
    */
  var intentDetectionConfidence: js.UndefOr[Double] = js.undefined
  
  /** The result from Knowledge Connector (if any), ordered by decreasing `KnowledgeAnswers.match_confidence`. */
  var knowledgeAnswers: js.UndefOr[GoogleCloudDialogflowV2beta1KnowledgeAnswers] = js.undefined
  
  /**
    * The language that was triggered during intent detection. See [Language Support](https://cloud.google.com/dialogflow/docs/reference/language) for a list of the currently supported
    * language codes.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** The collection of output contexts. If applicable, `output_contexts.parameters` contains entries with name `.original` containing the original parameter values before the query. */
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1Context]] = js.undefined
  
  /**
    * The collection of extracted parameters. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of
    * a collection of (MapKey, MapValue) pairs: - MapKey type: string - MapKey value: parameter name - MapValue type: - If parameter's entity type is a composite entity: map - Else:
    * depending on parameter value type, could be one of string, number, boolean, null, list or map - MapValue value: - If parameter's entity type is a composite entity: map from
    * composite entity property names to property values - Else: parameter value
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult & TopLevel[Any]
  ] = js.undefined
  
  /**
    * The original conversational query text: - If natural language text was provided as input, `query_text` contains a copy of the input. - If natural language speech audio was provided
    * as input, `query_text` contains the speech recognition result. If speech recognizer produced multiple alternatives, a particular one is picked. - If automatic spell correction is
    * enabled, `query_text` will contain the corrected user input.
    */
  var queryText: js.UndefOr[String] = js.undefined
  
  /** The sentiment analysis result, which depends on the `sentiment_analysis_request_config` specified in the request. */
  var sentimentAnalysisResult: js.UndefOr[GoogleCloudDialogflowV2beta1SentimentAnalysisResult] = js.undefined
  
  /**
    * The Speech recognition confidence between 0.0 and 1.0. A higher number indicates an estimated greater likelihood that the recognized words are correct. The default of 0.0 is a
    * sentinel value indicating that confidence was not set. This field is not guaranteed to be accurate or set. In particular this field isn't set for StreamingDetectIntent since the
    * streaming endpoint has separate confidence estimates per portion of the audio in StreamingRecognitionResult.
    */
  var speechRecognitionConfidence: js.UndefOr[Double] = js.undefined
  
  /** If the query was fulfilled by a webhook call, this field is set to the value of the `payload` field returned in the webhook response. */
  var webhookPayload: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: any}
    */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult & TopLevel[Any]
  ] = js.undefined
  
  /** If the query was fulfilled by a webhook call, this field is set to the value of the `source` field returned in the webhook response. */
  var webhookSource: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1QueryResult {
  
  inline def apply(): GoogleCloudDialogflowV2beta1QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1QueryResult]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1QueryResult](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setAllRequiredParamsPresent(value: Boolean): Self = StObject.set(x, "allRequiredParamsPresent", value.asInstanceOf[js.Any])
    
    inline def setAllRequiredParamsPresentUndefined: Self = StObject.set(x, "allRequiredParamsPresent", js.undefined)
    
    inline def setCancelsSlotFilling(value: Boolean): Self = StObject.set(x, "cancelsSlotFilling", value.asInstanceOf[js.Any])
    
    inline def setCancelsSlotFillingUndefined: Self = StObject.set(x, "cancelsSlotFilling", js.undefined)
    
    inline def setDiagnosticInfo(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult & TopLevel[Any]
    ): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setFulfillmentMessages(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessage]): Self = StObject.set(x, "fulfillmentMessages", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentMessagesUndefined: Self = StObject.set(x, "fulfillmentMessages", js.undefined)
    
    inline def setFulfillmentMessagesVarargs(value: GoogleCloudDialogflowV2beta1IntentMessage*): Self = StObject.set(x, "fulfillmentMessages", js.Array(value*))
    
    inline def setFulfillmentText(value: String): Self = StObject.set(x, "fulfillmentText", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentTextUndefined: Self = StObject.set(x, "fulfillmentText", js.undefined)
    
    inline def setIntent(value: GoogleCloudDialogflowV2beta1Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setKnowledgeAnswers(value: GoogleCloudDialogflowV2beta1KnowledgeAnswers): Self = StObject.set(x, "knowledgeAnswers", value.asInstanceOf[js.Any])
    
    inline def setKnowledgeAnswersUndefined: Self = StObject.set(x, "knowledgeAnswers", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setOutputContexts(value: js.Array[GoogleCloudDialogflowV2beta1Context]): Self = StObject.set(x, "outputContexts", value.asInstanceOf[js.Any])
    
    inline def setOutputContextsUndefined: Self = StObject.set(x, "outputContexts", js.undefined)
    
    inline def setOutputContextsVarargs(value: GoogleCloudDialogflowV2beta1Context*): Self = StObject.set(x, "outputContexts", js.Array(value*))
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult & TopLevel[Any]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setQueryText(value: String): Self = StObject.set(x, "queryText", value.asInstanceOf[js.Any])
    
    inline def setQueryTextUndefined: Self = StObject.set(x, "queryText", js.undefined)
    
    inline def setSentimentAnalysisResult(value: GoogleCloudDialogflowV2beta1SentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    inline def setSpeechRecognitionConfidence(value: Double): Self = StObject.set(x, "speechRecognitionConfidence", value.asInstanceOf[js.Any])
    
    inline def setSpeechRecognitionConfidenceUndefined: Self = StObject.set(x, "speechRecognitionConfidence", js.undefined)
    
    inline def setWebhookPayload(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: any}
      */ typings.maximMazurokGapiClientDialogflow.maximMazurokGapiClientDialogflowStrings.GoogleCloudDialogflowV2beta1QueryResult & TopLevel[Any]
    ): Self = StObject.set(x, "webhookPayload", value.asInstanceOf[js.Any])
    
    inline def setWebhookPayloadUndefined: Self = StObject.set(x, "webhookPayload", js.undefined)
    
    inline def setWebhookSource(value: String): Self = StObject.set(x, "webhookSource", value.asInstanceOf[js.Any])
    
    inline def setWebhookSourceUndefined: Self = StObject.set(x, "webhookSource", js.undefined)
  }
}
