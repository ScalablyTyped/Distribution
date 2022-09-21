package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaProductView extends StObject {
  
  /**
    * Aggregated destination status.
    */
  var aggregatedDestinationStatus: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Availability of the product.
    */
  var availability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Brand of the product.
    */
  var brand: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Channel of the product (online versus local).
    */
  var channel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Condition of the product.
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The time the merchant created the product in timestamp seconds.
    */
  var creationTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product price currency code (for example, ISO 4217). Absent if product price is not available.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Expiration date for the product. Specified on insertion.
    */
  var expirationDate: js.UndefOr[SchemaDate] = js.undefined
  
  /**
    * GTIN of the product.
    */
  var gtin: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The REST ID of the product, in the form of channel:contentLanguage:targetCountry:offerId. Content API methods that operate on products take this as their productId parameter. Should always be included in the SELECT clause.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Item group ID provided by the merchant for grouping variants together.
    */
  var itemGroupId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of item issues for the product.
    */
  var itemIssues: js.UndefOr[js.Array[SchemaProductViewItemIssue]] = js.undefined
  
  /**
    * Language code of the product in BCP 47 format.
    */
  var languageCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Merchant-provided id of the product.
    */
  var offerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Product price specified as micros in the product currency. Absent in case the information about the price of the product is not available.
    */
  var priceMicros: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The normalized shipping label specified in the feed
    */
  var shippingLabel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Title of the product.
    */
  var title: js.UndefOr[String | Null] = js.undefined
}
object SchemaProductView {
  
  inline def apply(): SchemaProductView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductView]
  }
  
  extension [Self <: SchemaProductView](x: Self) {
    
    inline def setAggregatedDestinationStatus(value: String): Self = StObject.set(x, "aggregatedDestinationStatus", value.asInstanceOf[js.Any])
    
    inline def setAggregatedDestinationStatusNull: Self = StObject.set(x, "aggregatedDestinationStatus", null)
    
    inline def setAggregatedDestinationStatusUndefined: Self = StObject.set(x, "aggregatedDestinationStatus", js.undefined)
    
    inline def setAvailability(value: String): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityNull: Self = StObject.set(x, "availability", null)
    
    inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
    
    inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandNull: Self = StObject.set(x, "brand", null)
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelNull: Self = StObject.set(x, "channel", null)
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setCreationTime(value: String): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeNull: Self = StObject.set(x, "creationTime", null)
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setExpirationDate(value: SchemaDate): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    inline def setGtin(value: js.Array[String]): Self = StObject.set(x, "gtin", value.asInstanceOf[js.Any])
    
    inline def setGtinNull: Self = StObject.set(x, "gtin", null)
    
    inline def setGtinUndefined: Self = StObject.set(x, "gtin", js.undefined)
    
    inline def setGtinVarargs(value: String*): Self = StObject.set(x, "gtin", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemGroupId(value: String): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdNull: Self = StObject.set(x, "itemGroupId", null)
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setItemIssues(value: js.Array[SchemaProductViewItemIssue]): Self = StObject.set(x, "itemIssues", value.asInstanceOf[js.Any])
    
    inline def setItemIssuesUndefined: Self = StObject.set(x, "itemIssues", js.undefined)
    
    inline def setItemIssuesVarargs(value: SchemaProductViewItemIssue*): Self = StObject.set(x, "itemIssues", js.Array(value*))
    
    inline def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeNull: Self = StObject.set(x, "languageCode", null)
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdNull: Self = StObject.set(x, "offerId", null)
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPriceMicros(value: String): Self = StObject.set(x, "priceMicros", value.asInstanceOf[js.Any])
    
    inline def setPriceMicrosNull: Self = StObject.set(x, "priceMicros", null)
    
    inline def setPriceMicrosUndefined: Self = StObject.set(x, "priceMicros", js.undefined)
    
    inline def setShippingLabel(value: String): Self = StObject.set(x, "shippingLabel", value.asInstanceOf[js.Any])
    
    inline def setShippingLabelNull: Self = StObject.set(x, "shippingLabel", null)
    
    inline def setShippingLabelUndefined: Self = StObject.set(x, "shippingLabel", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
