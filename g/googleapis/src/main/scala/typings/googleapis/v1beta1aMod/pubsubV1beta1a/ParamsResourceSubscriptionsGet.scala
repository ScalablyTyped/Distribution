package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the subscription to get.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsGet {
  
  inline def apply(): ParamsResourceSubscriptionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsGet]
  }
  
  extension [Self <: ParamsResourceSubscriptionsGet](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
