package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReporterConfig extends js.Object {
  
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
  implicit class ReporterConfigOps[Self <: ReporterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAgentHost(value: String): Self = this.set("agentHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentHost: Self = this.set("agentHost", js.undefined)
    
    @scala.inline
    def setAgentPort(value: Double): Self = this.set("agentPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgentPort: Self = this.set("agentPort", js.undefined)
    
    @scala.inline
    def setCollectorEndpoint(value: String): Self = this.set("collectorEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectorEndpoint: Self = this.set("collectorEndpoint", js.undefined)
    
    @scala.inline
    def setFlushIntervalMs(value: Double): Self = this.set("flushIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlushIntervalMs: Self = this.set("flushIntervalMs", js.undefined)
    
    @scala.inline
    def setLogSpans(value: Boolean): Self = this.set("logSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogSpans: Self = this.set("logSpans", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("username", js.undefined)
  }
}
