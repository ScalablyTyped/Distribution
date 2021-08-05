package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The request to detect user&#39;s intent.
  */
trait SchemaGoogleCloudDialogflowV2DetectIntentRequest extends StObject {
  
  /**
    * Optional. The natural language speech audio to be processed. This field
    * should be populated iff `query_input` is set to an input audio config. A
    * single request can contain up to 1 minute of speech audio data.
    */
  var inputAudio: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. Instructs the speech synthesizer how to generate the output
    * audio. If this field is not set and agent-level speech synthesizer is not
    * configured, no output audio is generated.
    */
  var outputAudioConfig: js.UndefOr[SchemaGoogleCloudDialogflowV2OutputAudioConfig] = js.undefined
  
  /**
    * Required. The input specification. It can be set to:  1.  an audio config
    * which instructs the speech recognizer how to process the speech audio, 2.
    * a conversational query in the form of text, or  3.  an event that
    * specifies which intent to trigger.
    */
  var queryInput: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryInput] = js.undefined
  
  /**
    * Optional. The parameters of this query.
    */
  var queryParams: js.UndefOr[SchemaGoogleCloudDialogflowV2QueryParameters] = js.undefined
}
object SchemaGoogleCloudDialogflowV2DetectIntentRequest {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2DetectIntentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2DetectIntentRequest]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2DetectIntentRequest](x: Self) {
    
    inline def setInputAudio(value: String): Self = StObject.set(x, "inputAudio", value.asInstanceOf[js.Any])
    
    inline def setInputAudioUndefined: Self = StObject.set(x, "inputAudio", js.undefined)
    
    inline def setOutputAudioConfig(value: SchemaGoogleCloudDialogflowV2OutputAudioConfig): Self = StObject.set(x, "outputAudioConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputAudioConfigUndefined: Self = StObject.set(x, "outputAudioConfig", js.undefined)
    
    inline def setQueryInput(value: SchemaGoogleCloudDialogflowV2QueryInput): Self = StObject.set(x, "queryInput", value.asInstanceOf[js.Any])
    
    inline def setQueryInputUndefined: Self = StObject.set(x, "queryInput", js.undefined)
    
    inline def setQueryParams(value: SchemaGoogleCloudDialogflowV2QueryParameters): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
    
    inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
  }
}
