package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListNonBillableWinningBidsResponse extends js.Object {
  
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
  implicit class ListNonBillableWinningBidsResponseOps[Self <: ListNonBillableWinningBidsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setNonBillableWinningBidStatusRowsVarargs(value: NonBillableWinningBidStatusRow*): Self = this.set("nonBillableWinningBidStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNonBillableWinningBidStatusRows(value: js.Array[NonBillableWinningBidStatusRow]): Self = this.set("nonBillableWinningBidStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonBillableWinningBidStatusRows: Self = this.set("nonBillableWinningBidStatusRows", js.undefined)
  }
}
