package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShieldedInstanceConfig extends js.Object {
  
  /** Defines whether the instance has integrity monitoring enabled. Enabled by default. */
  var enableIntegrityMonitoring: js.UndefOr[Boolean] = js.native
  
  /** Defines whether the instance has Secure Boot enabled. Disabled by default. */
  var enableSecureBoot: js.UndefOr[Boolean] = js.native
  
  /** Defines whether the instance has the vTPM enabled. Enabled by default. */
  var enableVtpm: js.UndefOr[Boolean] = js.native
}
object ShieldedInstanceConfig {
  
  @scala.inline
  def apply(): ShieldedInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShieldedInstanceConfig]
  }
  
  @scala.inline
  implicit class ShieldedInstanceConfigOps[Self <: ShieldedInstanceConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableIntegrityMonitoring(value: Boolean): Self = this.set("enableIntegrityMonitoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableIntegrityMonitoring: Self = this.set("enableIntegrityMonitoring", js.undefined)
    
    @scala.inline
    def setEnableSecureBoot(value: Boolean): Self = this.set("enableSecureBoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSecureBoot: Self = this.set("enableSecureBoot", js.undefined)
    
    @scala.inline
    def setEnableVtpm(value: Boolean): Self = this.set("enableVtpm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVtpm: Self = this.set("enableVtpm", js.undefined)
  }
}
