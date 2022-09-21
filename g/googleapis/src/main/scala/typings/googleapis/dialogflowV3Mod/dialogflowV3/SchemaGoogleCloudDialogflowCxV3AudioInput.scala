package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3AudioInput extends StObject {
  
  /**
    * The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes. For non-streaming audio detect intent, both `config` and `audio` must be provided. For streaming audio detect intent, `config` must be provided in the first request and `audio` must be provided in all following requests.
    */
  var audio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Instructs the speech recognizer how to process the speech audio.
    */
  var config: js.UndefOr[SchemaGoogleCloudDialogflowCxV3InputAudioConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3AudioInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3AudioInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3AudioInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3AudioInput](x: Self) {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: SchemaGoogleCloudDialogflowCxV3InputAudioConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
