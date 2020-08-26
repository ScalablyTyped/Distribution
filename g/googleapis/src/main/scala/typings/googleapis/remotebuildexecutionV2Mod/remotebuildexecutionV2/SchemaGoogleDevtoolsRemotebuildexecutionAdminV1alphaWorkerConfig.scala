package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the configuration to be used for a creating workers in the worker
  * pool.
  */
@js.native
trait SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig extends js.Object {
  /**
    * Required. Size of the disk attached to the worker, in GB. See
    * https://cloud.google.com/compute/docs/disks/
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Required. Disk Type to use for the worker. See [Storage
    * options](https://cloud.google.com/compute/docs/disks/#introduction).
    * Currently only `pd-standard` is supported.
    */
  var diskType: js.UndefOr[String] = js.native
  /**
    * Required. Machine type of the worker, such as `n1-standard-2`. See
    * https://cloud.google.com/compute/docs/machine-types for a list of
    * supported machine types. Note that `f1-micro` and `g1-small` are not yet
    * supported.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * Minimum CPU platform to use when creating the worker. See [CPU
    * Platforms](https://cloud.google.com/compute/docs/cpu-platforms).
    */
  var minCpuPlatform: js.UndefOr[String] = js.native
  /**
    * Determines whether the worker is reserved (equivalent to a Compute Engine
    * on-demand VM and therefore won&#39;t be preempted). See [Preemptible
    * VMs](https://cloud.google.com/preemptible-vms/) for more details.
    */
  var reserved: js.UndefOr[Boolean] = js.native
}

object SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig {
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfigOps[Self <: SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig] (val x: Self) extends AnyVal {
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
    def setDiskType(value: String): Self = this.set("diskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskType: Self = this.set("diskType", js.undefined)
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    @scala.inline
    def setMinCpuPlatform(value: String): Self = this.set("minCpuPlatform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinCpuPlatform: Self = this.set("minCpuPlatform", js.undefined)
    @scala.inline
    def setReserved(value: Boolean): Self = this.set("reserved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
  }
  
}

