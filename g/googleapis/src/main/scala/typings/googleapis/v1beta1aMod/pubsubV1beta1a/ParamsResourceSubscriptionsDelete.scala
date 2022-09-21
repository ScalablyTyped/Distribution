package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSubscriptionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The subscription to delete.
    */
  var subscription: js.UndefOr[String] = js.undefined
}
object ParamsResourceSubscriptionsDelete {
  
  inline def apply(): ParamsResourceSubscriptionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsDelete]
  }
  
  extension [Self <: ParamsResourceSubscriptionsDelete](x: Self) {
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionUndefined: Self = StObject.set(x, "subscription", js.undefined)
  }
}
