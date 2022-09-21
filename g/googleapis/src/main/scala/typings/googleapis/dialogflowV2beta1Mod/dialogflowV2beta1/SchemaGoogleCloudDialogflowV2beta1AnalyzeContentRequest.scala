package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest extends StObject {
  
  /**
    * Parameters for a human assist query.
    */
  var assistQueryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AssistQueryParameters] = js.undefined
  
  /**
    * The natural language speech audio to be processed.
    */
  var audioInput: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AudioInput] = js.undefined
  
  /**
    * The unique identifier of the CX page to override the `current_page` in the session. Format: `projects//locations//agents//flows//pages/`. If `cx_current_page` is specified, the previous state of the session will be ignored by Dialogflow CX, including the previous page and the previous session parameters. In most cases, `cx_current_page` and `cx_parameters` should be configured together to direct a session to a specific state. Note: this field should only be used if you are connecting to a Dialogflow CX agent.
    */
  var cxCurrentPage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional parameters to be put into Dialogflow CX session parameters. To remove a parameter from the session, clients should explicitly set the parameter value to null. Note: this field should only be used if you are connecting to a Dialogflow CX agent.
    */
  var cxParameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * An input event to send to Dialogflow.
    */
  var eventInput: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1EventInput] = js.undefined
  
  /**
    * Optional. The send time of the message from end user or human agent's perspective. It is used for identifying the same message under one participant. Given two messages under the same participant: - If send time are different regardless of whether the content of the messages are exactly the same, the conversation will regard them as two distinct messages sent by the participant. - If send time is the same regardless of whether the content of the messages are exactly the same, the conversation will regard them as same message, and ignore the message received later. If the value is not provided, a new request will always be regarded as a new message without any de-duplication.
    */
  var messageSendTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Parameters for a Dialogflow virtual-agent query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1QueryParameters] = js.undefined
  
  /**
    * Speech synthesis configuration. The speech synthesis settings for a virtual agent that may be configured for the associated conversation profile are not used when calling AnalyzeContent. If this configuration is not supplied, speech synthesis is disabled.
    */
  var replyAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig] = js.undefined
  
  /**
    * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is recommended. This request is only idempotent if a `request_id` is provided.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The natural language text to be processed.
    */
  var textInput: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1TextInput] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AnalyzeContentRequest](x: Self) {
    
    inline def setAssistQueryParams(value: SchemaGoogleCloudDialogflowV2beta1AssistQueryParameters): Self = StObject.set(x, "assistQueryParams", value.asInstanceOf[js.Any])
    
    inline def setAssistQueryParamsUndefined: Self = StObject.set(x, "assistQueryParams", js.undefined)
    
    inline def setAudioInput(value: SchemaGoogleCloudDialogflowV2beta1AudioInput): Self = StObject.set(x, "audioInput", value.asInstanceOf[js.Any])
    
    inline def setAudioInputUndefined: Self = StObject.set(x, "audioInput", js.undefined)
    
    inline def setCxCurrentPage(value: String): Self = StObject.set(x, "cxCurrentPage", value.asInstanceOf[js.Any])
    
    inline def setCxCurrentPageNull: Self = StObject.set(x, "cxCurrentPage", null)
    
    inline def setCxCurrentPageUndefined: Self = StObject.set(x, "cxCurrentPage", js.undefined)
    
    inline def setCxParameters(value: StringDictionary[Any]): Self = StObject.set(x, "cxParameters", value.asInstanceOf[js.Any])
    
    inline def setCxParametersNull: Self = StObject.set(x, "cxParameters", null)
    
    inline def setCxParametersUndefined: Self = StObject.set(x, "cxParameters", js.undefined)
    
    inline def setEventInput(value: SchemaGoogleCloudDialogflowV2beta1EventInput): Self = StObject.set(x, "eventInput", value.asInstanceOf[js.Any])
    
    inline def setEventInputUndefined: Self = StObject.set(x, "eventInput", js.undefined)
    
    inline def setMessageSendTime(value: String): Self = StObject.set(x, "messageSendTime", value.asInstanceOf[js.Any])
    
    inline def setMessageSendTimeNull: Self = StObject.set(x, "messageSendTime", null)
    
    inline def setMessageSendTimeUndefined: Self = StObject.set(x, "messageSendTime", js.undefined)
    
    inline def setQueryParams(value: SchemaGoogleCloudDialogflowV2beta1QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setReplyAudioConfig(value: SchemaGoogleCloudDialogflowV2beta1OutputAudioConfig): Self = StObject.set(x, "replyAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setReplyAudioConfigUndefined: Self = StObject.set(x, "replyAudioConfig", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTextInput(value: SchemaGoogleCloudDialogflowV2beta1TextInput): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
  }
}
