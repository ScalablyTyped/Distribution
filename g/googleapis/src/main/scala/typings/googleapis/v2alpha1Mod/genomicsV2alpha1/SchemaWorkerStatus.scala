package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of the worker VM.
  */
@js.native
trait SchemaWorkerStatus extends js.Object {
  /**
    * Status of attached disks.
    */
  var attachedDisks: js.UndefOr[StringDictionary[SchemaDiskStatus]] = js.native
  /**
    * Status of the boot disk.
    */
  var bootDisk: js.UndefOr[SchemaDiskStatus] = js.native
  /**
    * Free RAM.
    */
  var freeRamBytes: js.UndefOr[String] = js.native
  /**
    * Total RAM.
    */
  var totalRamBytes: js.UndefOr[String] = js.native
  /**
    * System uptime.
    */
  var uptimeSeconds: js.UndefOr[String] = js.native
}

object SchemaWorkerStatus {
  @scala.inline
  def apply(): SchemaWorkerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerStatus]
  }
  @scala.inline
  implicit class SchemaWorkerStatusOps[Self <: SchemaWorkerStatus] (val x: Self) extends AnyVal {
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
    def setAttachedDisks(value: StringDictionary[SchemaDiskStatus]): Self = this.set("attachedDisks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachedDisks: Self = this.set("attachedDisks", js.undefined)
    @scala.inline
    def setBootDisk(value: SchemaDiskStatus): Self = this.set("bootDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBootDisk: Self = this.set("bootDisk", js.undefined)
    @scala.inline
    def setFreeRamBytes(value: String): Self = this.set("freeRamBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreeRamBytes: Self = this.set("freeRamBytes", js.undefined)
    @scala.inline
    def setTotalRamBytes(value: String): Self = this.set("totalRamBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalRamBytes: Self = this.set("totalRamBytes", js.undefined)
    @scala.inline
    def setUptimeSeconds(value: String): Self = this.set("uptimeSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUptimeSeconds: Self = this.set("uptimeSeconds", js.undefined)
  }
  
}

