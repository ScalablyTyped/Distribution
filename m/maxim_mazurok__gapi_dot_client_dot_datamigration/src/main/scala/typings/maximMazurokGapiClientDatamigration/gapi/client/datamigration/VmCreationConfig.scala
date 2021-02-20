package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VmCreationConfig extends StObject {
  
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
  implicit class VmCreationConfigMutableBuilder[Self <: VmCreationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSubnet(value: String): Self = StObject.set(x, "subnet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetUndefined: Self = StObject.set(x, "subnet", js.undefined)
    
    @scala.inline
    def setVmMachineType(value: String): Self = StObject.set(x, "vmMachineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmMachineTypeUndefined: Self = StObject.set(x, "vmMachineType", js.undefined)
    
    @scala.inline
    def setVmZone(value: String): Self = StObject.set(x, "vmZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVmZoneUndefined: Self = StObject.set(x, "vmZone", js.undefined)
  }
}
