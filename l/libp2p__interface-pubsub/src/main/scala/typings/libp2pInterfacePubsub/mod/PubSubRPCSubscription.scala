package typings.libp2pInterfacePubsub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PubSubRPCSubscription extends StObject {
  
  var subscribe: js.UndefOr[Boolean] = js.undefined
  
  var topic: js.UndefOr[String] = js.undefined
}
object PubSubRPCSubscription {
  
  inline def apply(): PubSubRPCSubscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PubSubRPCSubscription]
  }
  
  extension [Self <: PubSubRPCSubscription](x: Self) {
    
    inline def setSubscribe(value: Boolean): Self = StObject.set(x, "subscribe", value.asInstanceOf[js.Any])
    
    inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    
    inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
  }
}
