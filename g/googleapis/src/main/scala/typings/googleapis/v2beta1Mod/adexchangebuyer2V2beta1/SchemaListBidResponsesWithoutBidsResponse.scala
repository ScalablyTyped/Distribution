package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBidResponsesWithoutBidsResponse extends StObject {
  
  /**
    * List of rows, with counts of bid responses without bids aggregated by status.
    */
  var bidResponseWithoutBidsStatusRows: js.UndefOr[js.Array[SchemaBidResponseWithoutBidsStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListBidResponsesWithoutBidsRequest.pageToken field in the subsequent call to the bidResponsesWithoutBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBidResponsesWithoutBidsResponse {
  
  inline def apply(): SchemaListBidResponsesWithoutBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBidResponsesWithoutBidsResponse]
  }
  
  extension [Self <: SchemaListBidResponsesWithoutBidsResponse](x: Self) {
    
    inline def setBidResponseWithoutBidsStatusRows(value: js.Array[SchemaBidResponseWithoutBidsStatusRow]): Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", value.asInstanceOf[js.Any])
    
    inline def setBidResponseWithoutBidsStatusRowsUndefined: Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", js.undefined)
    
    inline def setBidResponseWithoutBidsStatusRowsVarargs(value: SchemaBidResponseWithoutBidsStatusRow*): Self = StObject.set(x, "bidResponseWithoutBidsStatusRows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
