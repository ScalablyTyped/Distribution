package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCreativeStatusBreakdownByCreativeResponse extends StObject {
  
  /** List of rows, with counts of bids with a given creative status aggregated by creative. */
  var filteredBidCreativeRows: js.UndefOr[js.Array[FilteredBidCreativeRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListCreativeStatusBreakdownByCreativeRequest.pageToken field in the subsequent call to the
    * filteredBids.creatives.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListCreativeStatusBreakdownByCreativeResponse {
  
  inline def apply(): ListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativeStatusBreakdownByCreativeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCreativeStatusBreakdownByCreativeResponse] (val x: Self) extends AnyVal {
    
    inline def setFilteredBidCreativeRows(value: js.Array[FilteredBidCreativeRow]): Self = StObject.set(x, "filteredBidCreativeRows", value.asInstanceOf[js.Any])
    
    inline def setFilteredBidCreativeRowsUndefined: Self = StObject.set(x, "filteredBidCreativeRows", js.undefined)
    
    inline def setFilteredBidCreativeRowsVarargs(value: FilteredBidCreativeRow*): Self = StObject.set(x, "filteredBidCreativeRows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
