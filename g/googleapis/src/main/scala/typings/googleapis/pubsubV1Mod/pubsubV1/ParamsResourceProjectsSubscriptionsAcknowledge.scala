package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSubscriptionsAcknowledge
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAcknowledgeRequest] = js.undefined
  
  /**
    * Required. The subscription whose message is being acknowledged. Format is `projects/{project\}/subscriptions/{sub\}`.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSubscriptionsAcknowledge {
  
  inline def apply(): ParamsResourceProjectsSubscriptionsAcknowledge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSubscriptionsAcknowledge]
  }
  
  extension [Self <: ParamsResourceProjectsSubscriptionsAcknowledge](x: Self) {
    
    inline def setRequestBody(value: SchemaAcknowledgeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
