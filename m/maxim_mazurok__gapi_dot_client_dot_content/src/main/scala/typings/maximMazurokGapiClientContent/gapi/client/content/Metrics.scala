package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  /** Average order size - the average number of items in an order. **This metric cannot be segmented by product dimensions and customer_country_code.** */
  var aos: js.UndefOr[Double] = js.undefined
  
  /**
    * Average order value - the average value (total price of items) of all placed orders. The currency of the returned value is stored in the currency_code segment. If this metric is
    * selected, 'segments.currency_code' is automatically added to the SELECT clause in the search query (unless it is explicitly selected by the user) and the currency_code segment is
    * populated in the response. **This metric cannot be segmented by product dimensions and customer_country_code.**
    */
  var aovMicros: js.UndefOr[Double] = js.undefined
  
  /** Number of clicks. */
  var clicks: js.UndefOr[String] = js.undefined
  
  /** Number of conversions divided by the number of clicks, reported on the impression date. The metric is currently available only for the FREE_PRODUCT_LISTING program. */
  var conversionRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Value of conversions in micros attributed to the product, reported on the conversion date. The metric is currently available only for the FREE_PRODUCT_LISTING program. The currency
    * of the returned value is stored in the currency_code segment. If this metric is selected, 'segments.currency_code' is automatically added to the SELECT clause in the search query
    * (unless it is explicitly selected by the user) and the currency_code segment is populated in the response.
    */
  var conversionValueMicros: js.UndefOr[String] = js.undefined
  
  /**
    * Number of conversions attributed to the product, reported on the conversion date. Depending on the attribution model, a conversion might be distributed across multiple clicks, where
    * each click gets its own credit assigned. This metric is a sum of all such credits. The metric is currently available only for the FREE_PRODUCT_LISTING program.
    */
  var conversions: js.UndefOr[Double] = js.undefined
  
  /** Click-through rate - the number of clicks merchant's products receive (clicks) divided by the number of times the products are shown (impressions). */
  var ctr: js.UndefOr[Double] = js.undefined
  
  /**
    * Average number of days between an order being placed and the order being fully shipped, reported on the last shipment date. **This metric cannot be segmented by product dimensions
    * and customer_country_code.**
    */
  var daysToShip: js.UndefOr[Double] = js.undefined
  
  /** Number of times merchant's products are shown. */
  var impressions: js.UndefOr[String] = js.undefined
  
  /** Average number of days between an item being ordered and the item being **This metric cannot be segmented by customer_country_code.** */
  var itemDaysToShip: js.UndefOr[Double] = js.undefined
  
  /**
    * Percentage of shipped items in relation to all finalized items (shipped or rejected by the merchant; unshipped items are not taken into account), reported on the order date. Item
    * fill rate is lowered by merchant rejections. **This metric cannot be segmented by customer_country_code.**
    */
  var itemFillRate: js.UndefOr[Double] = js.undefined
  
  /**
    * Total price of ordered items. Excludes shipping, taxes (US only), and customer cancellations that happened within 30 minutes of placing the order. The currency of the returned value
    * is stored in the currency_code segment. If this metric is selected, 'segments.currency_code' is automatically added to the SELECT clause in the search query (unless it is explicitly
    * selected by the user) and the currency_code segment is populated in the response. **This metric cannot be segmented by customer_country_code.**
    */
  var orderedItemSalesMicros: js.UndefOr[String] = js.undefined
  
  /** Number of ordered items. Excludes customer cancellations that happened within 30 minutes of placing the order. **This metric cannot be segmented by customer_country_code.** */
  var orderedItems: js.UndefOr[String] = js.undefined
  
  /**
    * Number of placed orders. Excludes customer cancellations that happened within 30 minutes of placing the order. **This metric cannot be segmented by product dimensions and
    * customer_country_code.**
    */
  var orders: js.UndefOr[String] = js.undefined
  
  /** Number of ordered items canceled by the merchant, reported on the order date. **This metric cannot be segmented by customer_country_code.** */
  var rejectedItems: js.UndefOr[String] = js.undefined
  
  /**
    * Total price of returned items divided by the total price of shipped items, reported on the order date. If this metric is selected, 'segments.currency_code' is automatically added to
    * the SELECT clause in the search query (unless it is explicitly selected by the user) and the currency_code segment is populated in the response. **This metric cannot be segmented by
    * customer_country_code.**
    */
  var returnRate: js.UndefOr[Double] = js.undefined
  
  /** Number of ordered items sent back for return, reported on the date when the merchant accepted the return. **This metric cannot be segmented by customer_country_code.** */
  var returnedItems: js.UndefOr[String] = js.undefined
  
  /**
    * Total price of ordered items sent back for return, reported on the date when the merchant accepted the return. The currency of the returned value is stored in the currency_code
    * segment. If this metric is selected, 'segments.currency_code' is automatically added to the SELECT clause in the search query (unless it is explicitly selected by the user) and the
    * currency_code segment is populated in the response. **This metric cannot be segmented by customer_country_code.**
    */
  var returnsMicros: js.UndefOr[String] = js.undefined
  
  /**
    * Total price of shipped items, reported on the order date. Excludes shipping and taxes (US only). The currency of the returned value is stored in the currency_code segment. If this
    * metric is selected, 'segments.currency_code' is automatically added to the SELECT clause in the search query (unless it is explicitly selected by the user) and the currency_code
    * segment is populated in the response. **This metric cannot be segmented by customer_country_code.**
    */
  var shippedItemSalesMicros: js.UndefOr[String] = js.undefined
  
  /** Number of shipped items, reported on the shipment date. **This metric cannot be segmented by customer_country_code.** */
  var shippedItems: js.UndefOr[String] = js.undefined
  
  /** Number of fully shipped orders, reported on the last shipment date. **This metric cannot be segmented by product dimensions and customer_country_code.** */
  var shippedOrders: js.UndefOr[String] = js.undefined
  
  /**
    * Number of ordered items not shipped up until the end of the queried day. If a multi-day period is specified in the search query, the returned value is the average number of
    * unshipped items over the days in the queried period. **This metric cannot be segmented by customer_country_code.**
    */
  var unshippedItems: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of orders not shipped or partially shipped up until the end of the queried day. If a multi-day period is specified in the search query, the returned value is the average
    * number of unshipped orders over the days in the queried period. **This metric cannot be segmented by product dimensions and customer_country_code.**
    */
  var unshippedOrders: js.UndefOr[Double] = js.undefined
}
object Metrics {
  
