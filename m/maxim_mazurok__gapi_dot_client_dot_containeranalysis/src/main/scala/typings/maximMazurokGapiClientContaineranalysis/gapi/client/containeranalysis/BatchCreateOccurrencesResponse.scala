package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateOccurrencesResponse extends StObject {
  
  /** The occurrences that were created. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.native
}
object BatchCreateOccurrencesResponse {
  
  @scala.inline
  def apply(): BatchCreateOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateOccurrencesResponse]
  }
  
  @scala.inline
  implicit class BatchCreateOccurrencesResponseMutableBuilder[Self <: BatchCreateOccurrencesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOccurrences(value: js.Array[Occurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    @scala.inline
    def setOccurrencesVarargs(value: Occurrence*): Self = StObject.set(x, "occurrences", js.Array(value :_*))
  }
}
