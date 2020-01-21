package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Time window specified for daily maintenance operations.
  */
@js.native
trait SchemaDailyMaintenanceWindow extends js.Object {
  /**
    * [Output only] Duration of the time window, automatically chosen to be
    * smallest possible in the given scenario.
    */
  var duration: js.UndefOr[String] = js.native
  /**
    * Time within the maintenance window to start the maintenance operations.
    * It must be in format &quot;HH:MM”, where HH : [00-23] and MM : [00-59]
    * GMT.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaDailyMaintenanceWindow {
  @scala.inline
  def apply(duration: String = null, startTime: String = null): SchemaDailyMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDailyMaintenanceWindow]
  }
}

