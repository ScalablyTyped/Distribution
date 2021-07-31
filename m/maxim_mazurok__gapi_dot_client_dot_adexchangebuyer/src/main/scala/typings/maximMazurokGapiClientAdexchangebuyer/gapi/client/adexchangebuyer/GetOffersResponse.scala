package typings.maximMazurokGapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOffersResponse extends StObject {
  
  /** The returned list of products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}
object GetOffersResponse {
  
  @scala.inline
  def apply(): GetOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetOffersResponse]
  }
  
  @scala.inline
  implicit class GetOffersResponseMutableBuilder[Self <: GetOffersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
