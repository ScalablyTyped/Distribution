package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaGetOffersResponse extends StObject {
  
  /**
    * The returned list of products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.native
}
object SchemaGetOffersResponse {
  
  @scala.inline
  def apply(): SchemaGetOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOffersResponse]
  }
  
  @scala.inline
  implicit class SchemaGetOffersResponseMutableBuilder[Self <: SchemaGetOffersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProducts(value: js.Array[SchemaProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaProduct*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
