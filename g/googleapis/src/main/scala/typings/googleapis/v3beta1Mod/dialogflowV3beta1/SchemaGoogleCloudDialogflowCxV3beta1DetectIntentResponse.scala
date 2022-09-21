package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse extends StObject {
  
  /**
    * Indicates whether the partial response can be cancelled when a later response arrives. e.g. if the agent specified some music as partial response, it can be cancelled.
    */
  var allowCancellation: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The audio data bytes encoded as specified in the request. Note: The output audio is generated based on the values of default platform text responses found in the `query_result.response_messages` field. If multiple default text responses exist, they will be concatenated when generating audio. If no default platform text responses exist, the generated audio content will be empty. In some scenarios, multiple output audio fields may be present in the response structure. In these cases, only the top-most-level audio output has content.
    */
  var outputAudio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The config used by the speech synthesizer to generate the output audio.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1OutputAudioConfig] = js.undefined
  
  /**
    * The result of the conversational query.
    */
  var queryResult: js.UndefOr[SchemaGoogleCloudDialogflowCxV3beta1QueryResult] = js.undefined
  
  /**
    * Output only. The unique identifier of the response. It can be used to locate a response in the training example set or for reporting issues.
    */
  var responseId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Response type.
    */
  var responseType: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1DetectIntentResponse](x: Self) {
    
    inline def setAllowCancellation(value: Boolean): Self = StObject.set(x, "allowCancellation", value.asInstanceOf[js.Any])
    
    inline def setAllowCancellationNull: Self = StObject.set(x, "allowCancellation", null)
    
    inline def setAllowCancellationUndefined: Self = StObject.set(x, "allowCancellation", js.undefined)
    
    inline def setOutputAudio(value: String): Self = StObject.set(x, "outputAudio", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowCxV3beta1OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setOutputAudioNull: Self = StObject.set(x, "outputAudio", null)
    
    inline def setOutputAudioUndefined: Self = StObject.set(x, "outputAudio", js.undefined)
    
    inline def setQueryResult(value: SchemaGoogleCloudDialogflowCxV3beta1QueryResult): Self = StObject.set(x, "queryResult", value.asInstanceOf[js.Any])
    
    inline def setQueryResultUndefined: Self = StObject.set(x, "queryResult", js.undefined)
    
    inline def setResponseId(value: String): Self = StObject.set(x, "responseId", value.asInstanceOf[js.Any])
    
    inline def setResponseIdNull: Self = StObject.set(x, "responseId", null)
    
    inline def setResponseIdUndefined: Self = StObject.set(x, "responseId", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeNull: Self = StObject.set(x, "responseType", null)
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
  }
}
