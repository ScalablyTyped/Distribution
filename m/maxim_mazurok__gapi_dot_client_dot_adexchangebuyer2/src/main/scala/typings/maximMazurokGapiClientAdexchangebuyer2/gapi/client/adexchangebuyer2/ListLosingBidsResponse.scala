package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLosingBidsResponse extends js.Object {
  
  /** List of rows, with counts of losing bids aggregated by loss reason (i.e. creative status). */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListLosingBidsRequest.pageToken field in the subsequent call to the losingBids.list method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListLosingBidsResponse {
  
  @scala.inline
  def apply(): ListLosingBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLosingBidsResponse]
  }
  
  @scala.inline
  implicit class ListLosingBidsResponseOps[Self <: ListLosingBidsResponse] (val x: Self) extends AnyVal {
    
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
    def setCreativeStatusRowsVarargs(value: CreativeStatusRow*): Self = this.set("creativeStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setCreativeStatusRows(value: js.Array[CreativeStatusRow]): Self = this.set("creativeStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreativeStatusRows: Self = this.set("creativeStatusRows", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
