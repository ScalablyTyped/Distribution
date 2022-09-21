package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse extends StObject {
  
  /**
    * A token, which can be sent as `page_token` to retrieve the next page. If this field is empty, there are no subsequent pages.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The products for the specified partner.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1Product]] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1ListProductsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[SchemaGoogleCloudPaymentsResellerSubscriptionV1Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Product*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
