package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NodeManagement defines the set of node management services turned on for
  * the node pool.
  */
@js.native
trait SchemaNodeManagement extends js.Object {
  /**
    * Whether the nodes will be automatically repaired.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  /**
    * Whether the nodes will be automatically upgraded.
    */
  var autoUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * Specifies the Auto Upgrade knobs for the node pool.
    */
  var upgradeOptions: js.UndefOr[SchemaAutoUpgradeOptions] = js.native
}

object SchemaNodeManagement {
  @scala.inline
  def apply(): SchemaNodeManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNodeManagement]
  }
  @scala.inline
  implicit class SchemaNodeManagementOps[Self <: SchemaNodeManagement] (val x: Self) extends AnyVal {
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
    def setAutoRepair(value: Boolean): Self = this.set("autoRepair", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRepair: Self = this.set("autoRepair", js.undefined)
    @scala.inline
    def setAutoUpgrade(value: Boolean): Self = this.set("autoUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoUpgrade: Self = this.set("autoUpgrade", js.undefined)
    @scala.inline
    def setUpgradeOptions(value: SchemaAutoUpgradeOptions): Self = this.set("upgradeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpgradeOptions: Self = this.set("upgradeOptions", js.undefined)
  }
  
}

