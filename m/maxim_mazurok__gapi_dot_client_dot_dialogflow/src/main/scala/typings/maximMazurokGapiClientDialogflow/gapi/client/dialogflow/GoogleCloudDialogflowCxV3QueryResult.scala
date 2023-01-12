package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3QueryResult extends StObject {
  
  /** The current Page. Some, not all fields are filled in this message, including but not limited to `name` and `display_name`. */
  var currentPage: js.UndefOr[GoogleCloudDialogflowCxV3Page] = js.undefined
  
  /**
    * The free-form diagnostic info. For example, this field could contain webhook call latency. The fields of this data can change without notice, so you should not write code that
    * depends on its structure. One of the fields is called "Alternative Matched Intents", which may aid with debugging. The following describes these intent results: - The list is empty
    * if no intent was matched to end-user input. - Only intents that are referenced in the currently active flow are included. - The matched intent is included. - Other intents that
    * could have matched end-user input, but did not match because they are referenced by intent routes that are out of
    * [scope](https://cloud.google.com/dialogflow/cx/docs/concept/handler#scope), are included. - Other intents referenced by intent routes in scope that matched end-user input, but had a
    * lower confidence score.
    */
  var diagnosticInfo: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** If a DTMF was provided as input, this field will contain a copy of the DTMFInput. */
  var dtmf: js.UndefOr[GoogleCloudDialogflowCxV3DtmfInput] = js.undefined
  
  /**
    * The Intent that matched the conversational query. Some, not all fields are filled in this message, including but not limited to: `name` and `display_name`. This field is deprecated,
    * please use QueryResult.match instead.
    */
  var intent: js.UndefOr[GoogleCloudDialogflowCxV3Intent] = js.undefined
  
  /**
    * The intent detection confidence. Values range from 0.0 (completely uncertain) to 1.0 (completely certain). This value is for informational purpose only and is only used to help
    * match the best intent within the classification threshold. This value may change for the same end-user expression at any time due to a model retraining or change in implementation.
    * This field is deprecated, please use QueryResult.match instead.
    */
  var intentDetectionConfidence: js.UndefOr[Double] = js.undefined
  
  /**
    * The language that was triggered during intent detection. See [Language Support](https://cloud.google.com/dialogflow/cx/docs/reference/language) for a list of the currently supported
    * language codes.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /** Intent match result, could be an intent or an event. */
  var `match`: js.UndefOr[GoogleCloudDialogflowCxV3Match] = js.undefined
  
  /**
    * The collected session parameters. Depending on your protocol or client library language, this is a map, associative array, symbol table, dictionary, or JSON object composed of a
    * collection of (MapKey, MapValue) pairs: * MapKey type: string * MapKey value: parameter name * MapValue type: If parameter's entity type is a composite entity then use map,
    * otherwise, depending on the parameter value type, it could be one of string, number, boolean, null, list or map. * MapValue value: If parameter's entity type is a composite entity
    * then use map from composite entity property names to property values, otherwise, use parameter value.
    */
  var parameters: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
  ] = js.undefined
  
  /** The list of rich messages returned to the client. Responses vary from simple text messages to more sophisticated, structured payloads used to drive complex logic. */
  var responseMessages: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3ResponseMessage]] = js.undefined
  
  /** The sentiment analyss result, which depends on `analyze_query_text_sentiment`, specified in the request. */
  var sentimentAnalysisResult: js.UndefOr[GoogleCloudDialogflowCxV3SentimentAnalysisResult] = js.undefined
  
  /** If natural language text was provided as input, this field will contain a copy of the text. */
  var text: js.UndefOr[String] = js.undefined
  
  /** If natural language speech audio was provided as input, this field will contain the transcript for the audio. */
  var transcript: js.UndefOr[String] = js.undefined
  
  /** If an event was provided as input, this field will contain the name of the event. */
  var triggerEvent: js.UndefOr[String] = js.undefined
  
  /** If an intent was provided as input, this field will contain a copy of the intent identifier. Format: `projects//locations//agents//intents/`. */
  var triggerIntent: js.UndefOr[String] = js.undefined
  
  /**
    * The list of webhook payload in WebhookResponse.payload, in the order of call sequence. If some webhook call fails or doesn't return any payload, an empty `Struct` would be used
    * instead.
    */
  var webhookPayloads: js.UndefOr[
    js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ]
  ] = js.undefined
  
  /** The list of webhook call status in the order of call sequence. */
  var webhookStatuses: js.UndefOr[js.Array[GoogleRpcStatus]] = js.undefined
}
object GoogleCloudDialogflowCxV3QueryResult {
  
