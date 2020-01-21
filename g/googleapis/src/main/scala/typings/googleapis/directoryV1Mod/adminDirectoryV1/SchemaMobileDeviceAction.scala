package typings.googleapis.directoryV1Mod.adminDirectoryV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON request template for firing commands on Mobile Device in Directory
  * Devices API.
  */
@js.native
trait SchemaMobileDeviceAction extends js.Object {
  /**
    * Action to be taken on the Mobile Device
    */
  var action: js.UndefOr[String] = js.native
}

object SchemaMobileDeviceAction {
  @scala.inline
  def apply(action: String = null): SchemaMobileDeviceAction = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMobileDeviceAction]
  }
}

