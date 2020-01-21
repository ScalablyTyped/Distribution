package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing actions on ChromeOs Device in Directory
  * Devices API.
  */
@js.native
trait SchemaChromeOsDeviceAction extends js.Object {
  /**
    * Action to be taken on the ChromeOs Device
    */
  var action: js.UndefOr[String] = js.native
  var deprovisionReason: js.UndefOr[String] = js.native
}

object SchemaChromeOsDeviceAction {
  @scala.inline
  def apply(action: String = null, deprovisionReason: String = null): SchemaChromeOsDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (deprovisionReason != null) __obj.updateDynamic("deprovisionReason")(deprovisionReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChromeOsDeviceAction]
  }
}

