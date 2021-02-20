package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCreativeStatusBreakdownByCreativeResponse extends StObject {
  
  /** List of rows, with counts of bids with a given creative status aggregated by creative. */
  var filteredBidCreativeRows: js.UndefOr[js.Array[FilteredBidCreativeRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListCreativeStatusBreakdownByCreativeRequest.pageToken field in the subsequent call to the
    * filteredBids.creatives.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCreativeStatusBreakdownByCreativeResponse {
  
  @scala.inline
  def apply(): ListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativeStatusBreakdownByCreativeResponse]
  }
  
  @scala.inline
  implicit class ListCreativeStatusBreakdownByCreativeResponseMutableBuilder[Self <: ListCreativeStatusBreakdownByCreativeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilteredBidCreativeRows(value: js.Array[FilteredBidCreativeRow]): Self = StObject.set(x, "filteredBidCreativeRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilteredBidCreativeRowsUndefined: Self = StObject.set(x, "filteredBidCreativeRows", js.undefined)
    
    @scala.inline
    def setFilteredBidCreativeRowsVarargs(value: FilteredBidCreativeRow*): Self = StObject.set(x, "filteredBidCreativeRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
