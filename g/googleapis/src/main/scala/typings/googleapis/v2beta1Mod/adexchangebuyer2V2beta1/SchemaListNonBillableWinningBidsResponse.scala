package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListNonBillableWinningBidsResponse extends StObject {
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListNonBillableWinningBidsRequest.pageToken field in the subsequent call to the nonBillableWinningBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of rows, with counts of bids not billed aggregated by reason.
    */
  var nonBillableWinningBidStatusRows: js.UndefOr[js.Array[SchemaNonBillableWinningBidStatusRow]] = js.undefined
}
object SchemaListNonBillableWinningBidsResponse {
  
  inline def apply(): SchemaListNonBillableWinningBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListNonBillableWinningBidsResponse]
  }
  
  extension [Self <: SchemaListNonBillableWinningBidsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setNonBillableWinningBidStatusRows(value: js.Array[SchemaNonBillableWinningBidStatusRow]): Self = StObject.set(x, "nonBillableWinningBidStatusRows", value.asInstanceOf[js.Any])
    
    inline def setNonBillableWinningBidStatusRowsUndefined: Self = StObject.set(x, "nonBillableWinningBidStatusRows", js.undefined)
    
    inline def setNonBillableWinningBidStatusRowsVarargs(value: SchemaNonBillableWinningBidStatusRow*): Self = StObject.set(x, "nonBillableWinningBidStatusRows", js.Array(value*))
  }
}
