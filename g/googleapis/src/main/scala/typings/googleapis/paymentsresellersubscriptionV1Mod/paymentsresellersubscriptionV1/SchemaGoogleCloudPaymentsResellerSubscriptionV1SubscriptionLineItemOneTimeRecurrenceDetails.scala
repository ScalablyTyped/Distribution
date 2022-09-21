package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails extends StObject {
  
  /**
    * The service period of the ONE_TIME line item.
    */
  var servicePeriod: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1ServicePeriod] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1SubscriptionLineItemOneTimeRecurrenceDetails](x: Self) {
    
    inline def setServicePeriod(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1ServicePeriod): Self = StObject.set(x, "servicePeriod", value.asInstanceOf[js.Any])
    
    inline def setServicePeriodUndefined: Self = StObject.set(x, "servicePeriod", js.undefined)
  }
}
