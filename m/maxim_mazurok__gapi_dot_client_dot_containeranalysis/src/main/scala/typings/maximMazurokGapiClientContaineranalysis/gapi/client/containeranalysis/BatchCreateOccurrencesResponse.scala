package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateOccurrencesResponse extends StObject {
  
  /** The occurrences that were created. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.undefined
}
object BatchCreateOccurrencesResponse {
  
  inline def apply(): BatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateOccurrencesResponse]
  }
  
  extension [Self <: BatchCreateOccurrencesResponse](x: Self) {
    
    inline def setOccurrences(value: js.Array[Occurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    inline def setOccurrencesVarargs(value: Occurrence*): Self = StObject.set(x, "occurrences", js.Array(value*))
  }
}
