package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes mounted data disk.
  */
@js.native
trait SchemaMountedDataDisk extends js.Object {
  /**
    * The name of the data disk. This name is local to the Google Cloud
    * Platform project and uniquely identifies the disk within that project,
    * for example &quot;myproject-1014-104817-4c2-harness-0-disk-1&quot;.
    */
  var dataDisk: js.UndefOr[String] = js.native
}

object SchemaMountedDataDisk {
  @scala.inline
  def apply(): SchemaMountedDataDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMountedDataDisk]
  }
  @scala.inline
  implicit class SchemaMountedDataDiskOps[Self <: SchemaMountedDataDisk] (val x: Self) extends AnyVal {
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
    def setDataDisk(value: String): Self = this.set("dataDisk", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataDisk: Self = this.set("dataDisk", js.undefined)
  }
  
}

