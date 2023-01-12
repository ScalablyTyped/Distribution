package typings.kafkajs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Broker extends StObject {
  
  var broker: String
  
  var clientId: String
  
  var queueSize: Double
}
object Broker {
  
  inline def apply(broker: String, clientId: String, queueSize: Double): Broker = {
    val __obj = js.Dynamic.literal(broker = broker.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], queueSize = queueSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Broker] (val x: Self) extends AnyVal {
    
    inline def setBroker(value: String): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setQueueSize(value: Double): Self = StObject.set(x, "queueSize", value.asInstanceOf[js.Any])
  }
}
