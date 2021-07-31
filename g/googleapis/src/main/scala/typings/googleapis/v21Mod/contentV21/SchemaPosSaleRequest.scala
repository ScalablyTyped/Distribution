package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosSaleRequest extends StObject {
  
  /**
    * The two-letter ISO 639-1 language code for the item.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Global Trade Item Number.
    */
  var gtin: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier for the item.
    */
  var itemId: js.UndefOr[String] = js.undefined
  
  /**
    * The price of the item.
    */
  var price: js.UndefOr[SchemaPrice] = js.undefined
  
  /**
    * The relative change of the available quantity. Negative for items
    * returned.
    */
  var quantity: js.UndefOr[String] = js.undefined
  
  /**
    * A unique ID to group items from the same sale event.
    */
  var saleId: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the merchant&#39;s store. Either a storeCode inserted
    * via the API or the code of the store in Google My Business.
    */
  var storeCode: js.UndefOr[String] = js.undefined
  
  /**
    * The CLDR territory code for the item.
    */
  var targetCountry: js.UndefOr[String] = js.undefined
  
  /**
    * The inventory timestamp, in ISO 8601 format.
    */
  var timestamp: js.UndefOr[String] = js.undefined
}
object SchemaPosSaleRequest {
  
  @scala.inline
  def apply(): SchemaPosSaleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosSaleRequest]
  }
  
  @scala.inline
  implicit class SchemaPosSaleRequestMutableBuilder[Self <: SchemaPosSaleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    @scala.inline
    def setGtin(value: String): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    @scala.inline
    def setItemId(value: String): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    @scala.inline
    def setPrice(value: SchemaPrice): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    @scala.inline
    def setQuantity(value: String): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    
    @scala.inline
    def setSaleId(value: String): Self = StObject.set(x, "saleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleIdUndefined: Self = StObject.set(x, "saleId", js.undefined)
    
    @scala.inline
    def setStoreCode(value: String): Self = StObject.set(x, "storeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreCodeUndefined: Self = StObject.set(x, "storeCode", js.undefined)
    
    @scala.inline
    def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
