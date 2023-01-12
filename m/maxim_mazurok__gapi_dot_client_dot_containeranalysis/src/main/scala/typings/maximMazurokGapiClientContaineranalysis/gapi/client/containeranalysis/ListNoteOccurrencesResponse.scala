package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNoteOccurrencesResponse extends StObject {
  
  /** Token to provide to skip to a particular spot in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The occurrences attached to the specified note. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.undefined
}
object ListNoteOccurrencesResponse {
  
  inline def apply(): ListNoteOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNoteOccurrencesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNoteOccurrencesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setOccurrences(value: js.Array[Occurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    inline def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    inline def setOccurrencesVarargs(value: Occurrence*): Self = StObject.set(x, "occurrences", js.Array(value*))
  }
}
