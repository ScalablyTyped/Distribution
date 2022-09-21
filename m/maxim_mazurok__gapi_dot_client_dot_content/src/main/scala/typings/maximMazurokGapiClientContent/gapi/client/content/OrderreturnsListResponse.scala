package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderreturnsListResponse extends StObject {
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#orderreturnsListResponse`". */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The token for the retrieval of the next page of returns. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var resources: js.UndefOr[js.Array[MerchantOrderReturn]] = js.undefined
}
object OrderreturnsListResponse {
  
  inline def apply(): OrderreturnsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderreturnsListResponse]
  }
  
  extension [Self <: OrderreturnsListResponse](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setResources(value: js.Array[MerchantOrderReturn]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: MerchantOrderReturn*): Self = StObject.set(x, "resources", js.Array(value*))
  }
}
