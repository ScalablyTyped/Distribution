package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion extends StObject {
  
  /**
    * Output only. The product ids this promotion can be applied to.
    */
  var applicableProducts: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Specifies the end time (exclusive) of the period that the promotion is available in. If unset, the promotion is available indefinitely.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Specifies the duration of the free trial of the subscription when promotion_type is PROMOTION_TYPE_FREE_TRIAL
    */
  var freeTrialDuration: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration] = js.undefined
  
  /**
    * Optional. Specifies the introductory pricing details when the promotion_type is PROMOTION_TYPE_INTRODUCTORY_PRICING.
    */
  var introductoryPricingDetails: js.UndefOr[
    SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails
  ] = js.undefined
  
  /**
    * Output only. Response only. Resource name of the subscription promotion. It will have the format of "partners/{partner_id\}/promotion/{promotion_id\}"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Output Only. Specifies the type of the promotion.
    */
  var promotionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. 2-letter ISO region code where the promotion is available in. Ex. "US" Please refers to: https://en.wikipedia.org/wiki/ISO_3166-1
    */
  var regionCodes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Specifies the start time (inclusive) of the period that the promotion is available in.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Localized human readable name of the promotion.
    */
  var titles: js.UndefOr[js.Array[SchemaGoogleTypeLocalizedText]] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1Promotion](x: Self) {
    
    inline def setApplicableProducts(value: js.Array[String]): Self = StObject.set(x, "applicableProducts", value.asInstanceOf[js.Any])
    
    inline def setApplicableProductsNull: Self = StObject.set(x, "applicableProducts", null)
    
    inline def setApplicableProductsUndefined: Self = StObject.set(x, "applicableProducts", js.undefined)
    
    inline def setApplicableProductsVarargs(value: String*): Self = StObject.set(x, "applicableProducts", js.Array(value*))
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFreeTrialDuration(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration): Self = StObject.set(x, "freeTrialDuration", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialDurationUndefined: Self = StObject.set(x, "freeTrialDuration", js.undefined)
    
    inline def setIntroductoryPricingDetails(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails): Self = StObject.set(x, "introductoryPricingDetails", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPricingDetailsUndefined: Self = StObject.set(x, "introductoryPricingDetails", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPromotionType(value: String): Self = StObject.set(x, "promotionType", value.asInstanceOf[js.Any])
    
    inline def setPromotionTypeNull: Self = StObject.set(x, "promotionType", null)
    
    inline def setPromotionTypeUndefined: Self = StObject.set(x, "promotionType", js.undefined)
    
    inline def setRegionCodes(value: js.Array[String]): Self = StObject.set(x, "regionCodes", value.asInstanceOf[js.Any])
    
    inline def setRegionCodesNull: Self = StObject.set(x, "regionCodes", null)
    
    inline def setRegionCodesUndefined: Self = StObject.set(x, "regionCodes", js.undefined)
    
    inline def setRegionCodesVarargs(value: String*): Self = StObject.set(x, "regionCodes", js.Array(value*))
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTitles(value: js.Array[SchemaGoogleTypeLocalizedText]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    
    inline def setTitlesVarargs(value: SchemaGoogleTypeLocalizedText*): Self = StObject.set(x, "titles", js.Array(value*))
  }
}
