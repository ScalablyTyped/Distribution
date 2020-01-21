package typings.googleapis.containerV1Mod.containerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MaintenanceWindow defines the maintenance window to be used for the
  * cluster.
  */
@js.native
trait SchemaMaintenanceWindow extends js.Object {
  /**
    * DailyMaintenanceWindow specifies a daily maintenance operation window.
    */
  var dailyMaintenanceWindow: js.UndefOr[SchemaDailyMaintenanceWindow] = js.native
}

object SchemaMaintenanceWindow {
  @scala.inline
  def apply(dailyMaintenanceWindow: SchemaDailyMaintenanceWindow = null): SchemaMaintenanceWindow = {
    val __obj = js.Dynamic.literal()
    if (dailyMaintenanceWindow != null) __obj.updateDynamic("dailyMaintenanceWindow")(dailyMaintenanceWindow.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaintenanceWindow]
  }
}

