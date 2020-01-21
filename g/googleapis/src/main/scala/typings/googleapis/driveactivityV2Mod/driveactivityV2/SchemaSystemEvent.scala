package typings.googleapis.driveactivityV2Mod.driveactivityV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Event triggered by system operations instead of end users.
  */
@js.native
trait SchemaSystemEvent extends js.Object {
  /**
    * The type of the system event that may triggered activity.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaSystemEvent {
  @scala.inline
  def apply(`type`: String = null): SchemaSystemEvent = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSystemEvent]
  }
}

