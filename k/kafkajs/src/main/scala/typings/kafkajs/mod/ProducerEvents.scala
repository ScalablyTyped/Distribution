package typings.kafkajs.mod

import typings.kafkajs.kafkajsStrings.producerDotconnect
import typings.kafkajs.kafkajsStrings.producerDotdisconnect
import typings.kafkajs.kafkajsStrings.producerDotnetworkDotrequest
import typings.kafkajs.kafkajsStrings.producerDotnetworkDotrequest_queue_size
import typings.kafkajs.kafkajsStrings.producerDotnetworkDotrequest_timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProducerEvents extends StObject {
  
  var CONNECT: producerDotconnect
  
  var DISCONNECT: producerDotdisconnect
  
  var REQUEST: producerDotnetworkDotrequest
  
  var REQUEST_QUEUE_SIZE: producerDotnetworkDotrequest_queue_size
  
  var REQUEST_TIMEOUT: producerDotnetworkDotrequest_timeout
}
object ProducerEvents {
  
  inline def apply(): ProducerEvents = {
    val __obj = js.Dynamic.literal(CONNECT = "producer.connect", DISCONNECT = "producer.disconnect", REQUEST = "producer.network.request", REQUEST_QUEUE_SIZE = "producer.network.request_queue_size", REQUEST_TIMEOUT = "producer.network.request_timeout")
    __obj.asInstanceOf[ProducerEvents]
  }
  
  extension [Self <: ProducerEvents](x: Self) {
    
    inline def setCONNECT(value: producerDotconnect): Self = StObject.set(x, "CONNECT", value.asInstanceOf[js.Any])
    
    inline def setDISCONNECT(value: producerDotdisconnect): Self = StObject.set(x, "DISCONNECT", value.asInstanceOf[js.Any])
    
    inline def setREQUEST(value: producerDotnetworkDotrequest): Self = StObject.set(x, "REQUEST", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_QUEUE_SIZE(value: producerDotnetworkDotrequest_queue_size): Self = StObject.set(x, "REQUEST_QUEUE_SIZE", value.asInstanceOf[js.Any])
    
    inline def setREQUEST_TIMEOUT(value: producerDotnetworkDotrequest_timeout): Self = StObject.set(x, "REQUEST_TIMEOUT", value.asInstanceOf[js.Any])
  }
}
