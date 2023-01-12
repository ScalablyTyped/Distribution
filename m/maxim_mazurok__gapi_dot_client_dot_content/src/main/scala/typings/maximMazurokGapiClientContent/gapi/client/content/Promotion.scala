package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promotion extends StObject {
  
  /** Product filter by brand for the promotion. */
  var brand: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Product filter by brand exclusion for the promotion. */
  var brandExclusion: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Required. The content language used as part of the unique identifier. `en` content language is available for all target countries. `fr` content language is available for `CA` and
    * `FR` target countries, and `de` content language is available for `DE` target country.
    */
  var contentLanguage: js.UndefOr[String] = js.undefined
  
  /** Required. Coupon value type for the promotion. */
  var couponValueType: js.UndefOr[String] = js.undefined
  
  /** Free gift description for the promotion. */
  var freeGiftDescription: js.UndefOr[String] = js.undefined
  
  /** Free gift item ID for the promotion. */
  var freeGiftItemId: js.UndefOr[String] = js.undefined
  
  /** Free gift value for the promotion. */
  var freeGiftValue: js.UndefOr[PriceAmount] = js.undefined
  
  /** Generic redemption code for the promotion. To be used with the `offerType` field. */
  var genericRedemptionCode: js.UndefOr[String] = js.undefined
  
  /** The number of items discounted in the promotion. */
  var getThisQuantityDiscounted: js.UndefOr[Double] = js.undefined
  
  /**
    * Required. Output only. The REST promotion ID to uniquely identify the promotion. Content API methods that operate on promotions take this as their `promotionId` parameter. The REST
    * ID for a promotion is of the form channel:contentLanguage:targetCountry:promotionId The `channel` field has a value of `"online"`, `"in_store"`, or `"online_in_store"`.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /** Product filter by item group ID for the promotion. */
  var itemGroupId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Product filter by item group ID exclusion for the promotion. */
  var itemGroupIdExclusion: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Product filter by item ID for the promotion. */
  var itemId: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Product filter by item ID exclusion for the promotion. */
  var itemIdExclusion: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Maximum purchase quantity for the promotion. */
  var limitQuantity: js.UndefOr[Double] = js.undefined
  
  /** Maximum purchase value for the promotion. */
  var limitValue: js.UndefOr[PriceAmount] = js.undefined
  
  /** Required. Long title for the promotion. */
  var longTitle: js.UndefOr[String] = js.undefined
  
  /** Minimum purchase amount for the promotion. */
  var minimumPurchaseAmount: js.UndefOr[PriceAmount] = js.undefined
  
  /** Minimum purchase quantity for the promotion. */
  var minimumPurchaseQuantity: js.UndefOr[Double] = js.undefined
  
  /** Cost cap for the promotion. */
  var moneyBudget: js.UndefOr[PriceAmount] = js.undefined
  
  /** The money off amount offered in the promotion. */
  var moneyOffAmount: js.UndefOr[PriceAmount] = js.undefined
  
  /** Required. Type of the promotion. */
  var offerType: js.UndefOr[String] = js.undefined
  
  /** Order limit for the promotion. */
  var orderLimit: js.UndefOr[Double] = js.undefined
  
  /** The percentage discount offered in the promotion. */
  var percentOff: js.UndefOr[Double] = js.undefined
  
  /** Required. Applicability of the promotion to either all products or only specific products. */
  var productApplicability: js.UndefOr[String] = js.undefined
  
  /** Product filter by product type for the promotion. */
  var productType: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Product filter by product type exclusion for the promotion. */
  var productTypeExclusion: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Destination ID for the promotion. */
  var promotionDestinationIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /** String representation of the promotion display dates. Deprecated. Use `promotion_display_time_period` instead. */
  var promotionDisplayDates: js.UndefOr[String] = js.undefined
  
  /** `TimePeriod` representation of the promotion's display dates. */
  var promotionDisplayTimePeriod: js.UndefOr[TimePeriod] = js.undefined
  
  /** String representation of the promotion effective dates. Deprecated. Use `promotion_effective_time_period` instead. */
  var promotionEffectiveDates: js.UndefOr[String] = js.undefined
  
  /** Required. `TimePeriod` representation of the promotion's effective dates. */
  var promotionEffectiveTimePeriod: js.UndefOr[TimePeriod] = js.undefined
  
  /** Required. The user provided promotion ID to uniquely identify the promotion. */
  var promotionId: js.UndefOr[String] = js.undefined
  
  /** Required. Redemption channel for the promotion. At least one channel is required. */
  var redemptionChannel: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Shipping service names for the promotion. */
  var shippingServiceNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Required. The target country used as part of the unique identifier. Can be `AU`, `CA`, `DE`, `FR`, `GB`, `IN` or `US`. */
  var targetCountry: js.UndefOr[String] = js.undefined
}
object Promotion {
  
