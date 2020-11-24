package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmCreationConfig extends js.Object {
  
  /** The subnet name the vm needs to be created in. */
  var subnet: js.UndefOr[String] = js.native
  
  /** Required. VM instance machine type to create. */
  var vmMachineType: js.UndefOr[String] = js.native
  
  /** The Google Cloud Platform zone to create the VM in. */
  var vmZone: js.UndefOr[String] = js.native
}
object VmCreationConfig {
  
  @scala.inline
  def apply(): VmCreationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmCreationConfig]
  }
  
  @scala.inline
  implicit class VmCreationConfigOps[Self <: VmCreationConfig] (val x: Self) extends AnyVal {
    
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
    def setSubnet(value: String): Self = this.set("subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnet: Self = this.set("subnet", js.undefined)
    
    @scala.inline
    def setVmMachineType(value: String): Self = this.set("vmMachineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmMachineType: Self = this.set("vmMachineType", js.undefined)
    
    @scala.inline
    def setVmZone(value: String): Self = this.set("vmZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVmZone: Self = this.set("vmZone", js.undefined)
  }
}
