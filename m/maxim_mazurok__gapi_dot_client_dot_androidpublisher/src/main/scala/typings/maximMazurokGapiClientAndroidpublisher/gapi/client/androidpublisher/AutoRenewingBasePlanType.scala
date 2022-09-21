package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoRenewingBasePlanType extends StObject {
  
  /** Required. Subscription period, specified in ISO 8601 format. For a list of acceptable billing periods, refer to the help center. */
  var billingPeriodDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Grace period of the subscription, specified in ISO 8601 format. Acceptable values are P0D (zero days), P3D (3 days), P7D (7 days), P14D (14 days), and P30D (30 days). If not
    * specified, a default value will be used based on the recurring period duration.
    */
  var gracePeriodDuration: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the renewing base plan is backward compatible. The backward compatible base plan is returned by the Google Play Billing Library deprecated method querySkuDetailsAsync().
    * Only one renewing base plan can be marked as legacy compatible for a given subscription.
    */
  var legacyCompatible: js.UndefOr[Boolean] = js.undefined
  
  /** The proration mode for the base plan determines what happens when a user switches to this plan from another base plan. If unspecified, defaults to CHARGE_ON_NEXT_BILLING_DATE. */
  var prorationMode: js.UndefOr[String] = js.undefined
  
  /** Whether users should be able to resubscribe to this base plan in Google Play surfaces. Defaults to RESUBSCRIBE_STATE_ACTIVE if not specified. */
  var resubscribeState: js.UndefOr[String] = js.undefined
}
object AutoRenewingBasePlanType {
  
  inline def apply(): AutoRenewingBasePlanType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoRenewingBasePlanType]
  }
  
  extension [Self <: AutoRenewingBasePlanType](x: Self) {
    
    inline def setBillingPeriodDuration(value: String): Self = StObject.set(x, "billingPeriodDuration", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodDurationUndefined: Self = StObject.set(x, "billingPeriodDuration", js.undefined)
    
    inline def setGracePeriodDuration(value: String): Self = StObject.set(x, "gracePeriodDuration", value.asInstanceOf[js.Any])
    
    inline def setGracePeriodDurationUndefined: Self = StObject.set(x, "gracePeriodDuration", js.undefined)
    
    inline def setLegacyCompatible(value: Boolean): Self = StObject.set(x, "legacyCompatible", value.asInstanceOf[js.Any])
    
    inline def setLegacyCompatibleUndefined: Self = StObject.set(x, "legacyCompatible", js.undefined)
    
    inline def setProrationMode(value: String): Self = StObject.set(x, "prorationMode", value.asInstanceOf[js.Any])
    
    inline def setProrationModeUndefined: Self = StObject.set(x, "prorationMode", js.undefined)
    
    inline def setResubscribeState(value: String): Self = StObject.set(x, "resubscribeState", value.asInstanceOf[js.Any])
    
    inline def setResubscribeStateUndefined: Self = StObject.set(x, "resubscribeState", js.undefined)
  }
}
