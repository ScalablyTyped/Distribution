package typings.jaegerClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReporterConfig extends StObject {
  
  var agentHost: js.UndefOr[String] = js.native
  
  var agentPort: js.UndefOr[Double] = js.native
  
  var collectorEndpoint: js.UndefOr[String] = js.native
  
  var flushIntervalMs: js.UndefOr[Double] = js.native
  
  var logSpans: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  var username: js.UndefOr[String] = js.native
}
object ReporterConfig {
  
  @scala.inline
  def apply(): ReporterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReporterConfig]
  }
  
  @scala.inline
  implicit class ReporterConfigMutableBuilder[Self <: ReporterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgentHost(value: String): Self = StObject.set(x, "agentHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentHostUndefined: Self = StObject.set(x, "agentHost", js.undefined)
    
    @scala.inline
    def setAgentPort(value: Double): Self = StObject.set(x, "agentPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentPortUndefined: Self = StObject.set(x, "agentPort", js.undefined)
    
    @scala.inline
    def setCollectorEndpoint(value: String): Self = StObject.set(x, "collectorEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectorEndpointUndefined: Self = StObject.set(x, "collectorEndpoint", js.undefined)
    
    @scala.inline
    def setFlushIntervalMs(value: Double): Self = StObject.set(x, "flushIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlushIntervalMsUndefined: Self = StObject.set(x, "flushIntervalMs", js.undefined)
    
    @scala.inline
    def setLogSpans(value: Boolean): Self = StObject.set(x, "logSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogSpansUndefined: Self = StObject.set(x, "logSpans", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
