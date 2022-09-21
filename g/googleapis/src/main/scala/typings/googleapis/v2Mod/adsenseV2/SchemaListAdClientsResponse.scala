package typings.googleapis.v2Mod.adsenseV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListAdClientsResponse extends StObject {
  
  /**
    * The ad clients returned in this list response.
    */
  var adClients: js.UndefOr[js.Array[SchemaAdClient]] = js.undefined
  
  /**
    * Continuation token used to page through ad clients. To retrieve the next page of the results, set the next request's "page_token" value to this.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListAdClientsResponse {
  
  inline def apply(): SchemaListAdClientsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAdClientsResponse]
  }
  
  extension [Self <: SchemaListAdClientsResponse](x: Self) {
    
    inline def setAdClients(value: js.Array[SchemaAdClient]): Self = StObject.set(x, "adClients", value.asInstanceOf[js.Any])
    
    inline def setAdClientsUndefined: Self = StObject.set(x, "adClients", js.undefined)
    
    inline def setAdClientsVarargs(value: SchemaAdClient*): Self = StObject.set(x, "adClients", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
