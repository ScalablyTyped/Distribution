package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails extends StObject {
  
  /**
    * Specifies the introductory pricing periods.
    */
  var introductoryPricingSpecs: js.UndefOr[
    js.Array[
      SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec
    ]
  ] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetails](x: Self) {
    
    inline def setIntroductoryPricingSpecs(
      value: js.Array[
          SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec
        ]
    ): Self = StObject.set(x, "introductoryPricingSpecs", value.asInstanceOf[js.Any])
    
    inline def setIntroductoryPricingSpecsUndefined: Self = StObject.set(x, "introductoryPricingSpecs", js.undefined)
    
    inline def setIntroductoryPricingSpecsVarargs(
      value: SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec*
    ): Self = StObject.set(x, "introductoryPricingSpecs", js.Array(value*))
  }
}
