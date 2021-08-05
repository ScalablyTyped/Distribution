package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInventory extends StObject {
  
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.undefined
  
  /**
    * Custom label 0 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel0: js.UndefOr[String] = js.undefined
  
  /**
    * Custom label 1 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel1: js.UndefOr[String] = js.undefined
  
  /**
    * Custom label 2 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel2: js.UndefOr[String] = js.undefined
  
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel3: js.UndefOr[String] = js.undefined
  
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel4: js.UndefOr[String] = js.undefined
  
  /**
    * Number and amount of installments to pay for an item. Brazil only.
    */
  var installment: js.UndefOr[SchemaInstallment] = js.undefined
  
  /**
    * The instore product location. Supported only for local products.
    */
  var instoreProductLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventory&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * Loyalty points that users receive after purchasing the item. Japan only.
    */
  var loyaltyPoints: js.UndefOr[SchemaLoyaltyPoints] = js.undefined
  
  /**
    * Store pickup information. Only supported for local inventory. Not setting
    * pickup means &quot;don&#39;t update&quot; while setting it to the empty
    * value ({} in JSON) means &quot;delete&quot;. Otherwise, pickupMethod and
    * pickupSla must be set together, unless pickupMethod is &quot;not
    * supported&quot;.
    */
  var pickup: js.UndefOr[SchemaInventoryPickup] = js.undefined
  
  /**
    * The price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The quantity of the product. Must be equal to or greater than zero.
    * Supported only for local products.
    */
  var quantity: js.UndefOr[Double] = js.undefined
  
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.undefined
  
  /**
    * The quantity of the product that is available for selling on Google.
    * Supported only for online products.
    */
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.undefined
}
object SchemaInventory {
  
  inline def apply(): SchemaInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventory]
  }
  
  extension [Self <: SchemaInventory](x: Self) {
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setCustomLabel0(value: String): Self = StObject.set(x, "customLabel0", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel0Undefined: Self = StObject.set(x, "customLabel0", js.undefined)
    
    inline def setCustomLabel1(value: String): Self = StObject.set(x, "customLabel1", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel1Undefined: Self = StObject.set(x, "customLabel1", js.undefined)
    
    inline def setCustomLabel2(value: String): Self = StObject.set(x, "customLabel2", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel2Undefined: Self = StObject.set(x, "customLabel2", js.undefined)
    
    inline def setCustomLabel3(value: String): Self = StObject.set(x, "customLabel3", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel3Undefined: Self = StObject.set(x, "customLabel3", js.undefined)
    
    inline def setCustomLabel4(value: String): Self = StObject.set(x, "customLabel4", value.asInstanceOf[js.Any])
    
    inline def setCustomLabel4Undefined: Self = StObject.set(x, "customLabel4", js.undefined)
    
    inline def setInstallment(value: SchemaInstallment): Self = StObject.set(x, "installment", value.asInstanceOf[js.Any])
    
    inline def setInstallmentUndefined: Self = StObject.set(x, "installment", js.undefined)
    
    inline def setInstoreProductLocation(value: String): Self = StObject.set(x, "instoreProductLocation", value.asInstanceOf[js.Any])
    
    inline def setInstoreProductLocationUndefined: Self = StObject.set(x, "instoreProductLocation", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoyaltyPoints(value: SchemaLoyaltyPoints): Self = StObject.set(x, "loyaltyPoints", value.asInstanceOf[js.Any])
    
    inline def setLoyaltyPointsUndefined: Self = StObject.set(x, "loyaltyPoints", js.undefined)
    
    inline def setPickup(value: SchemaInventoryPickup): Self = StObject.set(x, "pickup", value.asInstanceOf[js.Any])
    
    inline def setPickupUndefined: Self = StObject.set(x, "pickup", js.undefined)
    
    inline def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    inline def setSalePrice(value: SchemaPrice): Self = StObject.set(x, "salePrice", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDate(value: String): Self = StObject.set(x, "salePriceEffectiveDate", value.asInstanceOf[js.Any])
    
    inline def setSalePriceEffectiveDateUndefined: Self = StObject.set(x, "salePriceEffectiveDate", js.undefined)
    
    inline def setSalePriceUndefined: Self = StObject.set(x, "salePrice", js.undefined)
    
    inline def setSellOnGoogleQuantity(value: Double): Self = StObject.set(x, "sellOnGoogleQuantity", value.asInstanceOf[js.Any])
    
    inline def setSellOnGoogleQuantityUndefined: Self = StObject.set(x, "sellOnGoogleQuantity", js.undefined)
  }
}
