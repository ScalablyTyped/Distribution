package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSubscriptionsModifyackdeadline
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaModifyAckDeadlineRequest] = js.undefined
  
  /**
    * The name of the subscription.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSubscriptionsModifyackdeadline {
  
  inline def apply(): ParamsResourceProjectsSubscriptionsModifyackdeadline = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSubscriptionsModifyackdeadline]
  }
  
  extension [Self <: ParamsResourceProjectsSubscriptionsModifyackdeadline](x: Self) {
    
    inline def setRequestBody(value: SchemaModifyAckDeadlineRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
