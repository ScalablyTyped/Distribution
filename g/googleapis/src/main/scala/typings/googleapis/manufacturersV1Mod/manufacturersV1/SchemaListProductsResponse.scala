package typings.googleapis.manufacturersV1Mod.manufacturersV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListProductsResponse extends StObject {
  
  /**
    * The token for the retrieval of the next page of product statuses.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of the products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.undefined
}
object SchemaListProductsResponse {
  
  @scala.inline
  def apply(): SchemaListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProductsResponse]
  }
  
  @scala.inline
  implicit class SchemaListProductsResponseMutableBuilder[Self <: SchemaListProductsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[SchemaProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: SchemaProduct*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
