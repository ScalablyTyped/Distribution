package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateSshScriptRequest extends js.Object {
  
  /** Required. Bastion VM Instance name to use or to create. */
  var vm: js.UndefOr[String] = js.native
  
  /** The VM creation configuration */
  var vmCreationConfig: js.UndefOr[VmCreationConfig] = js.native
  
  /** The port that will be open on the bastion host */
  var vmPort: js.UndefOr[Double] = js.native
  
  /** The VM selection configuration */
  var vmSelectionConfig: js.UndefOr[VmSelectionConfig] = js.native
}
object GenerateSshScriptRequest {
  
  @scala.inline
  def apply(): GenerateSshScriptRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateSshScriptRequest]
  }
  
  @scala.inline
  implicit class GenerateSshScriptRequestOps[Self <: GenerateSshScriptRequest] (val x: Self) extends AnyVal {
    
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
    def setVm(value: String): Self = this.set("vm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVm: Self = this.set("vm", js.undefined)
    
    @scala.inline
    def setVmCreationConfig(value: VmCreationConfig): Self = this.set("vmCreationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmCreationConfig: Self = this.set("vmCreationConfig", js.undefined)
    
    @scala.inline
    def setVmPort(value: Double): Self = this.set("vmPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmPort: Self = this.set("vmPort", js.undefined)
    
    @scala.inline
    def setVmSelectionConfig(value: VmSelectionConfig): Self = this.set("vmSelectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmSelectionConfig: Self = this.set("vmSelectionConfig", js.undefined)
  }
}