  inline def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setAos(value: Double): Self = StObject.set(x, "aos", value.asInstanceOf[js.Any])
    
    inline def setAosUndefined: Self = StObject.set(x, "aos", js.undefined)
    
    inline def setAovMicros(value: Double): Self = StObject.set(x, "aovMicros", value.asInstanceOf[js.Any])
    
    inline def setAovMicrosUndefined: Self = StObject.set(x, "aovMicros", js.undefined)
    
    inline def setClicks(value: String): Self = StObject.set(x, "clicks", value.asInstanceOf[js.Any])
    
    inline def setClicksUndefined: Self = StObject.set(x, "clicks", js.undefined)
    
    inline def setConversionRate(value: Double): Self = StObject.set(x, "conversionRate", value.asInstanceOf[js.Any])
    
    inline def setConversionRateUndefined: Self = StObject.set(x, "conversionRate", js.undefined)
    
    inline def setConversionValueMicros(value: String): Self = StObject.set(x, "conversionValueMicros", value.asInstanceOf[js.Any])
    
    inline def setConversionValueMicrosUndefined: Self = StObject.set(x, "conversionValueMicros", js.undefined)
    
    inline def setConversions(value: Double): Self = StObject.set(x, "conversions", value.asInstanceOf[js.Any])
    
    inline def setConversionsUndefined: Self = StObject.set(x, "conversions", js.undefined)
    
    inline def setCtr(value: Double): Self = StObject.set(x, "ctr", value.asInstanceOf[js.Any])
    
