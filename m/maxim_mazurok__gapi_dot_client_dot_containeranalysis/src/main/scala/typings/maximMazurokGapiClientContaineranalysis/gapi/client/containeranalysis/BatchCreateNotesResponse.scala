package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateNotesResponse extends StObject {
  
  /** The notes that were created. */
  var notes: js.UndefOr[js.Array[Note]] = js.native
}
object BatchCreateNotesResponse {
  
  @scala.inline
  def apply(): BatchCreateNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateNotesResponse]
  }
  
  @scala.inline
  implicit class BatchCreateNotesResponseMutableBuilder[Self <: BatchCreateNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
