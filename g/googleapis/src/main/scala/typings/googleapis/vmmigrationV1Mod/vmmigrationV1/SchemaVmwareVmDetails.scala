package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaVmwareVmDetails extends StObject {
  
  /**
    * Output only. The VM Boot Option.
    */
  var bootOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total size of the storage allocated to the VM in MB.
    */
  var committedStorageMb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of cpus in the VM.
    */
  var cpuCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The descriptive name of the vCenter's datacenter this VM is contained in.
    */
  var datacenterDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The id of the vCenter's datacenter this VM is contained in.
    */
  var datacenterId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The number of disks the VM has.
    */
  var diskCount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The display name of the VM. Note that this is not necessarily unique.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VM's OS. See for example https://vdc-repo.vmware.com/vmwb-repository/dcr-public/da47f910-60ac-438b-8b9b-6122f4d14524/16b7274a-bf8b-4b4c-a05e-746f2aa93c8c/doc/vim.vm.GuestOsDescriptor.GuestOsIdentifier.html for types of strings this might hold.
    */
  var guestDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The size of the memory of the VM in MB.
    */
  var memoryMb: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The power state of the VM at the moment list was taken.
    */
  var powerState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of the VM in vCenter.
    */
  var uuid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The VM's id in the source (note that this is not the MigratingVm's id). This is the moref id of the VM.
    */
  var vmId: js.UndefOr[String | Null] = js.undefined
}
object SchemaVmwareVmDetails {
  
  inline def apply(): SchemaVmwareVmDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmwareVmDetails]
  }
  
  extension [Self <: SchemaVmwareVmDetails](x: Self) {
    
    inline def setBootOption(value: String): Self = StObject.set(x, "bootOption", value.asInstanceOf[js.Any])
    
    inline def setBootOptionNull: Self = StObject.set(x, "bootOption", null)
    
    inline def setBootOptionUndefined: Self = StObject.set(x, "bootOption", js.undefined)
    
    inline def setCommittedStorageMb(value: String): Self = StObject.set(x, "committedStorageMb", value.asInstanceOf[js.Any])
    
    inline def setCommittedStorageMbNull: Self = StObject.set(x, "committedStorageMb", null)
    
    inline def setCommittedStorageMbUndefined: Self = StObject.set(x, "committedStorageMb", js.undefined)
    
    inline def setCpuCount(value: Double): Self = StObject.set(x, "cpuCount", value.asInstanceOf[js.Any])
    
    inline def setCpuCountNull: Self = StObject.set(x, "cpuCount", null)
    
    inline def setCpuCountUndefined: Self = StObject.set(x, "cpuCount", js.undefined)
    
    inline def setDatacenterDescription(value: String): Self = StObject.set(x, "datacenterDescription", value.asInstanceOf[js.Any])
    
    inline def setDatacenterDescriptionNull: Self = StObject.set(x, "datacenterDescription", null)
    
    inline def setDatacenterDescriptionUndefined: Self = StObject.set(x, "datacenterDescription", js.undefined)
    
    inline def setDatacenterId(value: String): Self = StObject.set(x, "datacenterId", value.asInstanceOf[js.Any])
    
    inline def setDatacenterIdNull: Self = StObject.set(x, "datacenterId", null)
    
    inline def setDatacenterIdUndefined: Self = StObject.set(x, "datacenterId", js.undefined)
    
    inline def setDiskCount(value: Double): Self = StObject.set(x, "diskCount", value.asInstanceOf[js.Any])
    
    inline def setDiskCountNull: Self = StObject.set(x, "diskCount", null)
    
    inline def setDiskCountUndefined: Self = StObject.set(x, "diskCount", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGuestDescription(value: String): Self = StObject.set(x, "guestDescription", value.asInstanceOf[js.Any])
    
    inline def setGuestDescriptionNull: Self = StObject.set(x, "guestDescription", null)
    
    inline def setGuestDescriptionUndefined: Self = StObject.set(x, "guestDescription", js.undefined)
    
    inline def setMemoryMb(value: Double): Self = StObject.set(x, "memoryMb", value.asInstanceOf[js.Any])
    
    inline def setMemoryMbNull: Self = StObject.set(x, "memoryMb", null)
    
    inline def setMemoryMbUndefined: Self = StObject.set(x, "memoryMb", js.undefined)
    
    inline def setPowerState(value: String): Self = StObject.set(x, "powerState", value.asInstanceOf[js.Any])
    
    inline def setPowerStateNull: Self = StObject.set(x, "powerState", null)
    
    inline def setPowerStateUndefined: Self = StObject.set(x, "powerState", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidNull: Self = StObject.set(x, "uuid", null)
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
    
    inline def setVmId(value: String): Self = StObject.set(x, "vmId", value.asInstanceOf[js.Any])
    
    inline def setVmIdNull: Self = StObject.set(x, "vmId", null)
    
    inline def setVmIdUndefined: Self = StObject.set(x, "vmId", js.undefined)
  }
}
