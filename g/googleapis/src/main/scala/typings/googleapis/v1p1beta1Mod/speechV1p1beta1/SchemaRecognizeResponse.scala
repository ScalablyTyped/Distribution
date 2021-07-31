package typings.googleapis.v1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The only message returned to the client by the `Recognize` method. It
  * contains the result as zero or more sequential `SpeechRecognitionResult`
  * messages.
  */
trait SchemaRecognizeResponse extends StObject {
  
  /**
    * Output only. Sequential list of transcription results corresponding to
    * sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.undefined
}
object SchemaRecognizeResponse {
  
  @scala.inline
  def apply(): SchemaRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognizeResponse]
  }
  
  @scala.inline
  implicit class SchemaRecognizeResponseMutableBuilder[Self <: SchemaRecognizeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaSpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
