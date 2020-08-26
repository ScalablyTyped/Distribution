package typings.googleapis.containerV1Mod.containerV1

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
    * A flag that specifies whether the node auto-repair is enabled for the
    * node pool. If enabled, the nodes in this node pool will be monitored and,
    * if they fail health checks too many times, an automatic repair action
    * will be triggered.
    */
  var autoRepair: js.UndefOr[Boolean] = js.native
  /**
    * A flag that specifies whether node auto-upgrade is enabled for the node
    * pool. If enabled, node auto-upgrade helps keep the nodes in your node
    * pool up to date with the latest release version of Kubernetes.
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

