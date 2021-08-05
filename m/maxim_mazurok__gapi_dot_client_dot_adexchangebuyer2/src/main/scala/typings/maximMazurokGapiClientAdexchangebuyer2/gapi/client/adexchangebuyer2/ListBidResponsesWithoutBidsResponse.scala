package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBidResponsesWithoutBidsResponse extends StObject {
  
  /** List of rows, with counts of bid responses without bids aggregated by status. */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[BidResponseWithoutBidsStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call to the bidResponsesWithoutBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBidResponsesWithoutBidsResponse {
  
  inline def apply(): ListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBidResponsesWithoutBidsResponse]
  }
  
  extension [Self <: ListBidResponsesWithoutBidsResponse](x: Self) {
    
    inline def setBidResponseWithoutBidsStatusRows(value: js.Array[BidResponseWithoutBidsStatusRow]): Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", value.asInstanceOf[js.Any])
    
    inline def setBidResponseWithoutBidsStatusRowsUndefined: Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", js.undefined)
    
    inline def setBidResponseWithoutBidsStatusRowsVarargs(value: BidResponseWithoutBidsStatusRow*): Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
