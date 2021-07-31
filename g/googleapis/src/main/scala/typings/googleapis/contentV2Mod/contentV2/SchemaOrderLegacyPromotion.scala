package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLegacyPromotion extends StObject {
  
  var benefits: js.UndefOr[js.Array[SchemaOrderLegacyPromotionBenefit]] = js.undefined
  
  /**
    * The date and time frame when the promotion is active and ready for
    * validation review. Note that the promotion live time may be delayed for a
    * few hours due to the validation review. Start date and end date are
    * separated by a forward slash (/). The start date is specified by the
    * format (YYYY-MM-DD), followed by the letter ?T?, the time of the day when
    * the sale starts (in Greenwich Mean Time, GMT), followed by an expression
    * of the time zone for the sale. The end date is in the same format.
    */
  var effectiveDates: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The text code that corresponds to the promotion when applied on
    * the retailer?s website.
    */
  var genericRedemptionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The unique ID of the promotion.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The full title of the promotion.
    */
  var longTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the promotion is applicable to all products or only specific
    * products.
    */
  var productApplicability: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the promotion is valid online.
    */
  var redemptionChannel: js.UndefOr[String] = js.undefined
}
object SchemaOrderLegacyPromotion {
  
  @scala.inline
  def apply(): SchemaOrderLegacyPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLegacyPromotion]
  }
  
  @scala.inline
  implicit class SchemaOrderLegacyPromotionMutableBuilder[Self <: SchemaOrderLegacyPromotion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBenefits(value: js.Array[SchemaOrderLegacyPromotionBenefit]): Self = StObject.set(x, "benefits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBenefitsUndefined: Self = StObject.set(x, "benefits", js.undefined)
    
    @scala.inline
    def setBenefitsVarargs(value: SchemaOrderLegacyPromotionBenefit*): Self = StObject.set(x, "benefits", js.Array(value :_*))
    
    @scala.inline
    def setEffectiveDates(value: String): Self = StObject.set(x, "effectiveDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDatesUndefined: Self = StObject.set(x, "effectiveDates", js.undefined)
    
    @scala.inline
    def setGenericRedemptionCode(value: String): Self = StObject.set(x, "genericRedemptionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericRedemptionCodeUndefined: Self = StObject.set(x, "genericRedemptionCode", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLongTitle(value: String): Self = StObject.set(x, "longTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongTitleUndefined: Self = StObject.set(x, "longTitle", js.undefined)
    
    @scala.inline
    def setProductApplicability(value: String): Self = StObject.set(x, "productApplicability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductApplicabilityUndefined: Self = StObject.set(x, "productApplicability", js.undefined)
    
    @scala.inline
    def setRedemptionChannel(value: String): Self = StObject.set(x, "redemptionChannel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedemptionChannelUndefined: Self = StObject.set(x, "redemptionChannel", js.undefined)
  }
}
