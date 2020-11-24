package typings.maximMazurokGapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrderPromotion extends js.Object {
  
  /**
    * Items that this promotion may be applied to. If empty, there are no restrictions on applicable items and quantity. This field will also be empty for shipping promotions because
    * shipping is not tied to any specific item.
    */
  var applicableItems: js.UndefOr[js.Array[OrderPromotionItem]] = js.native
  
  /**
    * Items that this promotion have been applied to. Do not provide for `orders.createtestorder`. This field will be empty for shipping promotions because shipping is not tied to any
    * specific item.
    */
  var appliedItems: js.UndefOr[js.Array[OrderPromotionItem]] = js.native
  
  /** Promotion end time in ISO 8601 format. Date, time, and offset required, e.g., "2020-01-02T09:00:00+01:00" or "2020-01-02T09:00:00Z". */
  var endTime: js.UndefOr[String] = js.native
  
  /** Required. The party funding the promotion. Only `merchant` is supported for `orders.createtestorder`. Acceptable values are: - "`google`" - "`merchant`" */
  var funder: js.UndefOr[String] = js.native
  
  /** Required. This field is used to identify promotions within merchants' own systems. */
  var merchantPromotionId: js.UndefOr[String] = js.native
  
  /** Estimated discount applied to price. Amount is pre-tax or post-tax depending on location of order. */
  var priceValue: js.UndefOr[Price] = js.native
  
  /** A short title of the promotion to be shown on the checkout page. Do not provide for `orders.createtestorder`. */
  var shortTitle: js.UndefOr[String] = js.native
  
  /** Promotion start time in ISO 8601 format. Date, time, and offset required, e.g., "2020-01-02T09:00:00+01:00" or "2020-01-02T09:00:00Z". */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Required. The category of the promotion. Only `moneyOff` is supported for `orders.createtestorder`. Acceptable values are: - "`buyMGetMoneyOff`" - "`buyMGetNMoneyOff`" -
    * "`buyMGetNPercentOff`" - "`buyMGetPercentOff`" - "`freeGift`" - "`freeGiftWithItemId`" - "`freeGiftWithValue`" - "`freeShippingOvernight`" - "`freeShippingStandard`" -
    * "`freeShippingTwoDay`" - "`moneyOff`" - "`percentOff`" - "`rewardPoints`" - "`salePrice`"
    */
  var subtype: js.UndefOr[String] = js.native
  
  /** Estimated discount applied to tax (if allowed by law). Do not provide for `orders.createtestorder`. */
  var taxValue: js.UndefOr[Price] = js.native
  
  /** Required. The title of the promotion. */
  var title: js.UndefOr[String] = js.native
  
  /** Required. The scope of the promotion. Only `product` is supported for `orders.createtestorder`. Acceptable values are: - "`product`" - "`shipping`" */
  var `type`: js.UndefOr[String] = js.native
}
object OrderPromotion {
  
  @scala.inline
  def apply(): OrderPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotion]
  }
  
  @scala.inline
  implicit class OrderPromotionOps[Self <: OrderPromotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicableItemsVarargs(value: OrderPromotionItem*): Self = this.set("applicableItems", js.Array(value :_*))
    
    @scala.inline
    def setApplicableItems(value: js.Array[OrderPromotionItem]): Self = this.set("applicableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableItems: Self = this.set("applicableItems", js.undefined)
    
    @scala.inline
    def setAppliedItemsVarargs(value: OrderPromotionItem*): Self = this.set("appliedItems", js.Array(value :_*))
    
    @scala.inline
    def setAppliedItems(value: js.Array[OrderPromotionItem]): Self = this.set("appliedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedItems: Self = this.set("appliedItems", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setFunder(value: String): Self = this.set("funder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunder: Self = this.set("funder", js.undefined)
    
    @scala.inline
    def setMerchantPromotionId(value: String): Self = this.set("merchantPromotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantPromotionId: Self = this.set("merchantPromotionId", js.undefined)
    
    @scala.inline
    def setPriceValue(value: Price): Self = this.set("priceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceValue: Self = this.set("priceValue", js.undefined)
    
    @scala.inline
    def setShortTitle(value: String): Self = this.set("shortTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortTitle: Self = this.set("shortTitle", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    
    @scala.inline
    def setTaxValue(value: Price): Self = this.set("taxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaxValue: Self = this.set("taxValue", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
