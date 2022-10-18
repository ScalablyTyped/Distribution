package typings.kafkajs.mod

import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaConfig extends StObject {
  
  var authenticationTimeout: js.UndefOr[Double] = js.undefined
  
  var brokers: js.Array[String] | BrokersFunction
  
  var clientId: js.UndefOr[String] = js.undefined
  
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  
  var enforceRequestTimeout: js.UndefOr[Boolean] = js.undefined
  
  var logCreator: js.UndefOr[typings.kafkajs.mod.logCreator] = js.undefined
  
  var logLevel: js.UndefOr[typings.kafkajs.mod.logLevel] = js.undefined
  
  var reauthenticationThreshold: js.UndefOr[Double] = js.undefined
  
  var requestTimeout: js.UndefOr[Double] = js.undefined
  
  var retry: js.UndefOr[RetryOptions] = js.undefined
  
  var sasl: js.UndefOr[SASLOptions | Mechanism] = js.undefined
  
  var socketFactory: js.UndefOr[ISocketFactory] = js.undefined
  
  var ssl: js.UndefOr[ConnectionOptions | Boolean] = js.undefined
}
object KafkaConfig {
  
  inline def apply(brokers: js.Array[String] | BrokersFunction): KafkaConfig = {
    val __obj = js.Dynamic.literal(brokers = brokers.asInstanceOf[js.Any])
    __obj.asInstanceOf[KafkaConfig]
  }
  
  extension [Self <: KafkaConfig](x: Self) {
    
    inline def setAuthenticationTimeout(value: Double): Self = StObject.set(x, "authenticationTimeout", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTimeoutUndefined: Self = StObject.set(x, "authenticationTimeout", js.undefined)
    
    inline def setBrokers(value: js.Array[String] | BrokersFunction): Self = StObject.set(x, "brokers", value.asInstanceOf[js.Any])
    
    inline def setBrokersFunction0(value: () => js.Array[String] | js.Promise[js.Array[String]]): Self = StObject.set(x, "brokers", js.Any.fromFunction0(value))
    
    inline def setBrokersVarargs(value: String*): Self = StObject.set(x, "brokers", js.Array(value*))
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setConnectionTimeout(value: Double): Self = StObject.set(x, "connectionTimeout", value.asInstanceOf[js.Any])
    
    inline def setConnectionTimeoutUndefined: Self = StObject.set(x, "connectionTimeout", js.undefined)
    
    inline def setEnforceRequestTimeout(value: Boolean): Self = StObject.set(x, "enforceRequestTimeout", value.asInstanceOf[js.Any])
    
    inline def setEnforceRequestTimeoutUndefined: Self = StObject.set(x, "enforceRequestTimeout", js.undefined)
    
    inline def setLogCreator(value: /* logLevel */ logLevel => js.Function1[/* entry */ LogEntry, Unit]): Self = StObject.set(x, "logCreator", js.Any.fromFunction1(value))
    
    inline def setLogCreatorUndefined: Self = StObject.set(x, "logCreator", js.undefined)
    
    inline def setLogLevel(value: logLevel): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setReauthenticationThreshold(value: Double): Self = StObject.set(x, "reauthenticationThreshold", value.asInstanceOf[js.Any])
    
    inline def setReauthenticationThresholdUndefined: Self = StObject.set(x, "reauthenticationThreshold", js.undefined)
    
    inline def setRequestTimeout(value: Double): Self = StObject.set(x, "requestTimeout", value.asInstanceOf[js.Any])
    
    inline def setRequestTimeoutUndefined: Self = StObject.set(x, "requestTimeout", js.undefined)
    
    inline def setRetry(value: RetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    
    inline def setSasl(value: SASLOptions | Mechanism): Self = StObject.set(x, "sasl", value.asInstanceOf[js.Any])
    
    inline def setSaslUndefined: Self = StObject.set(x, "sasl", js.undefined)
    
    inline def setSocketFactory(value: /* args */ ISocketFactoryArgs => Socket): Self = StObject.set(x, "socketFactory", js.Any.fromFunction1(value))
    
    inline def setSocketFactoryUndefined: Self = StObject.set(x, "socketFactory", js.undefined)
    
    inline def setSsl(value: ConnectionOptions | Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
