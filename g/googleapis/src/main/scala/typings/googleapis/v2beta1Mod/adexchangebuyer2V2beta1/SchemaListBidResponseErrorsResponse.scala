package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons that bid responses resulted in an
  * error.
  */
@js.native
trait SchemaListBidResponseErrorsResponse extends js.Object {
  
  /**
    * List of rows, with counts of bid responses aggregated by callout status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[SchemaCalloutStatusRow]] = js.native
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidResponseErrorsRequest.pageToken field in the subsequent call to
    * the bidResponseErrors.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListBidResponseErrorsResponse {
  
  @scala.inline
  def apply(): SchemaListBidResponseErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidResponseErrorsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBidResponseErrorsResponseOps[Self <: SchemaListBidResponseErrorsResponse] (val x: Self) extends AnyVal {
    
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
    def setCalloutStatusRowsVarargs(value: SchemaCalloutStatusRow*): Self = this.set("calloutStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setCalloutStatusRows(value: js.Array[SchemaCalloutStatusRow]): Self = this.set("calloutStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCalloutStatusRows: Self = this.set("calloutStatusRows", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
