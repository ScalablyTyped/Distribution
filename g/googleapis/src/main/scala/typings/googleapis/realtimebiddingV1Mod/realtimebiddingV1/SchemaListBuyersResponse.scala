package typings.googleapis.realtimebiddingV1Mod.realtimebiddingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListBuyersResponse extends StObject {
  
  /**
    * List of buyers.
    */
  var buyers: js.UndefOr[js.Array[SchemaBuyer]] = js.undefined
  
  /**
    * A token which can be passed to a subsequent call to the `ListBuyers` method to retrieve the next page of results in ListBuyersRequest.pageToken.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListBuyersResponse {
  
  inline def apply(): SchemaListBuyersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListBuyersResponse]
  }
  
  extension [Self <: SchemaListBuyersResponse](x: Self) {
    
    inline def setBuyers(value: js.Array[SchemaBuyer]): Self = StObject.set(x, "buyers", value.asInstanceOf[js.Any])
    
    inline def setBuyersUndefined: Self = StObject.set(x, "buyers", js.undefined)
    
    inline def setBuyersVarargs(value: SchemaBuyer*): Self = StObject.set(x, "buyers", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
