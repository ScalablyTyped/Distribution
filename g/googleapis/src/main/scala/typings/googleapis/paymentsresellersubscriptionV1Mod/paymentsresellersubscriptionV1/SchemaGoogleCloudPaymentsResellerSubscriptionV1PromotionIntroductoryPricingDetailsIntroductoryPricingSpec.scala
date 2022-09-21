package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec extends StObject {
  
  /**
    * Output only. Output Only. The duration of an introductory offer in billing cycles.
    */
  var recurrenceCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1PromotionIntroductoryPricingDetailsIntroductoryPricingSpec](x: Self) {
    
    inline def setRecurrenceCount(value: Double): Self = StObject.set(x, "recurrenceCount", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceCountNull: Self = StObject.set(x, "recurrenceCount", null)
    
    inline def setRecurrenceCountUndefined: Self = StObject.set(x, "recurrenceCount", js.undefined)
  }
}
