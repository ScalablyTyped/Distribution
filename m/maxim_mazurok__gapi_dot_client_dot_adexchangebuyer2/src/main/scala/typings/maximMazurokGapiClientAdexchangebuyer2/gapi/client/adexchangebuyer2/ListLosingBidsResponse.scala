package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLosingBidsResponse extends StObject {
  
  /** List of rows, with counts of losing bids aggregated by loss reason (i.e. creative status). */
  var creativeStatusRows: js.UndefOr[js.Array[CreativeStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListLosingBidsRequest.pageToken field in the subsequent call to the losingBids.list method to retrieve the next
    * page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListLosingBidsResponse {
  
  inline def apply(): ListLosingBidsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLosingBidsResponse]
  }
  
  extension [Self <: ListLosingBidsResponse](x: Self) {
    
    inline def setCreativeStatusRows(value: js.Array[CreativeStatusRow]): Self = StObject.set(x, "creativeStatusRows", value.asInstanceOf[js.Any])
    
    inline def setCreativeStatusRowsUndefined: Self = StObject.set(x, "creativeStatusRows", js.undefined)
    
    inline def setCreativeStatusRowsVarargs(value: CreativeStatusRow*): Self = StObject.set(x, "creativeStatusRows", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
