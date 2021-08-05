package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons that bids were filtered from the
  * auction.
  */
trait SchemaListFilteredBidsResponse extends StObject {
  
  /**
    * List of rows, with counts of filtered bids aggregated by filtering reason
    * (i.e. creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[SchemaCreativeStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilteredBidsRequest.pageToken field in the subsequent call to the
    * filteredBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFilteredBidsResponse {
  
  inline def apply(): SchemaListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFilteredBidsResponse]
  }
  
  extension [Self <: SchemaListFilteredBidsResponse](x: Self) {
    
    inline def setCreativeStatusRows(value: js.Array[SchemaCreativeStatusRow]): Self = StObject.set(x, "creativeStatusRows", value.asInstanceOf[js.Any])
    
    inline def setCreativeStatusRowsUndefined: Self = StObject.set(x, "creativeStatusRows", js.undefined)
    
    inline def setCreativeStatusRowsVarargs(value: SchemaCreativeStatusRow*): Self = StObject.set(x, "creativeStatusRows", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
