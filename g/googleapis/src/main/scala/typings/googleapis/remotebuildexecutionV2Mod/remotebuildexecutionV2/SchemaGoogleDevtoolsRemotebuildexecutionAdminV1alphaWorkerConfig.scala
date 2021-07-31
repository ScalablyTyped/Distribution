package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the configuration to be used for a creating workers in the worker
  * pool.
  */
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends StObject {
  
  /**
    * Required. Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Disk Type to use for the worker. See [Storage
    * options](https://cloud.google.com/compute/docs/disks/#introduction).
    * Currently only `pd-standard` is supported.
    */
  var diskType: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Machine type of the worker, such as `n1-standard-2`. See
    * https://cloud.google.com/compute/docs/machine-types for a list of
    * supported machine types. Note that `f1-micro` and `g1-small` are not yet
    * supported.
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * Minimum CPU platform to use when creating the worker. See [CPU
    * Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
    */
  var minCpuPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * Determines whether the worker is reserved (equivalent to a Compute Engine
    * on-demand VM and therefore won&#39;t be preempted). See [Preemptible
    * VMs](https://cloud.google.com/preemptible-vms/) for more details.
    */
  var reserved: js.UndefOr[Boolean] = js.undefined
}
object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigMutableBuilder[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setDiskType(value: String): Self = StObject.set(x, "diskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskTypeUndefined: Self = StObject.set(x, "diskType", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setMinCpuPlatform(value: String): Self = StObject.set(x, "minCpuPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCpuPlatformUndefined: Self = StObject.set(x, "minCpuPlatform", js.undefined)
    
    @scala.inline
    def setReserved(value: Boolean): Self = StObject.set(x, "reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "reserved", js.undefined)
  }
}
