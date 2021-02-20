package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNonBillableWinningBidsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListNonBillableWinningBidsRequest.pageToken field in the subsequent call to the nonBillableWinningBids.list
    * method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of rows, with counts of bids not billed aggregated by reason. */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[NonBillableWinningBidStatusRow]] = js.native
}
object ListNonBillableWinningBidsResponse {
  
  @scala.inline
  def apply(): ListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListNonBillableWinningBidsResponse]
  }
  
  @scala.inline
  implicit class ListNonBillableWinningBidsResponseMutableBuilder[Self <: ListNonBillableWinningBidsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setNonBillableWinningBidStatusRows(value: js.Array[NonBillableWinningBidStatusRow]): Self = StObject.set(x, "nonBillableWinningBidStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonBillableWinningBidStatusRowsUndefined: Self = StObject.set(x, "nonBillableWinningBidStatusRows", js.undefined)
    
    @scala.inline
    def setNonBillableWinningBidStatusRowsVarargs(value: NonBillableWinningBidStatusRow*): Self = StObject.set(x, "nonBillableWinningBidStatusRows", js.Array(value :_*))
  }
}
