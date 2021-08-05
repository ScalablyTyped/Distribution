package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateNotesResponse extends StObject {
  
  /** The notes that were created. */
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
}
object BatchCreateNotesResponse {
  
  inline def apply(): BatchCreateNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateNotesResponse]
  }
  
  extension [Self <: BatchCreateNotesResponse](x: Self) {
    
    inline def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