  inline def apply(): Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Promotion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Promotion] (val x: Self) extends AnyVal {
    
    inline def setBrand(value: js.Array[String]): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    inline def setBrandExclusion(value: js.Array[String]): Self = StObject.set(x, "brandExclusion", value.asInstanceOf[js.Any])
    
    inline def setBrandExclusionUndefined: Self = StObject.set(x, "brandExclusion", js.undefined)
    
    inline def setBrandExclusionVarargs(value: String*): Self = StObject.set(x, "brandExclusion", js.Array(value*))
    
    inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
    
    inline def setBrandVarargs(value: String*): Self = StObject.set(x, "brand", js.Array(value*))
    
    inline def setContentLanguage(value: String): Self = StObject.set(x, "contentLanguage", value.asInstanceOf[js.Any])
    
    inline def setContentLanguageUndefined: Self = StObject.set(x, "contentLanguage", js.undefined)
    
    inline def setCouponValueType(value: String): Self = StObject.set(x, "couponValueType", value.asInstanceOf[js.Any])
    
    inline def setCouponValueTypeUndefined: Self = StObject.set(x, "couponValueType", js.undefined)
    
    inline def setFreeGiftDescription(value: String): Self = StObject.set(x, "freeGiftDescription", value.asInstanceOf[js.Any])
    
    inline def setFreeGiftDescriptionUndefined: Self = StObject.set(x, "freeGiftDescription", js.undefined)
    
    inline def setFreeGiftItemId(value: String): Self = StObject.set(x, "freeGiftItemId", value.asInstanceOf[js.Any])
    
    inline def setFreeGiftItemIdUndefined: Self = StObject.set(x, "freeGiftItemId", js.undefined)
    
    inline def setFreeGiftValue(value: PriceAmount): Self = StObject.set(x, "freeGiftValue", value.asInstanceOf[js.Any])
    
    inline def setFreeGiftValueUndefined: Self = StObject.set(x, "freeGiftValue", js.undefined)
    
    inline def setGenericRedemptionCode(value: String): Self = StObject.set(x, "genericRedemptionCode", value.asInstanceOf[js.Any])
    
    inline def setGenericRedemptionCodeUndefined: Self = StObject.set(x, "genericRedemptionCode", js.undefined)
    
    inline def setGetThisQuantityDiscounted(value: Double): Self = StObject.set(x, "getThisQuantityDiscounted", value.asInstanceOf[js.Any])
    
    inline def setGetThisQuantityDiscountedUndefined: Self = StObject.set(x, "getThisQuantityDiscounted", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemGroupId(value: js.Array[String]): Self = StObject.set(x, "itemGroupId", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdExclusion(value: js.Array[String]): Self = StObject.set(x, "itemGroupIdExclusion", value.asInstanceOf[js.Any])
    
    inline def setItemGroupIdExclusionUndefined: Self = StObject.set(x, "itemGroupIdExclusion", js.undefined)
    
    inline def setItemGroupIdExclusionVarargs(value: String*): Self = StObject.set(x, "itemGroupIdExclusion", js.Array(value*))
    
    inline def setItemGroupIdUndefined: Self = StObject.set(x, "itemGroupId", js.undefined)
    
    inline def setItemGroupIdVarargs(value: String*): Self = StObject.set(x, "itemGroupId", js.Array(value*))
    
    inline def setItemId(value: js.Array[String]): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdExclusion(value: js.Array[String]): Self = StObject.set(x, "itemIdExclusion", value.asInstanceOf[js.Any])
    
    inline def setItemIdExclusionUndefined: Self = StObject.set(x, "itemIdExclusion", js.undefined)
    
    inline def setItemIdExclusionVarargs(value: String*): Self = StObject.set(x, "itemIdExclusion", js.Array(value*))
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
    
    inline def setItemIdVarargs(value: String*): Self = StObject.set(x, "itemId", js.Array(value*))
    
    inline def setLimitQuantity(value: Double): Self = StObject.set(x, "limitQuantity", value.asInstanceOf[js.Any])
    
    inline def setLimitQuantityUndefined: Self = StObject.set(x, "limitQuantity", js.undefined)
    
    inline def setLimitValue(value: PriceAmount): Self = StObject.set(x, "limitValue", value.asInstanceOf[js.Any])
    
    inline def setLimitValueUndefined: Self = StObject.set(x, "limitValue", js.undefined)
    
    inline def setLongTitle(value: String): Self = StObject.set(x, "longTitle", value.asInstanceOf[js.Any])
    
    inline def setLongTitleUndefined: Self = StObject.set(x, "longTitle", js.undefined)
    
    inline def setMinimumPurchaseAmount(value: PriceAmount): Self = StObject.set(x, "minimumPurchaseAmount", value.asInstanceOf[js.Any])
    
    inline def setMinimumPurchaseAmountUndefined: Self = StObject.set(x, "minimumPurchaseAmount", js.undefined)
    
    inline def setMinimumPurchaseQuantity(value: Double): Self = StObject.set(x, "minimumPurchaseQuantity", value.asInstanceOf[js.Any])
    
    inline def setMinimumPurchaseQuantityUndefined: Self = StObject.set(x, "minimumPurchaseQuantity", js.undefined)
    
    inline def setMoneyBudget(value: PriceAmount): Self = StObject.set(x, "moneyBudget", value.asInstanceOf[js.Any])
    
    inline def setMoneyBudgetUndefined: Self = StObject.set(x, "moneyBudget", js.undefined)
    
    inline def setMoneyOffAmount(value: PriceAmount): Self = StObject.set(x, "moneyOffAmount", value.asInstanceOf[js.Any])
    
    inline def setMoneyOffAmountUndefined: Self = StObject.set(x, "moneyOffAmount", js.undefined)
    
    inline def setOfferType(value: String): Self = StObject.set(x, "offerType", value.asInstanceOf[js.Any])
    
    inline def setOfferTypeUndefined: Self = StObject.set(x, "offerType", js.undefined)
    
    inline def setOrderLimit(value: Double): Self = StObject.set(x, "orderLimit", value.asInstanceOf[js.Any])
    
    inline def setOrderLimitUndefined: Self = StObject.set(x, "orderLimit", js.undefined)
    
    inline def setPercentOff(value: Double): Self = StObject.set(x, "percentOff", value.asInstanceOf[js.Any])
    
    inline def setPercentOffUndefined: Self = StObject.set(x, "percentOff", js.undefined)
    
    inline def setProductApplicability(value: String): Self = StObject.set(x, "productApplicability", value.asInstanceOf[js.Any])
    
    inline def setProductApplicabilityUndefined: Self = StObject.set(x, "productApplicability", js.undefined)
    
    inline def setProductType(value: js.Array[String]): Self = StObject.set(x, "productType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeExclusion(value: js.Array[String]): Self = StObject.set(x, "productTypeExclusion", value.asInstanceOf[js.Any])
    
    inline def setProductTypeExclusionUndefined: Self = StObject.set(x, "productTypeExclusion", js.undefined)
    
    inline def setProductTypeExclusionVarargs(value: String*): Self = StObject.set(x, "productTypeExclusion", js.Array(value*))
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "productType", js.undefined)
    
    inline def setProductTypeVarargs(value: String*): Self = StObject.set(x, "productType", js.Array(value*))
    
    inline def setPromotionDestinationIds(value: js.Array[String]): Self = StObject.set(x, "promotionDestinationIds", value.asInstanceOf[js.Any])
    
    inline def setPromotionDestinationIdsUndefined: Self = StObject.set(x, "promotionDestinationIds", js.undefined)
    
    inline def setPromotionDestinationIdsVarargs(value: String*): Self = StObject.set(x, "promotionDestinationIds", js.Array(value*))
    
    inline def setPromotionDisplayDates(value: String): Self = StObject.set(x, "promotionDisplayDates", value.asInstanceOf[js.Any])
    
    inline def setPromotionDisplayDatesUndefined: Self = StObject.set(x, "promotionDisplayDates", js.undefined)
    
    inline def setPromotionDisplayTimePeriod(value: TimePeriod): Self = StObject.set(x, "promotionDisplayTimePeriod", value.asInstanceOf[js.Any])
    
    inline def setPromotionDisplayTimePeriodUndefined: Self = StObject.set(x, "promotionDisplayTimePeriod", js.undefined)
    
    inline def setPromotionEffectiveDates(value: String): Self = StObject.set(x, "promotionEffectiveDates", value.asInstanceOf[js.Any])
    
    inline def setPromotionEffectiveDatesUndefined: Self = StObject.set(x, "promotionEffectiveDates", js.undefined)
    
    inline def setPromotionEffectiveTimePeriod(value: TimePeriod): Self = StObject.set(x, "promotionEffectiveTimePeriod", value.asInstanceOf[js.Any])
    
    inline def setPromotionEffectiveTimePeriodUndefined: Self = StObject.set(x, "promotionEffectiveTimePeriod", js.undefined)
    
    inline def setPromotionId(value: String): Self = StObject.set(x, "promotionId", value.asInstanceOf[js.Any])
    
    inline def setPromotionIdUndefined: Self = StObject.set(x, "promotionId", js.undefined)
    
    inline def setRedemptionChannel(value: js.Array[String]): Self = StObject.set(x, "redemptionChannel", value.asInstanceOf[js.Any])
    
    inline def setRedemptionChannelUndefined: Self = StObject.set(x, "redemptionChannel", js.undefined)
    
    inline def setRedemptionChannelVarargs(value: String*): Self = StObject.set(x, "redemptionChannel", js.Array(value*))
    
    inline def setShippingServiceNames(value: js.Array[String]): Self = StObject.set(x, "shippingServiceNames", value.asInstanceOf[js.Any])
    
    inline def setShippingServiceNamesUndefined: Self = StObject.set(x, "shippingServiceNames", js.undefined)
    
    inline def setShippingServiceNamesVarargs(value: String*): Self = StObject.set(x, "shippingServiceNames", js.Array(value*))
    
    inline def setTargetCountry(value: String): Self = StObject.set(x, "targetCountry", value.asInstanceOf[js.Any])
    
    inline def setTargetCountryUndefined: Self = StObject.set(x, "targetCountry", js.undefined)
  }
}
