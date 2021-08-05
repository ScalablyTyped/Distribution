package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing all reasons that bid requests were filtered
  * and not sent to the buyer.
  */
trait SchemaListFilteredBidRequestsResponse extends StObject {
  
  /**
    * List of rows, with counts of filtered bid requests aggregated by callout
    * status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[SchemaCalloutStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilteredBidRequestsRequest.pageToken field in the subsequent call to
    * the filteredBidRequests.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object SchemaListFilteredBidRequestsResponse {
  
  inline def apply(): SchemaListFilteredBidRequestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFilteredBidRequestsResponse]
  }
  
  extension [Self <: SchemaListFilteredBidRequestsResponse](x: Self) {
    
    inline def setCalloutStatusRows(value: js.Array[SchemaCalloutStatusRow]): Self = StObject.set(x, "calloutStatusRows", value.asInstanceOf[js.Any])
    
    inline def setCalloutStatusRowsUndefined: Self = StObject.set(x, "calloutStatusRows", js.undefined)
    
    inline def setCalloutStatusRowsVarargs(value: SchemaCalloutStatusRow*): Self = StObject.set(x, "calloutStatusRows", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
