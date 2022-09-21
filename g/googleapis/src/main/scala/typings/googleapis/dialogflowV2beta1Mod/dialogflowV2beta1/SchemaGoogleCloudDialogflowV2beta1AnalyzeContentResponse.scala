package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AnalyzeContentResponse extends StObject {
  
  /**
    * Optional. Only set if a Dialogflow automated agent has responded. Note that: AutomatedAgentReply.detect_intent_response.output_audio and AutomatedAgentReply.detect_intent_response.output_audio_config are always empty, use reply_audio instead.
    */
  var automatedAgentReply: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply] = js.undefined
  
  /**
    * Indicates the parameters of DTMF.
    */
  var dtmfParameters: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1DtmfParameters] = js.undefined
  
  /**
    * The suggestions for end user. The order is the same as HumanAgentAssistantConfig.SuggestionConfig.feature_configs of HumanAgentAssistantConfig.end_user_suggestion_config. Same as human_agent_suggestion_results, any failure of Agent Assist features will not lead to the overall failure of an AnalyzeContent API call. Instead, the features will fail silently with the error field set in the corresponding SuggestionResult.
    */
  var endUserSuggestionResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]] = js.undefined
  
  /**
    * The suggestions for most recent human agent. The order is the same as HumanAgentAssistantConfig.SuggestionConfig.feature_configs of HumanAgentAssistantConfig.human_agent_suggestion_config. Note that any failure of Agent Assist features will not lead to the overall failure of an AnalyzeContent API call. Instead, the features will fail silently with the error field set in the corresponding SuggestionResult.
    */
  var humanAgentSuggestionResults: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]] = js.undefined
  
  /**
    * Output only. Message analyzed by CCAI.
    */
  var message: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1Message] = js.undefined
  
  /**
    * Optional. The audio data bytes encoded as specified in the request. This field is set if: - `reply_audio_config` was specified in the request, or - The automated agent responded with audio to play to the user. In such case, `reply_audio.config` contains settings used to synthesize the speech. In some scenarios, multiple output audio fields may be present in the response structure. In these cases, only the top-most-level audio output has content.
    */
  var replyAudio: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1OutputAudio] = js.undefined
  
  /**
    * Output only. The output text content. This field is set if the automated agent responded with text to show to the user.
    */
  var replyText: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AnalyzeContentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AnalyzeContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AnalyzeContentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AnalyzeContentResponse](x: Self) {
    
    inline def setAutomatedAgentReply(value: SchemaGoogleCloudDialogflowV2beta1AutomatedAgentReply): Self = StObject.set(x, "automatedAgentReply", value.asInstanceOf[js.Any])
    
    inline def setAutomatedAgentReplyUndefined: Self = StObject.set(x, "automatedAgentReply", js.undefined)
    
    inline def setDtmfParameters(value: SchemaGoogleCloudDialogflowV2beta1DtmfParameters): Self = StObject.set(x, "dtmfParameters", value.asInstanceOf[js.Any])
    
    inline def setDtmfParametersUndefined: Self = StObject.set(x, "dtmfParameters", js.undefined)
    
    inline def setEndUserSuggestionResults(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]): Self = StObject.set(x, "endUserSuggestionResults", value.asInstanceOf[js.Any])
    
    inline def setEndUserSuggestionResultsUndefined: Self = StObject.set(x, "endUserSuggestionResults", js.undefined)
    
    inline def setEndUserSuggestionResultsVarargs(value: SchemaGoogleCloudDialogflowV2beta1SuggestionResult*): Self = StObject.set(x, "endUserSuggestionResults", js.Array(value*))
    
    inline def setHumanAgentSuggestionResults(value: js.Array[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]): Self = StObject.set(x, "humanAgentSuggestionResults", value.asInstanceOf[js.Any])
    
    inline def setHumanAgentSuggestionResultsUndefined: Self = StObject.set(x, "humanAgentSuggestionResults", js.undefined)
    
    inline def setHumanAgentSuggestionResultsVarargs(value: SchemaGoogleCloudDialogflowV2beta1SuggestionResult*): Self = StObject.set(x, "humanAgentSuggestionResults", js.Array(value*))
    
    inline def setMessage(value: SchemaGoogleCloudDialogflowV2beta1Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setReplyAudio(value: SchemaGoogleCloudDialogflowV2beta1OutputAudio): Self = StObject.set(x, "replyAudio", value.asInstanceOf[js.Any])
    
    inline def setReplyAudioUndefined: Self = StObject.set(x, "replyAudio", js.undefined)
    
    inline def setReplyText(value: String): Self = StObject.set(x, "replyText", value.asInstanceOf[js.Any])
    
    inline def setReplyTextNull: Self = StObject.set(x, "replyText", null)
    
    inline def setReplyTextUndefined: Self = StObject.set(x, "replyText", js.undefined)
  }
}
