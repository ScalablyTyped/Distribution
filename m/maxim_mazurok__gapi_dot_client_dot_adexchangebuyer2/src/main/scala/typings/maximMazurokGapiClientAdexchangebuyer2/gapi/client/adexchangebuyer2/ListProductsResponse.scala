package typings.maximMazurokGapiClientAdexchangebuyer2.gapi.client.adexchangebuyer2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListProductsResponse extends StObject {
  
  /** List pagination support. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of matching products at their head revision number. */
  var products: js.UndefOr[js.Array[Product]] = js.native
}
object ListProductsResponse {
  
  @scala.inline
  def apply(): ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductsResponse]
  }
  
  @scala.inline
  implicit class ListProductsResponseMutableBuilder[Self <: ListProductsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