    inline def setCtrUndefined: Self = StObject.set(x, "ctr", js.undefined)
    
    inline def setDaysToShip(value: Double): Self = StObject.set(x, "daysToShip", value.asInstanceOf[js.Any])
    
    inline def setDaysToShipUndefined: Self = StObject.set(x, "daysToShip", js.undefined)
    
    inline def setImpressions(value: String): Self = StObject.set(x, "impressions", value.asInstanceOf[js.Any])
    
    inline def setImpressionsUndefined: Self = StObject.set(x, "impressions", js.undefined)
    
    inline def setItemDaysToShip(value: Double): Self = StObject.set(x, "itemDaysToShip", value.asInstanceOf[js.Any])
    
    inline def setItemDaysToShipUndefined: Self = StObject.set(x, "itemDaysToShip", js.undefined)
    
    inline def setItemFillRate(value: Double): Self = StObject.set(x, "itemFillRate", value.asInstanceOf[js.Any])
    
    inline def setItemFillRateUndefined: Self = StObject.set(x, "itemFillRate", js.undefined)
    
    inline def setOrderedItemSalesMicros(value: String): Self = StObject.set(x, "orderedItemSalesMicros", value.asInstanceOf[js.Any])
    
    inline def setOrderedItemSalesMicrosUndefined: Self = StObject.set(x, "orderedItemSalesMicros", js.undefined)
    
    inline def setOrderedItems(value: String): Self = StObject.set(x, "orderedItems", value.asInstanceOf[js.Any])
    
    inline def setOrderedItemsUndefined: Self = StObject.set(x, "orderedItems", js.undefined)
    
    inline def setOrders(value: String): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    inline def setRejectedItems(value: String): Self = StObject.set(x, "rejectedItems", value.asInstanceOf[js.Any])
    
    inline def setRejectedItemsUndefined: Self = StObject.set(x, "rejectedItems", js.undefined)
    
    inline def setReturnRate(value: Double): Self = StObject.set(x, "returnRate", value.asInstanceOf[js.Any])
    
    inline def setReturnRateUndefined: Self = StObject.set(x, "returnRate", js.undefined)
    
    inline def setReturnedItems(value: String): Self = StObject.set(x, "returnedItems", value.asInstanceOf[js.Any])
    
    inline def setReturnedItemsUndefined: Self = StObject.set(x, "returnedItems", js.undefined)
    
    inline def setReturnsMicros(value: String): Self = StObject.set(x, "returnsMicros", value.asInstanceOf[js.Any])
    
    inline def setReturnsMicrosUndefined: Self = StObject.set(x, "returnsMicros", js.undefined)
    
    inline def setShippedItemSalesMicros(value: String): Self = StObject.set(x, "shippedItemSalesMicros", value.asInstanceOf[js.Any])
    
    inline def setShippedItemSalesMicrosUndefined: Self = StObject.set(x, "shippedItemSalesMicros", js.undefined)
    
    inline def setShippedItems(value: String): Self = StObject.set(x, "shippedItems", value.asInstanceOf[js.Any])
    
    inline def setShippedItemsUndefined: Self = StObject.set(x, "shippedItems", js.undefined)
    
    inline def setShippedOrders(value: String): Self = StObject.set(x, "shippedOrders", value.asInstanceOf[js.Any])
    
    inline def setShippedOrdersUndefined: Self = StObject.set(x, "shippedOrders", js.undefined)
    
    inline def setUnshippedItems(value: Double): Self = StObject.set(x, "unshippedItems", value.asInstanceOf[js.Any])
    
    inline def setUnshippedItemsUndefined: Self = StObject.set(x, "unshippedItems", js.undefined)
    
    inline def setUnshippedOrders(value: Double): Self = StObject.set(x, "unshippedOrders", value.asInstanceOf[js.Any])
    
    inline def setUnshippedOrdersUndefined: Self = StObject.set(x, "unshippedOrders", js.undefined)
  }
}
