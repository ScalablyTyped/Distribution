package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DetectIntentResponse extends StObject {
  
  /** Indicates whether the partial response can be cancelled when a later response arrives. e.g. if the agent specified some music as partial response, it can be cancelled. */
  var allowCancellation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The audio data bytes encoded as specified in the request. Note: The output audio is generated based on the values of default platform text responses found in the
    * `query_result.response_messages` field. If multiple default text responses exist, they will be concatenated when generating audio. If no default platform text responses exist, the
    * generated audio content will be empty. In some scenarios, multiple output audio fields may be present in the response structure. In these cases, only the top-most-level audio output
    * has content.
    */
  var outputAudio: js.UndefOr[String] = js.undefined
  
  /** The config used by the speech synthesizer to generate the output audio. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowCxV3OutputAudioConfig] = js.undefined
  
  /** The result of the conversational query. */
  var queryResult: js.UndefOr[GoogleCloudDialogflowCxV3QueryResult] = js.undefined
  
  /** Output only. The unique identifier of the response. It can be used to locate a response in the training example set or for reporting issues. */
  var responseId: js.UndefOr[String] = js.undefined
  
  /** Response type. */
  var responseType: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowCxV3DetectIntentResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DetectIntentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3DetectIntentResponse] (val x: Self) extends AnyVal {
    
    inline def setAllowCancellation(value: Boolean): Self = StObject.set(x, "allowCancellation", value.asInstanceOf[js.Any])
    
    inline def setAllowCancellationUndefined: Self = StObject.set(x, "allowCancellation", js.undefined)
    
    inline def setOutputAudio(value: String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfig(value: GoogleCloudDialogflowCxV3OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    inline def setQueryResult(value: GoogleCloudDialogflowCxV3QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
