package typings.jaegerClient.mod

import typings.node.dgramMod.SocketOptions
import typings.node.dgramMod.SocketType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReporterConfig extends StObject {
  
  var agentHost: js.UndefOr[String] = js.undefined
  
  var agentPort: js.UndefOr[Double] = js.undefined
  
  var agentSocketType: js.UndefOr[SocketType | SocketOptions] = js.undefined
  
  var collectorEndpoint: js.UndefOr[String] = js.undefined
  
  var flushIntervalMs: js.UndefOr[Double] = js.undefined
  
  var logSpans: js.UndefOr[Boolean] = js.undefined
  
  var password: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object ReporterConfig {
  
  inline def apply(): ReporterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReporterConfig]
  }
  
  extension [Self <: ReporterConfig](x: Self) {
    
    inline def setAgentHost(value: String): Self = StObject.set(x, "agentHost", value.asInstanceOf[js.Any])
    
    inline def setAgentHostUndefined: Self = StObject.set(x, "agentHost", js.undefined)
    
    inline def setAgentPort(value: Double): Self = StObject.set(x, "agentPort", value.asInstanceOf[js.Any])
    
    inline def setAgentPortUndefined: Self = StObject.set(x, "agentPort", js.undefined)
    
    inline def setAgentSocketType(value: SocketType | SocketOptions): Self = StObject.set(x, "agentSocketType", value.asInstanceOf[js.Any])
    
    inline def setAgentSocketTypeUndefined: Self = StObject.set(x, "agentSocketType", js.undefined)
    
    inline def setCollectorEndpoint(value: String): Self = StObject.set(x, "collectorEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCollectorEndpointUndefined: Self = StObject.set(x, "collectorEndpoint", js.undefined)
    
    inline def setFlushIntervalMs(value: Double): Self = StObject.set(x, "flushIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setFlushIntervalMsUndefined: Self = StObject.set(x, "flushIntervalMs", js.undefined)
    
    inline def setLogSpans(value: Boolean): Self = StObject.set(x, "logSpans", value.asInstanceOf[js.Any])
    
    inline def setLogSpansUndefined: Self = StObject.set(x, "logSpans", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
