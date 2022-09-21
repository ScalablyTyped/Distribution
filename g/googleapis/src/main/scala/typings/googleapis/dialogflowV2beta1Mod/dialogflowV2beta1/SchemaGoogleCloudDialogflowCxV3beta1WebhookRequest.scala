package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1WebhookRequest extends StObject {
  
  /**
    * Always present. The unique identifier of the DetectIntentResponse that will be returned to the API caller.
    */
  var detectIntentResponseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Always present. Information about the fulfillment that triggered this webhook call.
    */
  var fulfillmentInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo] = js.undefined
  
  /**
    * Information about the last matched intent.
    */
  var intentInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo] = js.undefined
  
  /**
    * The language code specified in the original request.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of rich message responses to present to the user. Webhook can choose to append or replace this list in WebhookResponse.fulfillment_response;
    */
  var messages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage]] = js.undefined
  
  /**
    * Information about page status.
    */
  var pageInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1PageInfo] = js.undefined
  
  /**
    * Custom data set in QueryParameters.payload.
    */
  var payload: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * The sentiment analysis result of the current user request. The field is filled when sentiment analysis is configured to be enabled for the request.
    */
  var sentimentAnalysisResult: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestSentimentAnalysisResult] = js.undefined
  
  /**
    * Information about session status.
    */
  var sessionInfo: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1SessionInfo] = js.undefined
  
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
}
object SchemaGoogleCloudDialogflowCxV3beta1WebhookRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1WebhookRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1WebhookRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1WebhookRequest](x: Self) {
    
    inline def setDetectIntentResponseId(value: String): Self = StObject.set(x, "detectIntentResponseId", value.asInstanceOf[js.Any])
    
    inline def setDetectIntentResponseIdNull: Self = StObject.set(x, "detectIntentResponseId", null)
    
    inline def setDetectIntentResponseIdUndefined: Self = StObject.set(x, "detectIntentResponseId", js.undefined)
    
    inline def setFulfillmentInfo(value: SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestFulfillmentInfo): Self = StObject.set(x, "fulfillmentInfo", value.asInstanceOf[js.Any])
    
    inline def setFulfillmentInfoUndefined: Self = StObject.set(x, "fulfillmentInfo", js.undefined)
    
    inline def setIntentInfo(value: SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestIntentInfo): Self = StObject.set(x, "intentInfo", value.asInstanceOf[js.Any])
    
    inline def setIntentInfoUndefined: Self = StObject.set(x, "intentInfo", js.undefined)
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setMessages(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1ResponseMessage*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setPageInfo(value: SchemaGoogleCloudDialogflowCxV3beta1PageInfo): Self = StObject.set(x, "pageInfo", value.asInstanceOf[js.Any])
    
    inline def setPageInfoUndefined: Self = StObject.set(x, "pageInfo", js.undefined)
    
    inline def setPayload(value: StringDictionary[Any]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadNull: Self = StObject.set(x, "payload", null)
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setSentimentAnalysisResult(value: SchemaGoogleCloudDialogflowCxV3beta1WebhookRequestSentimentAnalysisResult): Self = StObject.set(x, "sentimentAnalysisResult", value.asInstanceOf[js.Any])
    
    inline def setSentimentAnalysisResultUndefined: Self = StObject.set(x, "sentimentAnalysisResult", js.undefined)
    
    inline def setSessionInfo(value: SchemaGoogleCloudDialogflowCxV3beta1SessionInfo): Self = StObject.set(x, "sessionInfo", value.asInstanceOf[js.Any])
    
    inline def setSessionInfoUndefined: Self = StObject.set(x, "sessionInfo", js.undefined)
    
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
  }
}
