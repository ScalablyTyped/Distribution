package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for moving ChromeOs Device to given OU in Directory
  * Devices API.
  */
@js.native
trait SchemaChromeOsMoveDevicesToOu extends js.Object {
  /**
    * ChromeOs Devices to be moved to OU
    */
  var deviceIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaChromeOsMoveDevicesToOu {
  @scala.inline
  def apply(deviceIds: js.Array[String] = null): SchemaChromeOsMoveDevicesToOu = {
    val __obj = js.Dynamic.literal()
    if (deviceIds != null) __obj.updateDynamic("deviceIds")(deviceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChromeOsMoveDevicesToOu]
  }
}

