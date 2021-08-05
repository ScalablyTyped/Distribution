package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreativeStatusBreakdownByDetailResponse extends StObject {
  
  /** The type of detail that the detail IDs represent. */
  var detailType: js.UndefOr[String] = js.undefined
  
  /** List of rows, with counts of bids with a given creative status aggregated by detail. */
  var filteredBidDetailRows: js.UndefOr[js.Array[FilteredBidDetailRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListCreativeStatusBreakdownByDetailRequest.pageToken field in the subsequent call to the
    * filteredBids.details.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCreativeStatusBreakdownByDetailResponse {
  
  inline def apply(): ListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativeStatusBreakdownByDetailResponse]
  }
  
  extension [Self <: ListCreativeStatusBreakdownByDetailResponse](x: Self) {
    
    inline def setDetailType(value: String): Self = StObject.set(x, "detailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "detailType", js.undefined)
    
    inline def setFilteredBidDetailRows(value: js.Array[FilteredBidDetailRow]): Self = StObject.set(x, "filteredBidDetailRows", value.asInstanceOf[js.Any])
    
    inline def setFilteredBidDetailRowsUndefined: Self = StObject.set(x, "filteredBidDetailRows", js.undefined)
    
    inline def setFilteredBidDetailRowsVarargs(value: FilteredBidDetailRow*): Self = StObject.set(x, "filteredBidDetailRows", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
