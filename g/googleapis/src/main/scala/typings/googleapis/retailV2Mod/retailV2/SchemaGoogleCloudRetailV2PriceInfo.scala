package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2PriceInfo extends StObject {
  
  /**
    * The costs associated with the sale of a particular product. Used for gross profit reporting. * Profit = price - cost Google Merchant Center property [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
    */
  var cost: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The 3-letter currency code defined in [ISO 4217](https://www.iso.org/iso-4217-currency-codes.html). If this field is an unrecognizable currency code, an INVALID_ARGUMENT error is returned. The Product.Type.VARIANT Products with the same Product.primary_product_id must share the same currency_code. Otherwise, a FAILED_PRECONDITION error is returned.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price of the product without any discount. If zero, by default set to be the price. If set, original_price should be greater than or equal to price, otherwise an INVALID_ARGUMENT error is thrown.
    */
  var originalPrice: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Price of the product. Google Merchant Center property [price](https://support.google.com/merchants/answer/6324371). Schema.org property [Offer.price](https://schema.org/price).
    */
  var price: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The timestamp when the price starts to be effective. This can be set as a future timestamp, and the price is only used for search after price_effective_time. If so, the original_price must be set and original_price is used before price_effective_time. Do not set if price is always effective because it will cause additional latency during search.
    */
  var priceEffectiveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The timestamp when the price stops to be effective. The price is used for search before price_expire_time. If this field is set, the original_price must be set and original_price is used after price_expire_time. Do not set if price is always effective because it will cause additional latency during search.
    */
  var priceExpireTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The price range of all the child Product.Type.VARIANT Products grouped together on the Product.Type.PRIMARY Product. Only populated for Product.Type.PRIMARY Products. Note: This field is OUTPUT_ONLY for ProductService.GetProduct. Do not set this field in API requests.
    */
  var priceRange: js.UndefOr[SchemaGoogleCloudRetailV2PriceInfoPriceRange] = js.undefined
}
object SchemaGoogleCloudRetailV2PriceInfo {
  
  inline def apply(): SchemaGoogleCloudRetailV2PriceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2PriceInfo]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2PriceInfo](x: Self) {
    
    inline def setCost(value: Double): Self = StObject.set(x, "cost", value.asInstanceOf[js.Any])
    
    inline def setCostNull: Self = StObject.set(x, "cost", null)
    
    inline def setCostUndefined: Self = StObject.set(x, "cost", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setOriginalPrice(value: Double): Self = StObject.set(x, "originalPrice", value.asInstanceOf[js.Any])
    
    inline def setOriginalPriceNull: Self = StObject.set(x, "originalPrice", null)
    
    inline def setOriginalPriceUndefined: Self = StObject.set(x, "originalPrice", js.undefined)
    
    inline def setPrice(value: Double): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceEffectiveTime(value: String): Self = StObject.set(x, "priceEffectiveTime", value.asInstanceOf[js.Any])
    
    inline def setPriceEffectiveTimeNull: Self = StObject.set(x, "priceEffectiveTime", null)
    
    inline def setPriceEffectiveTimeUndefined: Self = StObject.set(x, "priceEffectiveTime", js.undefined)
    
    inline def setPriceExpireTime(value: String): Self = StObject.set(x, "priceExpireTime", value.asInstanceOf[js.Any])
    
    inline def setPriceExpireTimeNull: Self = StObject.set(x, "priceExpireTime", null)
    
    inline def setPriceExpireTimeUndefined: Self = StObject.set(x, "priceExpireTime", js.undefined)
    
    inline def setPriceNull: Self = StObject.set(x, "price", null)
    
    inline def setPriceRange(value: SchemaGoogleCloudRetailV2PriceInfoPriceRange): Self = StObject.set(x, "priceRange", value.asInstanceOf[js.Any])
    
    inline def setPriceRangeUndefined: Self = StObject.set(x, "priceRange", js.undefined)
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
