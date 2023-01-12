package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOffersResponse extends StObject {
  
  /** The returned list of products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}
object GetOffersResponse {
  
  inline def apply(): GetOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOffersResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetOffersResponse] (val x: Self) extends AnyVal {
    
    inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
