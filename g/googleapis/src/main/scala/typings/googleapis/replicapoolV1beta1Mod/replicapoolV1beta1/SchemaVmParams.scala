package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Parameters for creating a Compute Engine Instance resource. Most fields are
  * identical to the corresponding Compute Engine resource.
  */
@js.native
trait SchemaVmParams extends js.Object {
  /**
    * Deprecated. Please use baseInstanceName instead.
    */
  var baseInstanceName: js.UndefOr[String] = js.native
  /**
    * Enables IP Forwarding, which allows this instance to receive packets
    * destined for a different IP address, and send packets with a different
    * source IP. See IP Forwarding for more information.
    */
  var canIpForward: js.UndefOr[Boolean] = js.native
  /**
    * An optional textual description of the instance.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A list of existing Persistent Disk resources to attach to each replica in
    * the pool. Each disk will be attached in read-only mode to every replica.
    */
  var disksToAttach: js.UndefOr[js.Array[SchemaExistingDisk]] = js.native
  /**
    * A list of Disk resources to create and attach to each Replica in the
    * Pool. Currently, you can only define one disk and it must be a root
    * persistent disk. Note that Replica Pool will create a root persistent
    * disk for each replica.
    */
  var disksToCreate: js.UndefOr[js.Array[SchemaNewDisk]] = js.native
  /**
    * The machine type for this instance. The resource name (e.g.
    * n1-standard-1).
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The metadata key/value pairs assigned to this instance.
    */
  var metadata: js.UndefOr[SchemaMetadata] = js.native
  /**
    * A list of network interfaces for the instance. Currently only one
    * interface is supported by Google Compute Engine, ONE_TO_ONE_NAT.
    */
  var networkInterfaces: js.UndefOr[js.Array[SchemaNetworkInterface]] = js.native
  var onHostMaintenance: js.UndefOr[String] = js.native
  /**
    * A list of Service Accounts to enable for this instance.
    */
  var serviceAccounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  /**
    * A list of tags to apply to the Google Compute Engine instance to identify
    * resources.
    */
  var tags: js.UndefOr[SchemaTag] = js.native
}

object SchemaVmParams {
  @scala.inline
  def apply(): SchemaVmParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVmParams]
  }
  @scala.inline
  implicit class SchemaVmParamsOps[Self <: SchemaVmParams] (val x: Self) extends AnyVal {
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
    def setBaseInstanceName(value: String): Self = this.set("baseInstanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseInstanceName: Self = this.set("baseInstanceName", js.undefined)
    @scala.inline
    def setCanIpForward(value: Boolean): Self = this.set("canIpForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanIpForward: Self = this.set("canIpForward", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisksToAttachVarargs(value: SchemaExistingDisk*): Self = this.set("disksToAttach", js.Array(value :_*))
    @scala.inline
    def setDisksToAttach(value: js.Array[SchemaExistingDisk]): Self = this.set("disksToAttach", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisksToAttach: Self = this.set("disksToAttach", js.undefined)
    @scala.inline
    def setDisksToCreateVarargs(value: SchemaNewDisk*): Self = this.set("disksToCreate", js.Array(value :_*))
    @scala.inline
    def setDisksToCreate(value: js.Array[SchemaNewDisk]): Self = this.set("disksToCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisksToCreate: Self = this.set("disksToCreate", js.undefined)
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    @scala.inline
    def setMetadata(value: SchemaMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    @scala.inline
    def setNetworkInterfacesVarargs(value: SchemaNetworkInterface*): Self = this.set("networkInterfaces", js.Array(value :_*))
    @scala.inline
    def setNetworkInterfaces(value: js.Array[SchemaNetworkInterface]): Self = this.set("networkInterfaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaces: Self = this.set("networkInterfaces", js.undefined)
    @scala.inline
    def setOnHostMaintenance(value: String): Self = this.set("onHostMaintenance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnHostMaintenance: Self = this.set("onHostMaintenance", js.undefined)
    @scala.inline
    def setServiceAccountsVarargs(value: SchemaServiceAccount*): Self = this.set("serviceAccounts", js.Array(value :_*))
    @scala.inline
    def setServiceAccounts(value: js.Array[SchemaServiceAccount]): Self = this.set("serviceAccounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceAccounts: Self = this.set("serviceAccounts", js.undefined)
    @scala.inline
    def setTags(value: SchemaTag): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

