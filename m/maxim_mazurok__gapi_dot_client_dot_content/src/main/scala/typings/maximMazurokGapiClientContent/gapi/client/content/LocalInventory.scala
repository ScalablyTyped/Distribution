package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalInventory extends StObject {
  
  /** Availability of the product. For accepted attribute values, see the local product inventory feed specification. */
  var availability: js.UndefOr[String] = js.undefined
  
  /** In-store product location. */
  var instoreProductLocation: js.UndefOr[String] = js.undefined
  
  /** Identifies what kind of resource this is. Value: the fixed string "`content#localInventory`" */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Supported pickup method for this offer. Unless the value is "not supported", this field must be submitted together with `pickupSla`. For accepted attribute values, see the local
    * product inventory feed specification.
    */
  var pickupMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Expected date that an order will be ready for pickup relative to the order date. Must be submitted together with `pickupMethod`. For accepted attribute values, see the local product
    * inventory feed specification.
    */
  var pickupSla: js.UndefOr[String] = js.undefined
  
  /** Price of the product. */
  var price: js.UndefOr[Price] = js.undefined
  
  /** Quantity of the product. Must be nonnegative. */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /** Sale price of the product. Mandatory if `sale_price_effective_date` is defined. */
  var salePrice: js.UndefOr[Price] = js.undefined
  
  /** A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash. Both dates may be specified as 'null' if undecided. */
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  
  /** Required. Store code of this local inventory resource. */
  var storeCode: js.UndefOr[String] = js.undefined
}
object LocalInventory {
  
  inline def apply(): LocalInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalInventory]
  }
  
  extension [Self <: LocalInventory](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setInstoreProductLocation(value: String): Self = StObject.set(x, "instoreProductLocation", value.asInstanceOf[js.Any])
    
    inline def setInstoreProductLocationUndefined: Self = StObject.set(x, "instoreProductLocation", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPickupMethod(value: String): Self = StObject.set(x, "pickupMethod", value.asInstanceOf[js.Any])
    
    inline def setPickupMethodUndefined: Self = StObject.set(x, "pickupMethod", js.undefined)
    
    inline def setPickupSla(value: String): Self = StObject.set(x, "pickupSla", value.asInstanceOf[js.Any])
    
    inline def setPickupSlaUndefined: Self = StObject.set(x, "pickupSla", js.undefined)
    
    inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSalePrice(value: Price): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    inline def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    inline def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    inline def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
  }
}
