package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3DetectIntentRequest extends StObject {
  
  /**
    * Instructs the speech synthesizer how to generate the output audio.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowCxV3OutputAudioConfig] = js.undefined
  
  /**
    * Required. The input specification.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowCxV3QueryInput] = js.undefined
  
  /**
    * The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowCxV3QueryParameters] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3DetectIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3DetectIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3DetectIntentRequest](x: Self) {
    
    inline def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowCxV3OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setQueryInput(value: SchemaGoogleCloudDialogflowCxV3QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: SchemaGoogleCloudDialogflowCxV3QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
