package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem extends StObject {
  
  /**
    * Optional. The available quantity of the item.
    */
  var availableQuantity: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Canonical URL directly linking to the item detail page with a length limit of 5 KiB..
    */
  var canonicalProductUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. A map to pass the costs associated with the product. For example: {"manufacturing": 45.5\} The profit of selling this item is computed like so: * If 'exactPrice' is provided, profit = displayPrice - sum(costs) * If 'priceRange' is provided, profit = minPrice - sum(costs)
    */
  var costs: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  
  /**
    * Optional. Only required if the price is set. Currency code for price/costs. Use three-character ISO-4217 code.
    */
  var currencyCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The exact product price.
    */
  var exactPrice: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice] = js.undefined
  
  /**
    * Optional. Product images for the catalog item.
    */
  var images: js.UndefOr[js.Array[SchemaGoogleCloudRecommendationengineV1beta1Image]] = js.undefined
  
  /**
    * Optional. The product price range.
    */
  var priceRange: js.UndefOr[SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange] = js.undefined
  
  /**
    * Optional. Online stock state of the catalog item. Default is `IN_STOCK`.
    */
  var stockState: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItem](x: Self) {
    
    inline def setAvailableQuantity(value: String): Self = StObject.set(x, "availableQuantity", value.asInstanceOf[js.Any])
    
    inline def setAvailableQuantityNull: Self = StObject.set(x, "availableQuantity", null)
    
    inline def setAvailableQuantityUndefined: Self = StObject.set(x, "availableQuantity", js.undefined)
    
    inline def setCanonicalProductUri(value: String): Self = StObject.set(x, "canonicalProductUri", value.asInstanceOf[js.Any])
    
    inline def setCanonicalProductUriNull: Self = StObject.set(x, "canonicalProductUri", null)
    
    inline def setCanonicalProductUriUndefined: Self = StObject.set(x, "canonicalProductUri", js.undefined)
    
    inline def setCosts(value: StringDictionary[Double]): Self = StObject.set(x, "costs", value.asInstanceOf[js.Any])
    
    inline def setCostsNull: Self = StObject.set(x, "costs", null)
    
    inline def setCostsUndefined: Self = StObject.set(x, "costs", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeNull: Self = StObject.set(x, "currencyCode", null)
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setExactPrice(value: SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice): Self = StObject.set(x, "exactPrice", value.asInstanceOf[js.Any])
    
    inline def setExactPriceUndefined: Self = StObject.set(x, "exactPrice", js.undefined)
    
    inline def setImages(value: js.Array[SchemaGoogleCloudRecommendationengineV1beta1Image]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: SchemaGoogleCloudRecommendationengineV1beta1Image*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setPriceRange(value: SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange): Self = StObject.set(x, "priceRange", value.asInstanceOf[js.Any])
    
    inline def setPriceRangeUndefined: Self = StObject.set(x, "priceRange", js.undefined)
    
    inline def setStockState(value: String): Self = StObject.set(x, "stockState", value.asInstanceOf[js.Any])
    
    inline def setStockStateNull: Self = StObject.set(x, "stockState", null)
    
    inline def setStockStateUndefined: Self = StObject.set(x, "stockState", js.undefined)
  }
}
