package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecognizeRequest extends StObject {
  
  /**
    * Required. The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.undefined
  
  /**
    * Required. Provides information to the recognizer that specifies how to process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.undefined
}
object SchemaRecognizeRequest {
  
  inline def apply(): SchemaRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognizeRequest]
  }
  
  extension [Self <: SchemaRecognizeRequest](x: Self) {
    
    inline def setAudio(value: SchemaRecognitionAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setConfig(value: SchemaRecognitionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
