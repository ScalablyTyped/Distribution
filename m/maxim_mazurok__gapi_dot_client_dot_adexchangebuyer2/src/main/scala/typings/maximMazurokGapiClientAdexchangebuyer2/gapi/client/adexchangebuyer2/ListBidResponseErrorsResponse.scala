package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBidResponseErrorsResponse extends StObject {
  
  /** List of rows, with counts of bid responses aggregated by callout status. */
  var calloutStatusRows: js.UndefOr[js.Array[CalloutStatusRow]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListBidResponseErrorsRequest.pageToken field in the subsequent call to the bidResponseErrors.list method to
    * retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListBidResponseErrorsResponse {
  
  inline def apply(): ListBidResponseErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBidResponseErrorsResponse]
  }
  
  extension [Self <: ListBidResponseErrorsResponse](x: Self) {
    
    inline def setCalloutStatusRows(value: js.Array[CalloutStatusRow]): Self = StObject.set(x, "calloutStatusRows", value.asInstanceOf[js.Any])
    
    inline def setCalloutStatusRowsUndefined: Self = StObject.set(x, "calloutStatusRows", js.undefined)
    
    inline def setCalloutStatusRowsVarargs(value: CalloutStatusRow*): Self = StObject.set(x, "calloutStatusRows", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
