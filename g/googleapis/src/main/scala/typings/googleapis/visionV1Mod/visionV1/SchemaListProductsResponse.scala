package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the `ListProducts` method.
  */
trait SchemaListProductsResponse extends StObject {
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * List of products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.undefined
}
object SchemaListProductsResponse {
  
  inline def apply(): SchemaListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListProductsResponse]
  }
  
  extension [Self <: SchemaListProductsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[SchemaProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaProduct*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
