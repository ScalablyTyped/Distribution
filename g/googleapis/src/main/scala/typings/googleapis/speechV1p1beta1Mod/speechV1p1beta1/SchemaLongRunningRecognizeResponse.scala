package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLongRunningRecognizeResponse extends StObject {
  
  /**
    * Original output config if present in the request.
    */
  var outputConfig: js.UndefOr[SchemaTranscriptOutputConfig] = js.undefined
  
  /**
    * If the transcript output fails this field contains the relevant error.
    */
  var outputError: js.UndefOr[SchemaStatus] = js.undefined
  
  /**
    * Sequential list of transcription results corresponding to sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.undefined
  
  /**
    * When available, billed audio seconds for the corresponding request.
    */
  var totalBilledTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaLongRunningRecognizeResponse {
  
  inline def apply(): SchemaLongRunningRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLongRunningRecognizeResponse]
  }
  
  extension [Self <: SchemaLongRunningRecognizeResponse](x: Self) {
    
    inline def setOutputConfig(value: SchemaTranscriptOutputConfig): Self = StObject.set(x, "outputConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputConfigUndefined: Self = StObject.set(x, "outputConfig", js.undefined)
    
    inline def setOutputError(value: SchemaStatus): Self = StObject.set(x, "outputError", value.asInstanceOf[js.Any])
    
    inline def setOutputErrorUndefined: Self = StObject.set(x, "outputError", js.undefined)
    
    inline def setResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaSpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotalBilledTime(value: String): Self = StObject.set(x, "totalBilledTime", value.asInstanceOf[js.Any])
    
    inline def setTotalBilledTimeNull: Self = StObject.set(x, "totalBilledTime", null)
    
    inline def setTotalBilledTimeUndefined: Self = StObject.set(x, "totalBilledTime", js.undefined)
  }
}
