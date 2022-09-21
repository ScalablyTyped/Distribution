package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListGatewaysResponse extends StObject {
  
  /**
    * List of Gateway resources.
    */
  var gateways: js.UndefOr[js.Array[SchemaGateway]] = js.undefined
  
  /**
    * If there might be more results than those appearing in this response, then `next_page_token` is included. To get the next set of results, call this method again using the value of `next_page_token` as `page_token`.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListGatewaysResponse {
  
  inline def apply(): SchemaListGatewaysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListGatewaysResponse]
  }
  
  extension [Self <: SchemaListGatewaysResponse](x: Self) {
    
    inline def setGateways(value: js.Array[SchemaGateway]): Self = StObject.set(x, "gateways", value.asInstanceOf[js.Any])
    
    inline def setGatewaysUndefined: Self = StObject.set(x, "gateways", js.undefined)
    
    inline def setGatewaysVarargs(value: SchemaGateway*): Self = StObject.set(x, "gateways", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
