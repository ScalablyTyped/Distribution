package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaClientOptions extends StObject {
  
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var connectRetryOptions: js.UndefOr[RetryOptions] = js.undefined
  
  var connectTimeout: js.UndefOr[Double] = js.undefined
  
  var idleConnection: js.UndefOr[Double] = js.undefined
  
  var kafkaHost: js.UndefOr[String] = js.undefined
  
  var maxAsyncRequests: js.UndefOr[Double] = js.undefined
  
  var reconnectOnIdle: js.UndefOr[Boolean] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var sasl: js.UndefOr[Any] = js.undefined
  
  var sslOptions: js.UndefOr[Any] = js.undefined
}
object KafkaClientOptions {
  
  inline def apply(): KafkaClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KafkaClientOptions] (val x: Self) extends AnyVal {
    
    inline def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
    
    inline def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setConnectRetryOptions(value: RetryOptions): Self = StObject.set(x, "connectRetryOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectRetryOptionsUndefined: Self = StObject.set(x, "connectRetryOptions", js.undefined)
    
    inline def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    inline def setIdleConnection(value: Double): Self = StObject.set(x, "idleConnection", value.asInstanceOf[js.Any])
    
    inline def setIdleConnectionUndefined: Self = StObject.set(x, "idleConnection", js.undefined)
    
    inline def setKafkaHost(value: String): Self = StObject.set(x, "kafkaHost", value.asInstanceOf[js.Any])
    
    inline def setKafkaHostUndefined: Self = StObject.set(x, "kafkaHost", js.undefined)
    
    inline def setMaxAsyncRequests(value: Double): Self = StObject.set(x, "maxAsyncRequests", value.asInstanceOf[js.Any])
    
    inline def setMaxAsyncRequestsUndefined: Self = StObject.set(x, "maxAsyncRequests", js.undefined)
    
    inline def setReconnectOnIdle(value: Boolean): Self = StObject.set(x, "reconnectOnIdle", value.asInstanceOf[js.Any])
    
    inline def setReconnectOnIdleUndefined: Self = StObject.set(x, "reconnectOnIdle", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setSasl(value: Any): Self = StObject.set(x, "sasl", value.asInstanceOf[js.Any])
    
    inline def setSaslUndefined: Self = StObject.set(x, "sasl", js.undefined)
    
    inline def setSslOptions(value: Any): Self = StObject.set(x, "sslOptions", value.asInstanceOf[js.Any])
    
    inline def setSslOptionsUndefined: Self = StObject.set(x, "sslOptions", js.undefined)
  }
}
