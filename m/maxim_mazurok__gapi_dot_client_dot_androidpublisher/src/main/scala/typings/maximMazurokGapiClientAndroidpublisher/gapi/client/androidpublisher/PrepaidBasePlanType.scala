package typings.maximMazurokGapiClientAndroidpublisher.gapi.client.androidpublisher

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrepaidBasePlanType extends StObject {
  
  /** Required. Subscription period, specified in ISO 8601 format. For a list of acceptable billing periods, refer to the help center. */
  var billingPeriodDuration: js.UndefOr[String] = js.undefined
  
  /** Whether users should be able to extend this prepaid base plan in Google Play surfaces. Defaults to TIME_EXTENSION_ACTIVE if not specified. */
  var timeExtension: js.UndefOr[String] = js.undefined
}
object PrepaidBasePlanType {
  
  inline def apply(): PrepaidBasePlanType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrepaidBasePlanType]
  }
  
  extension [Self <: PrepaidBasePlanType](x: Self) {
    
    inline def setBillingPeriodDuration(value: String): Self = StObject.set(x, "billingPeriodDuration", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodDurationUndefined: Self = StObject.set(x, "billingPeriodDuration", js.undefined)
    
    inline def setTimeExtension(value: String): Self = StObject.set(x, "timeExtension", value.asInstanceOf[js.Any])
    
    inline def setTimeExtensionUndefined: Self = StObject.set(x, "timeExtension", js.undefined)
  }
}
