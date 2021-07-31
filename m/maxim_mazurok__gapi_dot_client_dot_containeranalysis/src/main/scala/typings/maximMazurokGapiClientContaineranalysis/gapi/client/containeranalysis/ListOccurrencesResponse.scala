package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOccurrencesResponse extends StObject {
  
  /** The next pagination token in the list response. It should be used as `page_token` for the following request. An empty value means no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The occurrences requested. */
  var occurrences: js.UndefOr[js.Array[Occurrence]] = js.undefined
}
object ListOccurrencesResponse {
  
  @scala.inline
  def apply(): ListOccurrencesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOccurrencesResponse]
  }
  
  @scala.inline
  implicit class ListOccurrencesResponseMutableBuilder[Self <: ListOccurrencesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setOccurrences(value: js.Array[Occurrence]): Self = StObject.set(x, "occurrences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOccurrencesUndefined: Self = StObject.set(x, "occurrences", js.undefined)
    
    @scala.inline
    def setOccurrencesVarargs(value: Occurrence*): Self = StObject.set(x, "occurrences", js.Array(value :_*))
  }
}
