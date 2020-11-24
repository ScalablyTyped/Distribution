package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all details associated with a given filtered
  * bid reason.
  */
@js.native
trait SchemaListCreativeStatusBreakdownByDetailResponse extends js.Object {
  
  /**
    * The type of detail that the detail IDs represent.
    */
  var detailType: js.UndefOr[String] = js.native
  
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[SchemaFilteredBidDetailRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativeStatusBreakdownByDetailRequest.pageToken field in the
    * subsequent call to the filteredBids.details.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListCreativeStatusBreakdownByDetailResponse {
  
  @scala.inline
  def apply(): SchemaListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByDetailResponse]
  }
  
  @scala.inline
  implicit class SchemaListCreativeStatusBreakdownByDetailResponseOps[Self <: SchemaListCreativeStatusBreakdownByDetailResponse] (val x: Self) extends AnyVal {
    
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
    def setFilteredBidDetailRowsVarargs(value: SchemaFilteredBidDetailRow*): Self = this.set("filteredBidDetailRows", js.Array(value :_*))
    
    @scala.inline
    def setFilteredBidDetailRows(value: js.Array[SchemaFilteredBidDetailRow]): Self = this.set("filteredBidDetailRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilteredBidDetailRows: Self = this.set("filteredBidDetailRows", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
