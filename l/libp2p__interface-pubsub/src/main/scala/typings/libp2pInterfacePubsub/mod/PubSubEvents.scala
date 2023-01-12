package typings.libp2pInterfacePubsub.mod

import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubEvents extends StObject {
  
  var message: CustomEvent[Message]
  
  var `subscription-change`: CustomEvent[SubscriptionChangeData]
}
object PubSubEvents {
  
  inline def apply(message: CustomEvent[Message], `subscription-change`: CustomEvent[SubscriptionChangeData]): PubSubEvents = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("subscription-change")(`subscription-change`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PubSubEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PubSubEvents] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: CustomEvent[Message]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def `setSubscription-change`(value: CustomEvent[SubscriptionChangeData]): Self = StObject.set(x, "subscription-change", value.asInstanceOf[js.Any])
  }
}
