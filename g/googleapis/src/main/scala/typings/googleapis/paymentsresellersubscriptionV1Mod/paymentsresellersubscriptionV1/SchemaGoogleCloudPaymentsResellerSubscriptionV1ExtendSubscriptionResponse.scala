package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse extends StObject {
  
  /**
    * The time at which the subscription is expected to be extended, in ISO 8061 format. UTC timezone. Example, "cycleEndTime":"2019-08-31T17:28:54.564Z"
    */
  var cycleEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End of the free trial period, in ISO 8061 format. UTC timezone. Example, "freeTrialEndTime":"2019-08-31T17:28:54.564Z" This time will be set the same as initial subscription creation time if no free trial period is offered to the partner.
    */
  var freeTrialEndTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time at which the subscription is expected to be renewed by Google - a new charge will be incurred and the service entitlement will be renewed. A non-immediate cancellation will take place at this time too, before which, the service entitlement for the end user will remain valid. UTC timezone in ISO 8061 format. For example: "2019-08-31T17:28:54.564Z"
    */
  var renewalTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse {
  
  inline def apply(): SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse]
  }
  
  extension [Self <: SchemaGoogleCloudPaymentsResellerSubscriptionV1ExtendSubscriptionResponse](x: Self) {
    
    inline def setCycleEndTime(value: String): Self = StObject.set(x, "cycleEndTime", value.asInstanceOf[js.Any])
    
    inline def setCycleEndTimeNull: Self = StObject.set(x, "cycleEndTime", null)
    
    inline def setCycleEndTimeUndefined: Self = StObject.set(x, "cycleEndTime", js.undefined)
    
    inline def setFreeTrialEndTime(value: String): Self = StObject.set(x, "freeTrialEndTime", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialEndTimeNull: Self = StObject.set(x, "freeTrialEndTime", null)
    
    inline def setFreeTrialEndTimeUndefined: Self = StObject.set(x, "freeTrialEndTime", js.undefined)
    
    inline def setRenewalTime(value: String): Self = StObject.set(x, "renewalTime", value.asInstanceOf[js.Any])
    
    inline def setRenewalTimeNull: Self = StObject.set(x, "renewalTime", null)
    
    inline def setRenewalTimeUndefined: Self = StObject.set(x, "renewalTime", js.undefined)
  }
}
