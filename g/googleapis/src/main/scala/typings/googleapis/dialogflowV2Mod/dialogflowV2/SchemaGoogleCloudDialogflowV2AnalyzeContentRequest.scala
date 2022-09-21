package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2AnalyzeContentRequest extends StObject {
  
  /**
    * Parameters for a human assist query.
    */
  var assistQueryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2AssistQueryParameters] = js.undefined
  
  /**
    * Additional parameters to be put into Dialogflow CX session parameters. To remove a parameter from the session, clients should explicitly set the parameter value to null. Note: this field should only be used if you are connecting to a Dialogflow CX agent.
    */
  var cxParameters: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * An input event to send to Dialogflow.
    */
  var eventInput: js.UndefOr[SchemaGoogleCloudDialogflowV2EventInput] = js.undefined
  
  /**
    * Parameters for a Dialogflow virtual-agent query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryParameters] = js.undefined
  
  /**
    * Speech synthesis configuration. The speech synthesis settings for a virtual agent that may be configured for the associated conversation profile are not used when calling AnalyzeContent. If this configuration is not supplied, speech synthesis is disabled.
    */
  var replyAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2OutputAudioConfig] = js.undefined
  
  /**
    * A unique identifier for this request. Restricted to 36 ASCII characters. A random UUID is recommended. This request is only idempotent if a `request_id` is provided.
    */
  var requestId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The natural language text to be processed.
    */
  var textInput: js.UndefOr[SchemaGoogleCloudDialogflowV2TextInput] = js.undefined
}
object SchemaGoogleCloudDialogflowV2AnalyzeContentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2AnalyzeContentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2AnalyzeContentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2AnalyzeContentRequest](x: Self) {
    
    inline def setAssistQueryParams(value: SchemaGoogleCloudDialogflowV2AssistQueryParameters): Self = StObject.set(x, "assistQueryParams", value.asInstanceOf[js.Any])
    
    inline def setAssistQueryParamsUndefined: Self = StObject.set(x, "assistQueryParams", js.undefined)
    
    inline def setCxParameters(value: StringDictionary[Any]): Self = StObject.set(x, "cxParameters", value.asInstanceOf[js.Any])
    
    inline def setCxParametersNull: Self = StObject.set(x, "cxParameters", null)
    
    inline def setCxParametersUndefined: Self = StObject.set(x, "cxParameters", js.undefined)
    
    inline def setEventInput(value: SchemaGoogleCloudDialogflowV2EventInput): Self = StObject.set(x, "eventInput", value.asInstanceOf[js.Any])
    
    inline def setEventInputUndefined: Self = StObject.set(x, "eventInput", js.undefined)
    
    inline def setQueryParams(value: SchemaGoogleCloudDialogflowV2QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
    
    inline def setReplyAudioConfig(value: SchemaGoogleCloudDialogflowV2OutputAudioConfig): Self = StObject.set(x, "replyAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setReplyAudioConfigUndefined: Self = StObject.set(x, "replyAudioConfig", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdNull: Self = StObject.set(x, "requestId", null)
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTextInput(value: SchemaGoogleCloudDialogflowV2TextInput): Self = StObject.set(x, "textInput", value.asInstanceOf[js.Any])
    
    inline def setTextInputUndefined: Self = StObject.set(x, "textInput", js.undefined)
  }
}
