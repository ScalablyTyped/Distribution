package typings.kafkajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaJSRequestTimeoutErrorMetadata extends StObject {
  
  var broker: String
  
  var clientId: String
  
  var correlationId: Double
  
  var createdAt: Double
  
  var pendingDuration: Double
  
  var sentAt: Double
}
object KafkaJSRequestTimeoutErrorMetadata {
  
  inline def apply(
    broker: String,
    clientId: String,
    correlationId: Double,
    createdAt: Double,
    pendingDuration: Double,
    sentAt: Double
  ): KafkaJSRequestTimeoutErrorMetadata = {
    val __obj = js.Dynamic.literal(broker = broker.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], correlationId = correlationId.asInstanceOf[js.Any], createdAt = createdAt.asInstanceOf[js.Any], pendingDuration = pendingDuration.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaJSRequestTimeoutErrorMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaJSRequestTimeoutErrorMetadata] (val x: Self) extends AnyVal {
    
    inline def setBroker(value: String): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setCorrelationId(value: Double): Self = StObject.set(x, "correlationId", value.asInstanceOf[js.Any])
    
    inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setPendingDuration(value: Double): Self = StObject.set(x, "pendingDuration", value.asInstanceOf[js.Any])
    
    inline def setSentAt(value: Double): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
  }
}
