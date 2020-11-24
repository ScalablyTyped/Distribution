package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HealthCheckLogConfig extends js.Object {
  
  /** Indicates whether or not to export logs. This is false by default, which means no health check logging will be done. */
  var enable: js.UndefOr[Boolean] = js.native
}
object HealthCheckLogConfig {
  
  @scala.inline
  def apply(): HealthCheckLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HealthCheckLogConfig]
  }
  
  @scala.inline
  implicit class HealthCheckLogConfigOps[Self <: HealthCheckLogConfig] (val x: Self) extends AnyVal {
    
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
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnable: Self = this.set("enable", js.undefined)
  }
}
