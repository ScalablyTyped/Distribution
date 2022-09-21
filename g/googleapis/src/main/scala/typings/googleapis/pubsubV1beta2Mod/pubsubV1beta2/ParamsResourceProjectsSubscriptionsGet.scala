package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSubscriptionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the subscription to get.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSubscriptionsGet {
  
  inline def apply(): ParamsResourceProjectsSubscriptionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSubscriptionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsSubscriptionsGet](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
