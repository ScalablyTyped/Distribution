package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLocalInventory extends StObject {
  
  /**
    * Availability of the product. For accepted attribute values, see the local product inventory feed specification.
    */
  var availability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * In-store product location.
    */
  var instoreProductLocation: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string "`content#localInventory`"
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Supported pickup method for this offer. Unless the value is "not supported", this field must be submitted together with `pickupSla`. For accepted attribute values, see the local product inventory feed specification.
    */
  var pickupMethod: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expected date that an order will be ready for pickup relative to the order date. Must be submitted together with `pickupMethod`. For accepted attribute values, see the local product inventory feed specification.
    */
  var pickupSla: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * Quantity of the product. Must be nonnegative.
    */
  var quantity: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Sale price of the product. Mandatory if `sale_price_effective_date` is defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash. Both dates may be specified as 'null' if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Store code of this local inventory resource.
    */
  var storeCode: js.UndefOr[String | Null] = js.undefined
}
object SchemaLocalInventory {
  
  inline def apply(): SchemaLocalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocalInventory]
  }
  
  extension [Self <: SchemaLocalInventory](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setInstoreProductLocation(value: String): Self = StObject.set(x, "instoreProductLocation", value.asInstanceOf[js.Any])
    
    inline def setInstoreProductLocationNull: Self = StObject.set(x, "instoreProductLocation", null)
    
    inline def setInstoreProductLocationUndefined: Self = StObject.set(x, "instoreProductLocation", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPickupMethod(value: String): Self = StObject.set(x, "pickupMethod", value.asInstanceOf[js.Any])
    
    inline def setPickupMethodNull: Self = StObject.set(x, "pickupMethod", null)
    
    inline def setPickupMethodUndefined: Self = StObject.set(x, "pickupMethod", js.undefined)
    
    inline def setPickupSla(value: String): Self = StObject.set(x, "pickupSla", value.asInstanceOf[js.Any])
    
    inline def setPickupSlaNull: Self = StObject.set(x, "pickupSla", null)
    
    inline def setPickupSlaUndefined: Self = StObject.set(x, "pickupSla", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityNull: Self = StObject.set(x, "quantity", null)
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSalePrice(value: SchemaPrice): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDateNull: Self = StObject.set(x, "salePriceEffectiveDate", null)
    
    inline def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    inline def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeNull: Self = StObject.set(x, "storeCode", null)
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
  }
}
