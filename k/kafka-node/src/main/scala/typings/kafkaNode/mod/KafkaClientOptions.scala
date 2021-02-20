package typings.kafkaNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KafkaClientOptions extends StObject {
  
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  var connectRetryOptions: js.UndefOr[RetryOptions] = js.native
  
  var connectTimeout: js.UndefOr[Double] = js.native
  
  var idleConnection: js.UndefOr[Double] = js.native
  
  var kafkaHost: js.UndefOr[String] = js.native
  
  var maxAsyncRequests: js.UndefOr[Double] = js.native
  
  var reconnectOnIdle: js.UndefOr[Boolean] = js.native
  
  var requestTimeout: js.UndefOr[Double] = js.native
  
  var sasl: js.UndefOr[js.Any] = js.native
  
  var sslOptions: js.UndefOr[js.Any] = js.native
}
object KafkaClientOptions {
  
  @scala.inline
  def apply(): KafkaClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaClientOptions]
  }
  
  @scala.inline
  implicit class KafkaClientOptionsMutableBuilder[Self <: KafkaClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setConnectRetryOptions(value: RetryOptions): Self = StObject.set(x, "connectRetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectRetryOptionsUndefined: Self = StObject.set(x, "connectRetryOptions", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setIdleConnection(value: Double): Self = StObject.set(x, "idleConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleConnectionUndefined: Self = StObject.set(x, "idleConnection", js.undefined)
    
    @scala.inline
    def setKafkaHost(value: String): Self = StObject.set(x, "kafkaHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKafkaHostUndefined: Self = StObject.set(x, "kafkaHost", js.undefined)
    
    @scala.inline
    def setMaxAsyncRequests(value: Double): Self = StObject.set(x, "maxAsyncRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAsyncRequestsUndefined: Self = StObject.set(x, "maxAsyncRequests", js.undefined)
    
    @scala.inline
    def setReconnectOnIdle(value: Boolean): Self = StObject.set(x, "reconnectOnIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReconnectOnIdleUndefined: Self = StObject.set(x, "reconnectOnIdle", js.undefined)
    
    @scala.inline
    def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    @scala.inline
    def setSasl(value: js.Any): Self = StObject.set(x, "sasl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaslUndefined: Self = StObject.set(x, "sasl", js.undefined)
    
    @scala.inline
    def setSslOptions(value: js.Any): Self = StObject.set(x, "sslOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslOptionsUndefined: Self = StObject.set(x, "sslOptions", js.undefined)
  }
}
