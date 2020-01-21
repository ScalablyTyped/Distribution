package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerStatus extends js.Object {
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a
    * stable state. A stable state means that: none of the instances in the
    * managed instance group is currently undergoing any type of change (for
    * example, creation, restart, or deletion); no future changes are scheduled
    * for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.native
}

object SchemaInstanceGroupManagerStatus {
  @scala.inline
  def apply(isStable: js.UndefOr[Boolean] = js.undefined): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isStable)) __obj.updateDynamic("isStable")(isStable.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
}

