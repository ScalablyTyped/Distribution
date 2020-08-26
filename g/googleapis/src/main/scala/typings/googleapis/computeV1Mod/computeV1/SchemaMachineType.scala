package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.DiskGb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Machine Type resource. (== resource_for v1.machineTypes ==) (==
  * resource_for beta.machineTypes ==)
  */
@js.native
trait SchemaMachineType extends js.Object {
  /**
    * [Output Only] Creation timestamp in RFC3339 text format.
    */
  var creationTimestamp: js.UndefOr[String] = js.native
  /**
    * [Output Only] The deprecation status associated with this machine type.
    */
  var deprecated: js.UndefOr[SchemaDeprecationStatus] = js.native
  /**
    * [Output Only] An optional textual description of the resource.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [Output Only] The number of virtual CPUs that are available to the
    * instance.
    */
  var guestCpus: js.UndefOr[Double] = js.native
  /**
    * [Output Only] The unique identifier for the resource. This identifier is
    * defined by the server.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * [Deprecated] This property is deprecated and will never be populated with
    * any relevant values.
    */
  var imageSpaceGb: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Whether this machine type has a shared CPU. See Shared-core
    * machine types for more information.
    */
  var isSharedCpu: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] The type of the resource. Always compute#machineType for
    * machine types.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * [Output Only] Maximum persistent disks allowed.
    */
  var maximumPersistentDisks: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Maximum total persistent disks size (GB) allowed.
    */
  var maximumPersistentDisksSizeGb: js.UndefOr[String] = js.native
  /**
    * [Output Only] The amount of physical memory available to the instance,
    * defined in MB.
    */
  var memoryMb: js.UndefOr[Double] = js.native
  /**
    * [Output Only] Name of the resource.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * [Output Only] A list of extended scratch disks assigned to the instance.
    */
  var scratchDisks: js.UndefOr[js.Array[DiskGb]] = js.native
  /**
    * [Output Only] Server-defined URL for the resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  /**
    * [Output Only] The name of the zone where the machine type resides, such
    * as us-central1-a.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaMachineType {
  @scala.inline
  def apply(): SchemaMachineType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMachineType]
  }
  @scala.inline
  implicit class SchemaMachineTypeOps[Self <: SchemaMachineType] (val x: Self) extends AnyVal {
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
    def setCreationTimestamp(value: String): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTimestamp: Self = this.set("creationTimestamp", js.undefined)
    @scala.inline
    def setDeprecated(value: SchemaDeprecationStatus): Self = this.set("deprecated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeprecated: Self = this.set("deprecated", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setGuestCpus(value: Double): Self = this.set("guestCpus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGuestCpus: Self = this.set("guestCpus", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageSpaceGb(value: Double): Self = this.set("imageSpaceGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSpaceGb: Self = this.set("imageSpaceGb", js.undefined)
    @scala.inline
    def setIsSharedCpu(value: Boolean): Self = this.set("isSharedCpu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsSharedCpu: Self = this.set("isSharedCpu", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMaximumPersistentDisks(value: Double): Self = this.set("maximumPersistentDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumPersistentDisks: Self = this.set("maximumPersistentDisks", js.undefined)
    @scala.inline
    def setMaximumPersistentDisksSizeGb(value: String): Self = this.set("maximumPersistentDisksSizeGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumPersistentDisksSizeGb: Self = this.set("maximumPersistentDisksSizeGb", js.undefined)
    @scala.inline
    def setMemoryMb(value: Double): Self = this.set("memoryMb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemoryMb: Self = this.set("memoryMb", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setScratchDisksVarargs(value: DiskGb*): Self = this.set("scratchDisks", js.Array(value :_*))
    @scala.inline
    def setScratchDisks(value: js.Array[DiskGb]): Self = this.set("scratchDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScratchDisks: Self = this.set("scratchDisks", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

