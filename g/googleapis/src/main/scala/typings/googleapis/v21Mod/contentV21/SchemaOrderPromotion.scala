package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderPromotion extends js.Object {
  
  /**
    * Items which this promotion may be applied to. If empty, there are no
    * restrictions on applicable items and quantity.
    */
  var applicableItems: js.UndefOr[js.Array[SchemaOrderPromotionItem]] = js.native
  
  /**
    * Items which this promotion have been applied to.
    */
  var appliedItems: js.UndefOr[js.Array[SchemaOrderPromotionItem]] = js.native
  
  /**
    * The party funding the promotion.
    */
  var funder: js.UndefOr[String] = js.native
  
  /**
    * This field is used to identify promotions within merchants&#39; own
    * systems.
    */
  var merchantPromotionId: js.UndefOr[String] = js.native
  
  /**
    * Estimated discount applied to price. Amount is pre-tax or post-tax
    * depending on location of order.
    */
  var priceValue: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * A short title of the promotion to be shown on the checkout page.
    */
  var shortTitle: js.UndefOr[String] = js.native
  
  /**
    * The category of the promotion.
    */
  var subtype: js.UndefOr[String] = js.native
  
  /**
    * Estimated discount applied to tax (if allowed by law).
    */
  var taxValue: js.UndefOr[SchemaPrice] = js.native
  
  /**
    * The title of the promotion.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The scope of the promotion.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaOrderPromotion {
  
  @scala.inline
  def apply(): SchemaOrderPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPromotion]
  }
  
  @scala.inline
  implicit class SchemaOrderPromotionOps[Self <: SchemaOrderPromotion] (val x: Self) extends AnyVal {
    
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
    def setApplicableItemsVarargs(value: SchemaOrderPromotionItem*): Self = this.set("applicableItems", js.Array(value :_*))
    
    @scala.inline
    def setApplicableItems(value: js.Array[SchemaOrderPromotionItem]): Self = this.set("applicableItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicableItems: Self = this.set("applicableItems", js.undefined)
    
    @scala.inline
    def setAppliedItemsVarargs(value: SchemaOrderPromotionItem*): Self = this.set("appliedItems", js.Array(value :_*))
    
    @scala.inline
    def setAppliedItems(value: js.Array[SchemaOrderPromotionItem]): Self = this.set("appliedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppliedItems: Self = this.set("appliedItems", js.undefined)
    
    @scala.inline
    def setFunder(value: String): Self = this.set("funder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunder: Self = this.set("funder", js.undefined)
    
    @scala.inline
    def setMerchantPromotionId(value: String): Self = this.set("merchantPromotionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMerchantPromotionId: Self = this.set("merchantPromotionId", js.undefined)
    
    @scala.inline
    def setPriceValue(value: SchemaPrice): Self = this.set("priceValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriceValue: Self = this.set("priceValue", js.undefined)
    
    @scala.inline
    def setShortTitle(value: String): Self = this.set("shortTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortTitle: Self = this.set("shortTitle", js.undefined)
    
    @scala.inline
    def setSubtype(value: String): Self = this.set("subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    
    @scala.inline
    def setTaxValue(value: SchemaPrice): Self = this.set("taxValue", value.asInstanceOf[js.Any])
    
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
