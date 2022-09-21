package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends StObject {
  
  /**
    * The accelerator card attached to each VM.
    */
  var accelerator: js.UndefOr[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig] = js.undefined
  
  /**
    * Required. Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/
    */
  var diskSizeGb: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Disk Type to use for the worker. See [Storage options](https://cloud.google.com/compute/docs/disks/#introduction). Currently only `pd-standard` and `pd-ssd` are supported.
    */
  var diskType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Labels associated with the workers. Label keys and values can be no longer than 63 characters, can only contain lowercase letters, numeric characters, underscores and dashes. International letters are permitted. Label keys must start with a letter. Label values are optional. There can not be more than 64 labels per resource.
    */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /**
    * Required. Machine type of the worker, such as `e2-standard-2`. See https://cloud.google.com/compute/docs/machine-types for a list of supported machine types. Note that `f1-micro` and `g1-small` are not yet supported.
    */
  var machineType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The maximum number of actions a worker can execute concurrently.
    */
  var maxConcurrentActions: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum CPU platform to use when creating the worker. See [CPU Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
    */
  var minCpuPlatform: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines the type of network access granted to workers. Possible values: - "public": Workers can connect to the public internet. - "private": Workers can only connect to Google APIs and services. - "restricted-private": Workers can only connect to Google APIs that are reachable through `restricted.googleapis.com` (`199.36.153.4/30`).
    */
  var networkAccess: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines whether the worker is reserved (equivalent to a Compute Engine on-demand VM and therefore won't be preempted). See [Preemptible VMs](https://cloud.google.com/preemptible-vms/) for more details.
    */
  var reserved: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The node type name to be used for sole-tenant nodes.
    */
  var soleTenantNodeType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the image used by each VM.
    */
  var vmImage: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig {
  
  inline def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig](x: Self) {
    
    inline def setAccelerator(value: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaAcceleratorConfig): Self = StObject.set(x, "accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "accelerator", js.undefined)
    
    inline def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    inline def setDiskSizeGbNull: Self = StObject.set(x, "diskSizeGb", null)
    
    inline def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    inline def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    inline def setDiskTypeNull: Self = StObject.set(x, "diskType", null)
    
    inline def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    inline def setMachineTypeNull: Self = StObject.set(x, "machineType", null)
    
    inline def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    inline def setMaxConcurrentActions(value: String): Self = StObject.set(x, "maxConcurrentActions", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentActionsNull: Self = StObject.set(x, "maxConcurrentActions", null)
    
    inline def setMaxConcurrentActionsUndefined: Self = StObject.set(x, "maxConcurrentActions", js.undefined)
    
    inline def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    inline def setMinCpuPlatformNull: Self = StObject.set(x, "minCpuPlatform", null)
    
    inline def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    inline def setNetworkAccess(value: String): Self = StObject.set(x, "networkAccess", value.asInstanceOf[js.Any])
    
    inline def setNetworkAccessNull: Self = StObject.set(x, "networkAccess", null)
    
    inline def setNetworkAccessUndefined: Self = StObject.set(x, "networkAccess", js.undefined)
    
    inline def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    inline def setReservedNull: Self = StObject.set(x, "reserved", null)
    
    inline def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
    
    inline def setSoleTenantNodeType(value: String): Self = StObject.set(x, "soleTenantNodeType", value.asInstanceOf[js.Any])
    
    inline def setSoleTenantNodeTypeNull: Self = StObject.set(x, "soleTenantNodeType", null)
    
    inline def setSoleTenantNodeTypeUndefined: Self = StObject.set(x, "soleTenantNodeType", js.undefined)
    
    inline def setVmImage(value: String): Self = StObject.set(x, "vmImage", value.asInstanceOf[js.Any])
    
    inline def setVmImageNull: Self = StObject.set(x, "vmImage", null)
    
    inline def setVmImageUndefined: Self = StObject.set(x, "vmImage", js.undefined)
  }
}
