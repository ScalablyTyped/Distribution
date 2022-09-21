package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNonBillableWinningBidsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListNonBillableWinningBidsRequest.pageToken field in the subsequent call to the nonBillableWinningBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of rows, with counts of bids not billed aggregated by reason. */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[NonBillableWinningBidStatusRow]] = js.undefined
}
object ListNonBillableWinningBidsResponse {
  
  inline def apply(): ListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNonBillableWinningBidsResponse]
  }
  
  extension [Self <: ListNonBillableWinningBidsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNonBillableWinningBidStatusRows(value: js.Array[NonBillableWinningBidStatusRow]): Self = StObject.set(x, "nonBillableWinningBidStatusRows", value.asInstanceOf[js.Any])
    
    inline def setNonBillableWinningBidStatusRowsUndefined: Self = StObject.set(x, "nonBillableWinningBidStatusRows", js.undefined)
    
    inline def setNonBillableWinningBidStatusRowsVarargs(value: NonBillableWinningBidStatusRow*): Self = StObject.set(x, "nonBillableWinningBidStatusRows", js.Array(value*))
  }
}
