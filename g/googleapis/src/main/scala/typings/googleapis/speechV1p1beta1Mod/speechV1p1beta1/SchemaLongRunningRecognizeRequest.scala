package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLongRunningRecognizeRequest extends StObject {
  
  /**
    * Required. The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.undefined
  
  /**
    * Required. Provides information to the recognizer that specifies how to process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.undefined
  
  /**
    * Optional. Specifies an optional destination for the recognition results.
    */
  var outputConfig: js.UndefOr[SchemaTranscriptOutputConfig] = js.undefined
}
object SchemaLongRunningRecognizeRequest {
  
  inline def apply(): SchemaLongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeRequest]
  }
  
  extension [Self <: SchemaLongRunningRecognizeRequest](x: Self) {
    
    inline def setAudio(value: SchemaRecognitionAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: SchemaRecognitionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setOutputConfig(value: SchemaTranscriptOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
  }
}
