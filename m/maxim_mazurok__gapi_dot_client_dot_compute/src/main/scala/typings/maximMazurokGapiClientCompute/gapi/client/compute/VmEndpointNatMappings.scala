package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmEndpointNatMappings extends js.Object {
  
  /** Name of the VM instance which the endpoint belongs to */
  var instanceName: js.UndefOr[String] = js.native
  
  var interfaceNatMappings: js.UndefOr[js.Array[VmEndpointNatMappingsInterfaceNatMappings]] = js.native
}
object VmEndpointNatMappings {
  
  @scala.inline
  def apply(): VmEndpointNatMappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VmEndpointNatMappings]
  }
  
  @scala.inline
  implicit class VmEndpointNatMappingsOps[Self <: VmEndpointNatMappings] (val x: Self) extends AnyVal {
    
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
    def setInstanceName(value: String): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    
    @scala.inline
    def setInterfaceNatMappingsVarargs(value: VmEndpointNatMappingsInterfaceNatMappings*): Self = this.set("interfaceNatMappings", js.Array(value :_*))
    
    @scala.inline
    def setInterfaceNatMappings(value: js.Array[VmEndpointNatMappingsInterfaceNatMappings]): Self = this.set("interfaceNatMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterfaceNatMappings: Self = this.set("interfaceNatMappings", js.undefined)
  }
}
