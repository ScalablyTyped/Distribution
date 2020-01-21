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
  def apply(dataDisk: String = null): SchemaMountedDataDisk = {
    val __obj = js.Dynamic.literal()
    if (dataDisk != null) __obj.updateDynamic("dataDisk")(dataDisk.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMountedDataDisk]
  }
}

