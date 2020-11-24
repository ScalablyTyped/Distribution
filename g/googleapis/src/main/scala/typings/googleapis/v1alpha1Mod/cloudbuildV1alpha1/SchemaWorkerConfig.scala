package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * WorkerConfig defines the configuration to be used for a creating workers in
  * the pool.
  */
@js.native
trait SchemaWorkerConfig extends js.Object {
  
  /**
    * Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud
    * Build will use a standard disk size. `disk_size` is overridden if you
    * specify a different disk size in `build_options`. In this case, a VM with
    * a disk size specified in the `build_options` will be created on demand at
    * build time. For more information see
    * https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  
  /**
    * Machine Type of the worker, such as n1-standard-1. See
    * https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud
    * Build will use a standard unspecified machine to create the worker pool.
    * `machine_type` is overridden if you specify a different machine type in
    * `build_options`. In this case, the VM specified in the `build_options`
    * will be created on demand at build time. For more information see
    * https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
    */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * The network definition used to create the worker. If this section is left
    * empty, the workers will be created in WorkerPool.project_id on the
    * default network.
    */
  var network: js.UndefOr[SchemaNetwork] = js.native
  
  /**
    * The tag applied to the worker, and the same tag used by the firewall
    * rule. It is used to identify the Cloud Build workers among other VMs. The
    * default value for tag is `worker`.
    */
  var tag: js.UndefOr[String] = js.native
}
object SchemaWorkerConfig {
  
  @scala.inline
  def apply(): SchemaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerConfig]
  }
  
  @scala.inline
  implicit class SchemaWorkerConfigOps[Self <: SchemaWorkerConfig] (val x: Self) extends AnyVal {
    
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
    def setDiskSizeGb(value: String): Self = this.set("diskSizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSizeGb: Self = this.set("diskSizeGb", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setNetwork(value: SchemaNetwork): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
}
