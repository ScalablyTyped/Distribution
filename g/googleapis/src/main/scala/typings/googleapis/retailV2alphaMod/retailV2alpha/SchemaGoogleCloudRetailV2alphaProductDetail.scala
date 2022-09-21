package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaProductDetail extends StObject {
  
  /**
    * Required. Product information. Required field(s): * Product.id Optional override field(s): * Product.price_info If any supported optional fields are provided, we will treat them as a full override when looking up product information from the catalog. Thus, it is important to ensure that the overriding fields are accurate and complete. All other product fields are ignored and instead populated via catalog lookup after event ingestion.
    */
  var product: js.UndefOr[SchemaGoogleCloudRetailV2alphaProduct] = js.undefined
  
  /**
    * Quantity of the product associated with the user event. For example, this field will be 2 if two products are added to the shopping cart for `purchase-complete` event. Required for `add-to-cart` and `purchase-complete` event types.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaProductDetail {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaProductDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaProductDetail]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaProductDetail](x: Self) {
    
    inline def setProduct(value: SchemaGoogleCloudRetailV2alphaProduct): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
  }
}
