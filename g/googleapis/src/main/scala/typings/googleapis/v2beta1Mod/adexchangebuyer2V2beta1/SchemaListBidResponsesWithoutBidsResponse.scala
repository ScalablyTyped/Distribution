package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons that bid responses were considered
  * to have no applicable bids.
  */
trait SchemaListBidResponsesWithoutBidsResponse extends StObject {
  
  /**
    * List of rows, with counts of bid responses without bids aggregated by
    * status.
    */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[SchemaBidResponseWithoutBidsStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call
    * to the bidResponsesWithoutBids.list method to retrieve the next page of
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListBidResponsesWithoutBidsResponse {
  
  @scala.inline
  def apply(): SchemaListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidResponsesWithoutBidsResponse]
  }
  
  @scala.inline
  implicit class SchemaListBidResponsesWithoutBidsResponseMutableBuilder[Self <: SchemaListBidResponsesWithoutBidsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBidResponseWithoutBidsStatusRows(value: js.Array[SchemaBidResponseWithoutBidsStatusRow]): Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBidResponseWithoutBidsStatusRowsUndefined: Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", js.undefined)
    
    @scala.inline
    def setBidResponseWithoutBidsStatusRowsVarargs(value: SchemaBidResponseWithoutBidsStatusRow*): Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
