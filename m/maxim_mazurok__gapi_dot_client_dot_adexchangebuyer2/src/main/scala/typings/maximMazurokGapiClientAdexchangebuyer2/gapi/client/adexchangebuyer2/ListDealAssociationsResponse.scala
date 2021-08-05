package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDealAssociationsResponse extends StObject {
  
  /** The list of associations. */
  var associations: js.UndefOr[js.Array[CreativeDealAssociation]] = js.undefined
  
  /**
    * A token to retrieve the next page of results. Pass this value in the ListDealAssociationsRequest.page_token field in the subsequent call to 'ListDealAssociation' method to retrieve
    * the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListDealAssociationsResponse {
  
  inline def apply(): ListDealAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDealAssociationsResponse]
  }
  
  extension [Self <: ListDealAssociationsResponse](x: Self) {
    
    inline def setAssociations(value: js.Array[CreativeDealAssociation]): Self = StObject.set(x, "associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "associations", js.undefined)
    
    inline def setAssociationsVarargs(value: CreativeDealAssociation*): Self = StObject.set(x, "associations", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
