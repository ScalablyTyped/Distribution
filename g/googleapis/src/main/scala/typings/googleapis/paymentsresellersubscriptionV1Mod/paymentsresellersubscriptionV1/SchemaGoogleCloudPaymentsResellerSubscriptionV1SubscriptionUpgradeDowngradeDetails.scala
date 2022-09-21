package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails extends StObject {
  
  /**
    * Required. Specifies the billing cycle spec for the new upgraded/downgraded subscription.
    */
  var billingCycleSpec: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The previous subscription id to be replaced. This is not the full resource name, use the subscription_id segment only.
    */
  var previousSubscriptionId: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionUpgradeDowngradeDetails](x: Self) {
    
    inline def setBillingCycleSpec(value: String): Self = StObject.set(x, "billingCycleSpec", value.asInstanceOf[js.Any])
    
    inline def setBillingCycleSpecNull: Self = StObject.set(x, "billingCycleSpec", null)
    
    inline def setBillingCycleSpecUndefined: Self = StObject.set(x, "billingCycleSpec", js.undefined)
    
    inline def setPreviousSubscriptionId(value: String): Self = StObject.set(x, "previousSubscriptionId", value.asInstanceOf[js.Any])
    
    inline def setPreviousSubscriptionIdNull: Self = StObject.set(x, "previousSubscriptionId", null)
    
    inline def setPreviousSubscriptionIdUndefined: Self = StObject.set(x, "previousSubscriptionId", js.undefined)
  }
}
