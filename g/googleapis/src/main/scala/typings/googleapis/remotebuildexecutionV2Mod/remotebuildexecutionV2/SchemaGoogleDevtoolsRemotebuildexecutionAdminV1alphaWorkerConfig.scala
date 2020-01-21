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
  def apply(
    diskSizeGb: String = null,
    diskType: String = null,
    machineType: String = null,
    minCpuPlatform: String = null,
    reserved: js.UndefOr[Boolean] = js.undefined
  ): SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig = {
    val __obj = js.Dynamic.literal()
    if (diskSizeGb != null) __obj.updateDynamic("diskSizeGb")(diskSizeGb.asInstanceOf[js.Any])
    if (diskType != null) __obj.updateDynamic("diskType")(diskType.asInstanceOf[js.Any])
    if (machineType != null) __obj.updateDynamic("machineType")(machineType.asInstanceOf[js.Any])
    if (minCpuPlatform != null) __obj.updateDynamic("minCpuPlatform")(minCpuPlatform.asInstanceOf[js.Any])
    if (!js.isUndefined(reserved)) __obj.updateDynamic("reserved")(reserved.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerConfig]
  }
}

