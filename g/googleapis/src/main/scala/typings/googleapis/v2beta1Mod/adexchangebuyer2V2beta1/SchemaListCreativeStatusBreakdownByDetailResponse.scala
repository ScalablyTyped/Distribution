package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCreativeStatusBreakdownByDetailResponse extends StObject {
  
  /**
    * The type of detail that the detail IDs represent.
    */
  var detailType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of rows, with counts of bids with a given creative status aggregated by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[SchemaFilteredBidDetailRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListCreativeStatusBreakdownByDetailRequest.pageToken field in the subsequent call to the filteredBids.details.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCreativeStatusBreakdownByDetailResponse {
  
  inline def apply(): SchemaListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByDetailResponse]
  }
  
  extension [Self <: SchemaListCreativeStatusBreakdownByDetailResponse](x: Self) {
    
    inline def setDetailType(value: String): Self = StObject.set(x, "detailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeNull: Self = StObject.set(x, "detailType", null)
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "detailType", js.undefined)
    
    inline def setFilteredBidDetailRows(value: js.Array[SchemaFilteredBidDetailRow]): Self = StObject.set(x, "filteredBidDetailRows", value.asInstanceOf[js.Any])
    
    inline def setFilteredBidDetailRowsUndefined: Self = StObject.set(x, "filteredBidDetailRows", js.undefined)
    
    inline def setFilteredBidDetailRowsVarargs(value: SchemaFilteredBidDetailRow*): Self = StObject.set(x, "filteredBidDetailRows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
