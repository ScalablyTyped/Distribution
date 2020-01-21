package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Maintenance window. This specifies when a v2 Cloud SQL instance should
  * preferably be restarted for system maintenance purposes.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  /**
    * day of week (1-7), starting on Monday.
    */
  var day: js.UndefOr[Double] = js.native
  /**
    * hour of day - 0 to 23.
    */
  var hour: js.UndefOr[Double] = js.native
  /**
    * This is always sql#maintenanceWindow.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Maintenance timing setting: canary (Earlier) or stable (Later).  Learn
    * more.
    */
  var updateTrack: js.UndefOr[String] = js.native
}

object SchemaMaintenanceWindow {
  @scala.inline
  def apply(
    day: Int | Double = null,
    hour: Int | Double = null,
    kind: String = null,
    updateTrack: String = null
  ): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (day != null) __obj.updateDynamic("day")(day.asInstanceOf[js.Any])
    if (hour != null) __obj.updateDynamic("hour")(hour.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (updateTrack != null) __obj.updateDynamic("updateTrack")(updateTrack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
}

