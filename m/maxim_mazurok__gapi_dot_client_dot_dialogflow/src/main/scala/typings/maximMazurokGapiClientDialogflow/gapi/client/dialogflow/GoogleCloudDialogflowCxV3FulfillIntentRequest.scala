package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3FulfillIntentRequest extends StObject {
  
  /** The matched intent/event to fulfill. */
  var `match`: js.UndefOr[GoogleCloudDialogflowCxV3Match] = js.undefined
  
  /** Must be same as the corresponding MatchIntent request, otherwise the behavior is undefined. */
  var matchIntentRequest: js.UndefOr[GoogleCloudDialogflowCxV3MatchIntentRequest] = js.undefined
  
  /** Instructs the speech synthesizer how to generate output audio. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowCxV3OutputAudioConfig] = js.undefined
}
object GoogleCloudDialogflowCxV3FulfillIntentRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3FulfillIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3FulfillIntentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3FulfillIntentRequest](x: Self) {
    
    inline def setMatch(value: GoogleCloudDialogflowCxV3Match): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchIntentRequest(value: GoogleCloudDialogflowCxV3MatchIntentRequest): Self = StObject.set(x, "matchIntentRequest", value.asInstanceOf[js.Any])
    
    inline def setMatchIntentRequestUndefined: Self = StObject.set(x, "matchIntentRequest", js.undefined)
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setOutputAudioConfig(value: GoogleCloudDialogflowCxV3OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
  }
}
