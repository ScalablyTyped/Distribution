package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateOccurrencesRequest extends StObject {
  
  /** Required. The occurrences to create. Max allowed length is 1000. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.undefined
}
object BatchCreateOccurrencesRequest {
  
  inline def apply(): BatchCreateOccurrencesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateOccurrencesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchCreateOccurrencesRequest] (val x: Self) extends AnyVal {
    
    inline def setOccurrences(value: js.Array[Occurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    inline def setOccurrencesVarargs(value: Occurrence*): Self = StObject.set(x, "occurrences", js.Array(value*))
  }
}
