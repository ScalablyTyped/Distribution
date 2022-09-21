package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBiddersResponse extends StObject {
  
  /**
    * List of bidders.
    */
  var bidders: js.UndefOr[js.Array[SchemaBidder]] = js.undefined
  
  /**
    * A token which can be passed to a subsequent call to the `ListBidders` method to retrieve the next page of results in ListBiddersRequest.pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBiddersResponse {
  
  inline def apply(): SchemaListBiddersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBiddersResponse]
  }
  
  extension [Self <: SchemaListBiddersResponse](x: Self) {
    
    inline def setBidders(value: js.Array[SchemaBidder]): Self = StObject.set(x, "bidders", value.asInstanceOf[js.Any])
    
    inline def setBiddersUndefined: Self = StObject.set(x, "bidders", js.undefined)
    
    inline def setBiddersVarargs(value: SchemaBidder*): Self = StObject.set(x, "bidders", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
