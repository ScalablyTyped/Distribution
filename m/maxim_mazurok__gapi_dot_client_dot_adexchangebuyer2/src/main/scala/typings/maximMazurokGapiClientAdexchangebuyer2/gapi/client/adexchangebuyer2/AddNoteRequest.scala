package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddNoteRequest extends StObject {
  
  /** Details of the note to add. */
  var note: js.UndefOr[Note] = js.undefined
}
object AddNoteRequest {
  
  @scala.inline
  def apply(): AddNoteRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddNoteRequest]
  }
  
  @scala.inline
  implicit class AddNoteRequestMutableBuilder[Self <: AddNoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNote(value: Note): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
  }
}
