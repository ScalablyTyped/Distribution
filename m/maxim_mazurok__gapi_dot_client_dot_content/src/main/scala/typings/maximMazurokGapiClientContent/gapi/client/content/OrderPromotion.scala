package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderPromotion extends StObject {
  
  /**
    * Items that this promotion may be applied to. If empty, there are no restrictions on applicable items and quantity. This field will also be empty for shipping promotions because
    * shipping is not tied to any specific item.
    */
  var applicableItems: js.UndefOr[js.Array[OrderPromotionItem]] = js.undefined
  
  /**
    * Items that this promotion have been applied to. Do not provide for `orders.createtestorder`. This field will be empty for shipping promotions because shipping is not tied to any
    * specific item.
    */
  var appliedItems: js.UndefOr[js.Array[OrderPromotionItem]] = js.undefined
  
  /** Promotion end time in ISO 8601 format. Date, time, and offset required, e.g., "2020-01-02T09:00:00+01:00" or "2020-01-02T09:00:00Z". */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Required. The party funding the promotion. Only `merchant` is supported for `orders.createtestorder`. Acceptable values are: - "`google`" - "`merchant`" */
  var funder: js.UndefOr[String] = js.undefined
  
  /** Required. This field is used to identify promotions within merchants' own systems. */
  var merchantPromotionId: js.UndefOr[String] = js.undefined
  
  /** Estimated discount applied to price. Amount is pre-tax or post-tax depending on location of order. */
  var priceValue: js.UndefOr[Price] = js.undefined
  
  /** A short title of the promotion to be shown on the checkout page. Do not provide for `orders.createtestorder`. */
  var shortTitle: js.UndefOr[String] = js.undefined
  
  /** Promotion start time in ISO 8601 format. Date, time, and offset required, e.g., "2020-01-02T09:00:00+01:00" or "2020-01-02T09:00:00Z". */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The category of the promotion. Only `moneyOff` is supported for `orders.createtestorder`. Acceptable values are: - "`buyMGetMoneyOff`" - "`buyMGetNMoneyOff`" -
    * "`buyMGetNPercentOff`" - "`buyMGetPercentOff`" - "`freeGift`" - "`freeGiftWithItemId`" - "`freeGiftWithValue`" - "`freeShippingOvernight`" - "`freeShippingStandard`" -
    * "`freeShippingTwoDay`" - "`moneyOff`" - "`percentOff`" - "`rewardPoints`" - "`salePrice`"
    */
  var subtype: js.UndefOr[String] = js.undefined
  
  /** Estimated discount applied to tax (if allowed by law). Do not provide for `orders.createtestorder`. */
  var taxValue: js.UndefOr[Price] = js.undefined
  
  /** Required. The title of the promotion. */
  var title: js.UndefOr[String] = js.undefined
  
  /** Required. The scope of the promotion. Only `product` is supported for `orders.createtestorder`. Acceptable values are: - "`product`" - "`shipping`" */
  var `type`: js.UndefOr[String] = js.undefined
}
object OrderPromotion {
  
  inline def apply(): OrderPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotion]
  }
  
  extension [Self <: OrderPromotion](x: Self) {
    
    inline def setApplicableItems(value: js.Array[OrderPromotionItem]): Self = StObject.set(x, "applicableItems", value.asInstanceOf[js.Any])
    
    inline def setApplicableItemsUndefined: Self = StObject.set(x, "applicableItems", js.undefined)
    
    inline def setApplicableItemsVarargs(value: OrderPromotionItem*): Self = StObject.set(x, "applicableItems", js.Array(value :_*))
    
    inline def setAppliedItems(value: js.Array[OrderPromotionItem]): Self = StObject.set(x, "appliedItems", value.asInstanceOf[js.Any])
    
    inline def setAppliedItemsUndefined: Self = StObject.set(x, "appliedItems", js.undefined)
    
    inline def setAppliedItemsVarargs(value: OrderPromotionItem*): Self = StObject.set(x, "appliedItems", js.Array(value :_*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFunder(value: String): Self = StObject.set(x, "funder", value.asInstanceOf[js.Any])
    
    inline def setFunderUndefined: Self = StObject.set(x, "funder", js.undefined)
    
    inline def setMerchantPromotionId(value: String): Self = StObject.set(x, "merchantPromotionId", value.asInstanceOf[js.Any])
    
    inline def setMerchantPromotionIdUndefined: Self = StObject.set(x, "merchantPromotionId", js.undefined)
    
    inline def setPriceValue(value: Price): Self = StObject.set(x, "priceValue", value.asInstanceOf[js.Any])
    
    inline def setPriceValueUndefined: Self = StObject.set(x, "priceValue", js.undefined)
    
    inline def setShortTitle(value: String): Self = StObject.set(x, "shortTitle", value.asInstanceOf[js.Any])
    
    inline def setShortTitleUndefined: Self = StObject.set(x, "shortTitle", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    inline def setTaxValue(value: Price): Self = StObject.set(x, "taxValue", value.asInstanceOf[js.Any])
    
    inline def setTaxValueUndefined: Self = StObject.set(x, "taxValue", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
