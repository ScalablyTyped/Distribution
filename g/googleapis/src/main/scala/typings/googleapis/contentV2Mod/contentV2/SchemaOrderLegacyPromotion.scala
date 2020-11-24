package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaOrderLegacyPromotion extends js.Object {
  
  var benefits: js.UndefOr[js.Array[SchemaOrderLegacyPromotionBenefit]] = js.native
  
  /**
    * The date and time frame when the promotion is active and ready for
    * validation review. Note that the promotion live time may be delayed for a
    * few hours due to the validation review. Start date and end date are
    * separated by a forward slash (/). The start date is specified by the
    * format (YYYY-MM-DD), followed by the letter ?T?, the time of the day when
    * the sale starts (in Greenwich Mean Time, GMT), followed by an expression
    * of the time zone for the sale. The end date is in the same format.
    */
  var effectiveDates: js.UndefOr[String] = js.native
  
  /**
    * Optional. The text code that corresponds to the promotion when applied on
    * the retailer?s website.
    */
  var genericRedemptionCode: js.UndefOr[String] = js.native
  
  /**
    * The unique ID of the promotion.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * The full title of the promotion.
    */
  var longTitle: js.UndefOr[String] = js.native
  
  /**
    * Whether the promotion is applicable to all products or only specific
    * products.
    */
  var productApplicability: js.UndefOr[String] = js.native
  
  /**
    * Indicates that the promotion is valid online.
    */
  var redemptionChannel: js.UndefOr[String] = js.native
}
object SchemaOrderLegacyPromotion {
  
  @scala.inline
  def apply(): SchemaOrderLegacyPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLegacyPromotion]
  }
  
  @scala.inline
  implicit class SchemaOrderLegacyPromotionOps[Self <: SchemaOrderLegacyPromotion] (val x: Self) extends AnyVal {
    
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
    def setBenefitsVarargs(value: SchemaOrderLegacyPromotionBenefit*): Self = this.set("benefits", js.Array(value :_*))
    
    @scala.inline
    def setBenefits(value: js.Array[SchemaOrderLegacyPromotionBenefit]): Self = this.set("benefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBenefits: Self = this.set("benefits", js.undefined)
    
    @scala.inline
    def setEffectiveDates(value: String): Self = this.set("effectiveDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEffectiveDates: Self = this.set("effectiveDates", js.undefined)
    
    @scala.inline
    def setGenericRedemptionCode(value: String): Self = this.set("genericRedemptionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenericRedemptionCode: Self = this.set("genericRedemptionCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLongTitle(value: String): Self = this.set("longTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLongTitle: Self = this.set("longTitle", js.undefined)
    
    @scala.inline
    def setProductApplicability(value: String): Self = this.set("productApplicability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductApplicability: Self = this.set("productApplicability", js.undefined)
    
    @scala.inline
    def setRedemptionChannel(value: String): Self = this.set("redemptionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedemptionChannel: Self = this.set("redemptionChannel", js.undefined)
  }
}
