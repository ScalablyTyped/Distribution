package typings.googleapis.speechV1Mod.speechV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level message sent by the client for the `LongRunningRecognize`
  * method.
  */
trait SchemaLongRunningRecognizeRequest extends StObject {
  
  /**
    * *Required* The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.undefined
  
  /**
    * *Required* Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.undefined
}
object SchemaLongRunningRecognizeRequest {
  
  @scala.inline
  def apply(): SchemaLongRunningRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeRequest]
  }
  
  @scala.inline
  implicit class SchemaLongRunningRecognizeRequestMutableBuilder[Self <: SchemaLongRunningRecognizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: SchemaRecognitionAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setConfig(value: SchemaRecognitionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
  }
}
