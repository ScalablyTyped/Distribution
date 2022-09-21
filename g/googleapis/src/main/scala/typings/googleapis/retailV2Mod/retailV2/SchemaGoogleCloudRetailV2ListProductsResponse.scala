package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ListProductsResponse extends StObject {
  
  /**
    * A token that can be sent as ListProductsRequest.page_token to retrieve the next page. If this field is omitted, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Products.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2Product]] = js.undefined
}
object SchemaGoogleCloudRetailV2ListProductsResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ListProductsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ListProductsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[SchemaGoogleCloudRetailV2Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGoogleCloudRetailV2Product*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
