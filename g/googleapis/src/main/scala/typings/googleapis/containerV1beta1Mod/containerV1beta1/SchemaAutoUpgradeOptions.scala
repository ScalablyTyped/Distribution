package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AutoUpgradeOptions defines the set of options for the user to control how
  * the Auto Upgrades will proceed.
  */
@js.native
trait SchemaAutoUpgradeOptions extends js.Object {
  /**
    * [Output only] This field is set when upgrades are about to commence with
    * the approximate start time for the upgrades, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var autoUpgradeStartTime: js.UndefOr[String] = js.native
  /**
    * [Output only] This field is set when upgrades are about to commence with
    * the description of the upgrade.
    */
  var description: js.UndefOr[String] = js.native
}

object SchemaAutoUpgradeOptions {
  @scala.inline
  def apply(autoUpgradeStartTime: String = null, description: String = null): SchemaAutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    if (autoUpgradeStartTime != null) __obj.updateDynamic("autoUpgradeStartTime")(autoUpgradeStartTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAutoUpgradeOptions]
  }
}

