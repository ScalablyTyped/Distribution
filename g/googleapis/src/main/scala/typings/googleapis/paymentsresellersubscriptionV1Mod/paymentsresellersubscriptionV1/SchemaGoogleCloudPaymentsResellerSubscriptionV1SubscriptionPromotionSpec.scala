package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec extends StObject {
  
  /**
    * Output only. The duration of the free trial if the promotion is of type FREE_TRIAL.
    */
  var freeTrialDuration: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration] = js.undefined
  
  /**
    * Output only. The details of the introductory pricing spec if the promotion is of type INTRODUCTORY_PRICING.
    */
  var introductoryPricingDetails: js.UndefOr[
    SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails
  ] = js.undefined
  
  /**
    * Required. Promotion resource name that identifies a promotion. The format is 'partners/{partner_id\}/promotions/{promotion_id\}'.
    */
  var promotion: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The type of the promotion for the spec.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionPromotionSpec](x: Self) {
    
    inline def setFreeTrialDuration(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Duration): Self = StObject.set(x, "freeTrialDuration", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialDurationUndefined: Self = StObject.set(x, "freeTrialDuration", js.undefined)
    
    inline def setIntroductoryPricingDetails(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails): Self = StObject.set(x, "introductoryPricingDetails", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPricingDetailsUndefined: Self = StObject.set(x, "introductoryPricingDetails", js.undefined)
    
    inline def setPromotion(value: String): Self = StObject.set(x, "promotion", value.asInstanceOf[js.Any])
    
    inline def setPromotionNull: Self = StObject.set(x, "promotion", null)
    
    inline def setPromotionUndefined: Self = StObject.set(x, "promotion", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
