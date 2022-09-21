package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3QueryResult extends StObject {
  
  /**
    * The current Page. Some, not all fields are filled in this message, including but not limited to `name` and `display_name`.
    */
  var currentPage: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Page] = js.undefined
  
  /**
    * The free-form diagnostic info. For example, this field could contain webhook call latency. The fields of this data can change without notice, so you should not write code that depends on its structure. One of the fields is called "Alternative Matched Intents", which may aid with debugging. The following describes these intent results: - The list is empty if no intent was matched to end-user input. - Only intents that are referenced in the currently active flow are included. - The matched intent is included. - Other intents that could have matched end-user input, but did not match because they are referenced by intent routes that are out of [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope), are included. - Other intents referenced by intent routes in scope that matched end-user input, but had a lower confidence score.
    */
  var diagnosticInfo: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * If a DTMF was provided as input, this field will contain a copy of the DTMFInput.
    */
  var dtmf: js.UndefOr[SchemaGoogleCloudDialogflowCxV3DtmfInput] = js.undefined
  
  /**
    * The Intent that matched the conversational query. Some, not all fields are filled in this message, including but not limited to: `name` and `display_name`. This field is deprecated, please use QueryResult.match instead.
    */
  var intent: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Intent] = js.undefined
  
  /**
    * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). This value is for informational purpose only and is only used to help match the best intent within the classification threshold. This value may change for the same end-user expression at any time due to a model retraining or change in implementation. This field is deprecated, please use QueryResult.match instead.
    */
  var intentDetectionConfidence: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The language that was triggered during intent detection. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported language codes.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Intent match result, could be an intent or an event.
    */
  var `match`: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Match] = js.undefined
  
  /**
    * The collected session parameters. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a collection of (MapKey, MapValue) pairs: * MapKey type: string * MapKey value: parameter name * MapValue type: If parameter's entity type is a composite entity then use map, otherwise, depending on the parameter value type, it could be one of string, number, boolean, null, list or map. * MapValue value: If parameter's entity type is a composite entity then use map from composite entity property names to property values, otherwise, use parameter value.
    */
  var parameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The list of rich messages returned to the client. Responses vary from simple text messages to more sophisticated, structured payloads used to drive complex logic.
    */
  var responseMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessage]] = js.undefined
  
  /**
    * The sentiment analyss result, which depends on `analyze_query_text_sentiment`, specified in the request.
    */
  var sentimentAnalysisResult: js.UndefOr[SchemaGoogleCloudDialogflowCxV3SentimentAnalysisResult] = js.undefined
  
  /**
    * If natural language text was provided as input, this field will contain a copy of the text.
    */
  var text: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If natural language speech audio was provided as input, this field will contain the transcript for the audio.
    */
  var transcript: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If an event was provided as input, this field will contain the name of the event.
    */
  var triggerEvent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If an intent was provided as input, this field will contain a copy of the intent identifier. Format: `projects//locations//agents//intents/`.
    */
  var triggerIntent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of webhook payload in WebhookResponse.payload, in the order of call sequence. If some webhook call fails or doesn't return any payload, an empty `Struct` would be used instead.
    */
  var webhookPayloads: js.UndefOr[js.Array[StringDictionary[Any]] | Null] = js.undefined
  
  /**
    * The list of webhook call status in the order of call sequence.
    */
  var webhookStatuses: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3QueryResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3QueryResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3QueryResult](x: Self) {
    
    inline def setCurrentPage(value: SchemaGoogleCloudDialogflowCxV3Page): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setDiagnosticInfo(value: StringDictionary[Any]): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoNull: Self = StObject.set(x, "diagnosticInfo", null)
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setDtmf(value: SchemaGoogleCloudDialogflowCxV3DtmfInput): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setDtmfUndefined: Self = StObject.set(x, "dtmf", js.undefined)
    
    inline def setIntent(value: SchemaGoogleCloudDialogflowCxV3Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidenceNull: Self = StObject.set(x, "intentDetectionConfidence", null)
    
    inline def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMatch(value: SchemaGoogleCloudDialogflowCxV3Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersNull: Self = StObject.set(x, "parameters", null)
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResponseMessages(value: js.Array[SchemaGoogleCloudDialogflowCxV3ResponseMessage]): Self = StObject.set(x, "responseMessages", value.asInstanceOf[js.Any])
    
    inline def setResponseMessagesUndefined: Self = StObject.set(x, "responseMessages", js.undefined)
    
    inline def setResponseMessagesVarargs(value: SchemaGoogleCloudDialogflowCxV3ResponseMessage*): Self = StObject.set(x, "responseMessages", js.Array(value*))
    
    inline def setSentimentAnalysisResult(value: SchemaGoogleCloudDialogflowCxV3SentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptNull: Self = StObject.set(x, "transcript", null)
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    inline def setTriggerEvent(value: String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventNull: Self = StObject.set(x, "triggerEvent", null)
    
    inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    inline def setTriggerIntent(value: String): Self = StObject.set(x, "triggerIntent", value.asInstanceOf[js.Any])
    
    inline def setTriggerIntentNull: Self = StObject.set(x, "triggerIntent", null)
    
    inline def setTriggerIntentUndefined: Self = StObject.set(x, "triggerIntent", js.undefined)
    
    inline def setWebhookPayloads(value: js.Array[StringDictionary[Any]]): Self = StObject.set(x, "webhookPayloads", value.asInstanceOf[js.Any])
    
    inline def setWebhookPayloadsNull: Self = StObject.set(x, "webhookPayloads", null)
    
    inline def setWebhookPayloadsUndefined: Self = StObject.set(x, "webhookPayloads", js.undefined)
    
    inline def setWebhookPayloadsVarargs(value: StringDictionary[Any]*): Self = StObject.set(x, "webhookPayloads", js.Array(value*))
    
    inline def setWebhookStatuses(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "webhookStatuses", value.asInstanceOf[js.Any])
    
    inline def setWebhookStatusesUndefined: Self = StObject.set(x, "webhookStatuses", js.undefined)
    
    inline def setWebhookStatusesVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "webhookStatuses", js.Array(value*))
  }
}
