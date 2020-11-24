package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons for which a buyer was not billed
  * for a winning bid.
  */
@js.native
trait SchemaListNonBillableWinningBidsResponse extends js.Object {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListNonBillableWinningBidsRequest.pageToken field in the subsequent call
    * to the nonBillableWinningBids.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * List of rows, with counts of bids not billed aggregated by reason.
    */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[SchemaNonBillableWinningBidStatusRow]] = js.native
}
object SchemaListNonBillableWinningBidsResponse {
  
  @scala.inline
  def apply(): SchemaListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNonBillableWinningBidsResponse]
  }
  
  @scala.inline
  implicit class SchemaListNonBillableWinningBidsResponseOps[Self <: SchemaListNonBillableWinningBidsResponse] (val x: Self) extends AnyVal {
    
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
    def setNonBillableWinningBidStatusRowsVarargs(value: SchemaNonBillableWinningBidStatusRow*): Self = this.set("nonBillableWinningBidStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNonBillableWinningBidStatusRows(value: js.Array[SchemaNonBillableWinningBidStatusRow]): Self = this.set("nonBillableWinningBidStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonBillableWinningBidStatusRows: Self = this.set("nonBillableWinningBidStatusRows", js.undefined)
  }
}
