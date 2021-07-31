package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFilteredBidRequestsResponse extends StObject {
  
  /** List of rows, with counts of filtered bid requests aggregated by callout status. */
  var calloutStatusRows: js.UndefOr[js.Array[CalloutStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListFilteredBidRequestsRequest.pageToken field in the subsequent call to the filteredBidRequests.list method to
    * retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListFilteredBidRequestsResponse {
  
  @scala.inline
  def apply(): ListFilteredBidRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFilteredBidRequestsResponse]
  }
  
  @scala.inline
  implicit class ListFilteredBidRequestsResponseMutableBuilder[Self <: ListFilteredBidRequestsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutStatusRows(value: js.Array[CalloutStatusRow]): Self = StObject.set(x, "calloutStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalloutStatusRowsUndefined: Self = StObject.set(x, "calloutStatusRows", js.undefined)
    
    @scala.inline
    def setCalloutStatusRowsVarargs(value: CalloutStatusRow*): Self = StObject.set(x, "calloutStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
