package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersSubscriptionsProvision
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource name, which is the identifier of the partner. It will have the format of "partners/{partner_id\}".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription] = js.undefined
  
  /**
    * Required. Identifies the subscription resource on the Partner side. The value is restricted to 63 ASCII characters at the maximum. If a subscription was previously created with the same subscription_id, we will directly return that one.
    */
  var subscriptionId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePartnersSubscriptionsProvision {
  
  inline def apply(): ParamsResourcePartnersSubscriptionsProvision = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersSubscriptionsProvision]
  }
  
  extension [Self <: ParamsResourcePartnersSubscriptionsProvision](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1Subscription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
  }
}
