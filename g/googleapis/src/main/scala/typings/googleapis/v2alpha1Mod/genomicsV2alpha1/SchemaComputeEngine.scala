package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a Compute Engine resource that is being managed by a running
  * pipeline.
  */
@js.native
trait SchemaComputeEngine extends js.Object {
  /**
    * The names of the disks that were created for this pipeline.
    */
  var diskNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * The instance on which the operation is running.
    */
  var instanceName: js.UndefOr[String] = js.native
  /**
    * The machine type of the instance.
    */
  var machineType: js.UndefOr[String] = js.native
  /**
    * The availability zone in which the instance resides.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaComputeEngine {
  @scala.inline
  def apply(): SchemaComputeEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeEngine]
  }
  @scala.inline
  implicit class SchemaComputeEngineOps[Self <: SchemaComputeEngine] (val x: Self) extends AnyVal {
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
    def setDiskNamesVarargs(value: String*): Self = this.set("diskNames", js.Array(value :_*))
    @scala.inline
    def setDiskNames(value: js.Array[String]): Self = this.set("diskNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskNames: Self = this.set("diskNames", js.undefined)
    @scala.inline
    def setInstanceName(value: String): Self = this.set("instanceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceName: Self = this.set("instanceName", js.undefined)
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    @scala.inline
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

