package typings.jaegerClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplerConfig extends js.Object {
  
  var host: js.UndefOr[String] = js.native
  
  var hostPort: js.UndefOr[String] = js.native
  
  var param: Double = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var refreshIntervalMs: js.UndefOr[Double] = js.native
  
  var `type`: String = js.native
}
object SamplerConfig {
  
  @scala.inline
  def apply(param: Double, `type`: String): SamplerConfig = {
    val __obj = js.Dynamic.literal(param = param.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplerConfig]
  }
  
  @scala.inline
  implicit class SamplerConfigOps[Self <: SamplerConfig] (val x: Self) extends AnyVal {
    
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
    def setParam(value: Double): Self = this.set("param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostPort(value: String): Self = this.set("hostPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostPort: Self = this.set("hostPort", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setRefreshIntervalMs(value: Double): Self = this.set("refreshIntervalMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshIntervalMs: Self = this.set("refreshIntervalMs", js.undefined)
  }
}
