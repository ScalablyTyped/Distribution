package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FulfillIntentResponse extends StObject {
  
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
}
object GoogleCloudDialogflowCxV3FulfillIntentResponse {
  
  inline def apply(): GoogleCloudDialogflowCxV3FulfillIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FulfillIntentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3FulfillIntentResponse] (val x: Self) extends AnyVal {
    
    inline def setOutputAudio(value: String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfig(value: GoogleCloudDialogflowCxV3OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    inline def setQueryResult(value: GoogleCloudDialogflowCxV3QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
  }
}
