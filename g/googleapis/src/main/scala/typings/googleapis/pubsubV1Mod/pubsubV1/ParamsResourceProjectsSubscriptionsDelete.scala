package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSubscriptionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The subscription to delete. Format is `projects/{project\}/subscriptions/{sub\}`.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSubscriptionsDelete {
  
  inline def apply(): ParamsResourceProjectsSubscriptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSubscriptionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsSubscriptionsDelete](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
