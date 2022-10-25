package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  var subscribe: Boolean
  
  var topic: String
}
object Subscription {
  
  inline def apply(subscribe: Boolean, topic: String): Subscription = {
    val __obj = js.Dynamic.literal(subscribe = subscribe.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
  
  extension [Self <: Subscription](x: Self) {
    
    inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
