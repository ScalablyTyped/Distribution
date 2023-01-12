package typings.libp2pInterfacePubsub.mod

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionChangeData extends StObject {
  
  var peerId: PeerId
  
  var subscriptions: js.Array[Subscription]
}
object SubscriptionChangeData {
  
  inline def apply(peerId: PeerId, subscriptions: js.Array[Subscription]): SubscriptionChangeData = {
    val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionChangeData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscriptionChangeData] (val x: Self) extends AnyVal {
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptions(value: js.Array[Subscription]): Self = StObject.set(x, "subscriptions", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionsVarargs(value: Subscription*): Self = StObject.set(x, "subscriptions", js.Array(value*))
  }
}
