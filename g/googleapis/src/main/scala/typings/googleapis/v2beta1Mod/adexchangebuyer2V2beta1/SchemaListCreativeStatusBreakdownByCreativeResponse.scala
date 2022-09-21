package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListCreativeStatusBreakdownByCreativeResponse extends StObject {
  
  /**
    * List of rows, with counts of bids with a given creative status aggregated by creative.
    */
  var filteredBidCreativeRows: js.UndefOr[js.Array[SchemaFilteredBidCreativeRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListCreativeStatusBreakdownByCreativeRequest.pageToken field in the subsequent call to the filteredBids.creatives.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListCreativeStatusBreakdownByCreativeResponse {
  
  inline def apply(): SchemaListCreativeStatusBreakdownByCreativeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByCreativeResponse]
  }
  
  extension [Self <: SchemaListCreativeStatusBreakdownByCreativeResponse](x: Self) {
    
    inline def setFilteredBidCreativeRows(value: js.Array[SchemaFilteredBidCreativeRow]): Self = StObject.set(x, "filteredBidCreativeRows", value.asInstanceOf[js.Any])
    
    inline def setFilteredBidCreativeRowsUndefined: Self = StObject.set(x, "filteredBidCreativeRows", js.undefined)
    
    inline def setFilteredBidCreativeRowsVarargs(value: SchemaFilteredBidCreativeRow*): Self = StObject.set(x, "filteredBidCreativeRows", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
