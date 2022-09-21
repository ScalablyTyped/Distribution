package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1AudioInput extends StObject {
  
  /**
    * Required. The natural language speech audio to be processed. A single request can contain up to 1 minute of speech audio data. The transcribed text cannot contain more than 256 bytes for virtual agent interactions.
    */
  var audio: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Instructs the speech recognizer how to process the speech audio.
    */
  var config: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1InputAudioConfig] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1AudioInput {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1AudioInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1AudioInput]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1AudioInput](x: Self) {
    
    inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioNull: Self = StObject.set(x, "audio", null)
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: SchemaGoogleCloudDialogflowV2beta1InputAudioConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
