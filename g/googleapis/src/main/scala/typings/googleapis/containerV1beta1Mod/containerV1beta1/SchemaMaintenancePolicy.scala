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
  def apply(): SchemaMaintenancePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMaintenancePolicy]
  }
  @scala.inline
  implicit class SchemaMaintenancePolicyOps[Self <: SchemaMaintenancePolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWindow(value: SchemaMaintenanceWindow): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
  }
  
}

