package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCreativeStatusBreakdownByDetailResponse extends js.Object {
  
  /** The type of detail that the detail IDs represent. */
  var detailType: js.UndefOr[String] = js.native
  
  /** List of rows, with counts of bids with a given creative status aggregated by detail. */
  var filteredBidDetailRows: js.UndefOr[js.Array[FilteredBidDetailRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListCreativeStatusBreakdownByDetailRequest.pageToken field in the subsequent call to the
    * filteredBids.details.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListCreativeStatusBreakdownByDetailResponse {
  
  @scala.inline
  def apply(): ListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCreativeStatusBreakdownByDetailResponse]
  }
  
  @scala.inline
  implicit class ListCreativeStatusBreakdownByDetailResponseOps[Self <: ListCreativeStatusBreakdownByDetailResponse] (val x: Self) extends AnyVal {
    
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
    def setDetailType(value: String): Self = this.set("detailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailType: Self = this.set("detailType", js.undefined)
    
    @scala.inline
    def setFilteredBidDetailRowsVarargs(value: FilteredBidDetailRow*): Self = this.set("filteredBidDetailRows", js.Array(value :_*))
    
    @scala.inline
    def setFilteredBidDetailRows(value: js.Array[FilteredBidDetailRow]): Self = this.set("filteredBidDetailRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredBidDetailRows: Self = this.set("filteredBidDetailRows", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
