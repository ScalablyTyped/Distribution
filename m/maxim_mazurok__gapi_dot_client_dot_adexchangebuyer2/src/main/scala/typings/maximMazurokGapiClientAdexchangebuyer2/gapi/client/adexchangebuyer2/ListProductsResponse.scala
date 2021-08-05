package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProductsResponse extends StObject {
  
  /** List pagination support. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of matching products at their head revision number. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}
object ListProductsResponse {
  
  inline def apply(): ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductsResponse]
  }
  
  extension [Self <: ListProductsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
