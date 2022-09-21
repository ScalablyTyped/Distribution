package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3DetectIntentRequest extends StObject {
  
  /** Instructs the speech synthesizer how to generate the output audio. */
  var outputAudioConfig: js.UndefOr[GoogleCloudDialogflowCxV3OutputAudioConfig] = js.undefined
  
  /** Required. The input specification. */
  var queryInput: js.UndefOr[GoogleCloudDialogflowCxV3QueryInput] = js.undefined
  
  /** The parameters of this query. */
  var queryParams: js.UndefOr[GoogleCloudDialogflowCxV3QueryParameters] = js.undefined
}
object GoogleCloudDialogflowCxV3DetectIntentRequest {
  
  inline def apply(): GoogleCloudDialogflowCxV3DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3DetectIntentRequest]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3DetectIntentRequest](x: Self) {
    
    inline def setOutputAudioConfig(value: GoogleCloudDialogflowCxV3OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setQueryInput(value: GoogleCloudDialogflowCxV3QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: GoogleCloudDialogflowCxV3QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