  inline def apply(): GoogleCloudDialogflowCxV3QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3QueryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3QueryResult] (val x: Self) extends AnyVal {
    
    inline def setCurrentPage(value: GoogleCloudDialogflowCxV3Page): Self = StObject.set(x, "currentPage", value.asInstanceOf[js.Any])
    
    inline def setCurrentPageUndefined: Self = StObject.set(x, "currentPage", js.undefined)
    
    inline def setDiagnosticInfo(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "diagnosticInfo", value.asInstanceOf[js.Any])
    
    inline def setDiagnosticInfoUndefined: Self = StObject.set(x, "diagnosticInfo", js.undefined)
    
    inline def setDtmf(value: GoogleCloudDialogflowCxV3DtmfInput): Self = StObject.set(x, "dtmf", value.asInstanceOf[js.Any])
    
    inline def setDtmfUndefined: Self = StObject.set(x, "dtmf", js.undefined)
    
    inline def setIntent(value: GoogleCloudDialogflowCxV3Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidence(value: Double): Self = StObject.set(x, "intentDetectionConfidence", value.asInstanceOf[js.Any])
    
    inline def setIntentDetectionConfidenceUndefined: Self = StObject.set(x, "intentDetectionConfidence", js.undefined)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMatch(value: GoogleCloudDialogflowCxV3Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setParameters(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setResponseMessages(value: js.Array[GoogleCloudDialogflowCxV3ResponseMessage]): Self = StObject.set(x, "responseMessages", value.asInstanceOf[js.Any])
    
    inline def setResponseMessagesUndefined: Self = StObject.set(x, "responseMessages", js.undefined)
    
    inline def setResponseMessagesVarargs(value: GoogleCloudDialogflowCxV3ResponseMessage*): Self = StObject.set(x, "responseMessages", js.Array(value*))
    
    inline def setSentimentAnalysisResult(value: GoogleCloudDialogflowCxV3SentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTranscript(value: String): Self = StObject.set(x, "transcript", value.asInstanceOf[js.Any])
    
    inline def setTranscriptUndefined: Self = StObject.set(x, "transcript", js.undefined)
    
    inline def setTriggerEvent(value: String): Self = StObject.set(x, "triggerEvent", value.asInstanceOf[js.Any])
    
    inline def setTriggerEventUndefined: Self = StObject.set(x, "triggerEvent", js.undefined)
    
    inline def setTriggerIntent(value: String): Self = StObject.set(x, "triggerIntent", value.asInstanceOf[js.Any])
    
    inline def setTriggerIntentUndefined: Self = StObject.set(x, "triggerIntent", js.undefined)
    
    inline def setWebhookPayloads(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any
        ]
    ): Self = StObject.set(x, "webhookPayloads", value.asInstanceOf[js.Any])
    
    inline def setWebhookPayloadsUndefined: Self = StObject.set(x, "webhookPayloads", js.undefined)
    
    inline def setWebhookPayloadsVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: any} */ js.Any)*
    ): Self = StObject.set(x, "webhookPayloads", js.Array(value*))
    
    inline def setWebhookStatuses(value: js.Array[GoogleRpcStatus]): Self = StObject.set(x, "webhookStatuses", value.asInstanceOf[js.Any])
    
    inline def setWebhookStatusesUndefined: Self = StObject.set(x, "webhookStatuses", js.undefined)
    
    inline def setWebhookStatusesVarargs(value: GoogleRpcStatus*): Self = StObject.set(x, "webhookStatuses", js.Array(value*))
  }
}
