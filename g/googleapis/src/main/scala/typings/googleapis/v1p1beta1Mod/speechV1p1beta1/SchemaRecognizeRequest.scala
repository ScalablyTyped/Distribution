package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top-level message sent by the client for the `Recognize` method.
  */
trait SchemaRecognizeRequest extends StObject {
  
  /**
    * *Required* The audio data to be recognized.
    */
  var audio: js.UndefOr[SchemaRecognitionAudio] = js.undefined
  
  /**
    * *Required* Provides information to the recognizer that specifies how to
    * process the request.
    */
  var config: js.UndefOr[SchemaRecognitionConfig] = js.undefined
  
  /**
    * *Optional* The name of the model to use for recognition.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaRecognizeRequest {
  
  @scala.inline
  def apply(): SchemaRecognizeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognizeRequest]
  }
  
  @scala.inline
  implicit class SchemaRecognizeRequestMutableBuilder[Self <: SchemaRecognizeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAudio(value: SchemaRecognitionAudio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setConfig(value: SchemaRecognitionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
