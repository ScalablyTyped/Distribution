package typings.googleapis.speechV1p1beta1Mod.speechV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRecognizeResponse extends StObject {
  
  /**
    * Sequential list of transcription results corresponding to sequential portions of audio.
    */
  var results: js.UndefOr[js.Array[SchemaSpeechRecognitionResult]] = js.undefined
  
  /**
    * When available, billed audio seconds for the corresponding request.
    */
  var totalBilledTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaRecognizeResponse {
  
  inline def apply(): SchemaRecognizeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRecognizeResponse]
  }
  
  extension [Self <: SchemaRecognizeResponse](x: Self) {
    
    inline def setResults(value: js.Array[SchemaSpeechRecognitionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaSpeechRecognitionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setTotalBilledTime(value: String): Self = StObject.set(x, "totalBilledTime", value.asInstanceOf[js.Any])
    
    inline def setTotalBilledTimeNull: Self = StObject.set(x, "totalBilledTime", null)
    
    inline def setTotalBilledTimeUndefined: Self = StObject.set(x, "totalBilledTime", js.undefined)
  }
}
