package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOrderLegacyPromotion extends StObject {
  
  var benefits: js.UndefOr[js.Array[SchemaOrderLegacyPromotionBenefit]] = js.undefined
  
  /**
    * The date and time frame when the promotion is active and ready for validation review. Note that the promotion live time may be delayed for a few hours due to the validation review. Start date and end date are separated by a forward slash (/). The start date is specified by the format (YYYY-MM-DD), followed by the letter ?T?, the time of the day when the sale starts (in Greenwich Mean Time, GMT), followed by an expression of the time zone for the sale. The end date is in the same format.
    */
  var effectiveDates: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. The text code that corresponds to the promotion when applied on the retailer?s website.
    */
  var genericRedemptionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique ID of the promotion.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The full title of the promotion.
    */
  var longTitle: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether the promotion is applicable to all products or only specific products. Acceptable values are: - "`allProducts`" - "`specificProducts`"
    */
  var productApplicability: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates that the promotion is valid online. Acceptable values are: - "`online`"
    */
  var redemptionChannel: js.UndefOr[String | Null] = js.undefined
}
object SchemaOrderLegacyPromotion {
  
  inline def apply(): SchemaOrderLegacyPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLegacyPromotion]
  }
  
  extension [Self <: SchemaOrderLegacyPromotion](x: Self) {
    
    inline def setBenefits(value: js.Array[SchemaOrderLegacyPromotionBenefit]): Self = StObject.set(x, "benefits", value.asInstanceOf[js.Any])
    
    inline def setBenefitsUndefined: Self = StObject.set(x, "benefits", js.undefined)
    
    inline def setBenefitsVarargs(value: SchemaOrderLegacyPromotionBenefit*): Self = StObject.set(x, "benefits", js.Array(value*))
    
    inline def setEffectiveDates(value: String): Self = StObject.set(x, "effectiveDates", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDatesNull: Self = StObject.set(x, "effectiveDates", null)
    
    inline def setEffectiveDatesUndefined: Self = StObject.set(x, "effectiveDates", js.undefined)
    
    inline def setGenericRedemptionCode(value: String): Self = StObject.set(x, "genericRedemptionCode", value.asInstanceOf[js.Any])
    
    inline def setGenericRedemptionCodeNull: Self = StObject.set(x, "genericRedemptionCode", null)
    
    inline def setGenericRedemptionCodeUndefined: Self = StObject.set(x, "genericRedemptionCode", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLongTitle(value: String): Self = StObject.set(x, "longTitle", value.asInstanceOf[js.Any])
    
    inline def setLongTitleNull: Self = StObject.set(x, "longTitle", null)
    
    inline def setLongTitleUndefined: Self = StObject.set(x, "longTitle", js.undefined)
    
    inline def setProductApplicability(value: String): Self = StObject.set(x, "productApplicability", value.asInstanceOf[js.Any])
    
    inline def setProductApplicabilityNull: Self = StObject.set(x, "productApplicability", null)
    
    inline def setProductApplicabilityUndefined: Self = StObject.set(x, "productApplicability", js.undefined)
    
    inline def setRedemptionChannel(value: String): Self = StObject.set(x, "redemptionChannel", value.asInstanceOf[js.Any])
    
    inline def setRedemptionChannelNull: Self = StObject.set(x, "redemptionChannel", null)
    
    inline def setRedemptionChannelUndefined: Self = StObject.set(x, "redemptionChannel", js.undefined)
  }
}
