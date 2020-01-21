package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a disk on a VM.
  */
@js.native
trait SchemaDiskStatus extends js.Object {
  /**
    * Free disk space.
    */
  var freeSpaceBytes: js.UndefOr[String] = js.native
  /**
    * Total disk space.
    */
  var totalSpaceBytes: js.UndefOr[String] = js.native
}

object SchemaDiskStatus {
  @scala.inline
  def apply(freeSpaceBytes: String = null, totalSpaceBytes: String = null): SchemaDiskStatus = {
    val __obj = js.Dynamic.literal()
    if (freeSpaceBytes != null) __obj.updateDynamic("freeSpaceBytes")(freeSpaceBytes.asInstanceOf[js.Any])
    if (totalSpaceBytes != null) __obj.updateDynamic("totalSpaceBytes")(totalSpaceBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDiskStatus]
  }
}

