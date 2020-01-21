package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * MaintenancePolicy defines the maintenance policy to be used for the
  * cluster.
  */
@js.native
trait SchemaMaintenancePolicy extends js.Object {
  /**
    * Specifies the maintenance window in which maintenance may be performed.
    */
  var window: js.UndefOr[SchemaMaintenanceWindow] = js.native
}

object SchemaMaintenancePolicy {
  @scala.inline
  def apply(window: SchemaMaintenanceWindow = null): SchemaMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaMaintenancePolicy]
  }
}

