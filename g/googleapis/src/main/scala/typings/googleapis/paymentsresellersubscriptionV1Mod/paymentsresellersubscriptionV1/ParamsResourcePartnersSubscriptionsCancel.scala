package typings.googleapis.paymentsresellersubscriptionV1Mod.paymentsresellersubscriptionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePartnersSubscriptionsCancel
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the subscription resource to be cancelled. It will have the format of "partners/{partner_id\}/subscriptions/{subscription_id\}"
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest] = js.undefined
}
object ParamsResourcePartnersSubscriptionsCancel {
  
  inline def apply(): ParamsResourcePartnersSubscriptionsCancel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePartnersSubscriptionsCancel]
  }
  
  extension [Self <: ParamsResourcePartnersSubscriptionsCancel](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleCloudPaymentsResellerSubscriptionV1CancelSubscriptionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
