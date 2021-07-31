package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerConfig defines the configuration to be used for a creating workers in
  * the pool.
  */
trait SchemaWorkerConfig extends StObject {
  
  /**
    * Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud
    * Build will use a standard disk size. `disk_size` is overridden if you
    * specify a different disk size in `build_options`. In this case, a VM with
    * a disk size specified in the `build_options` will be created on demand at
    * build time. For more information see
    * https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
    */
  var diskSizeGb: js.UndefOr[String] = js.undefined
  
  /**
    * Machine Type of the worker, such as n1-standard-1. See
    * https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud
    * Build will use a standard unspecified machine to create the worker pool.
    * `machine_type` is overridden if you specify a different machine type in
    * `build_options`. In this case, the VM specified in the `build_options`
    * will be created on demand at build time. For more information see
    * https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * The network definition used to create the worker. If this section is left
    * empty, the workers will be created in WorkerPool.project_id on the
    * default network.
    */
  var network: js.UndefOr[SchemaNetwork] = js.undefined
  
  /**
    * The tag applied to the worker, and the same tag used by the firewall
    * rule. It is used to identify the Cloud Build workers among other VMs. The
    * default value for tag is `worker`.
    */
  var tag: js.UndefOr[String] = js.undefined
}
object SchemaWorkerConfig {
  
  @scala.inline
  def apply(): SchemaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerConfig]
  }
  
  @scala.inline
  implicit class SchemaWorkerConfigMutableBuilder[Self <: SchemaWorkerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskSizeGb(value: String): Self = StObject.set(x, "diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSizeGbUndefined: Self = StObject.set(x, "diskSizeGb", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setNetwork(value: SchemaNetwork): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
  }
}
