package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNotesResponse extends StObject {
  
  /** The next pagination token in the list response. It should be used as `page_token` for the following request. An empty value means no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The notes requested. */
  var notes: js.UndefOr[js.Array[Note]] = js.undefined
}
object ListNotesResponse {
  
  @scala.inline
  def apply(): ListNotesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNotesResponse]
  }
  
  @scala.inline
  implicit class ListNotesResponseMutableBuilder[Self <: ListNotesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNotes(value: js.Array[Note]): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    @scala.inline
    def setNotesVarargs(value: Note*): Self = StObject.set(x, "notes", js.Array(value :_*))
  }
}
