package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.AnonCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsScopedList extends js.Object {
  /**
    * [Output Only] The list of instance groups that are contained in this
    * scope.
    */
  var instanceGroups: js.UndefOr[js.Array[SchemaInstanceGroup]] = js.native
  /**
    * [Output Only] An informational warning that replaces the list of instance
    * groups when the list is empty.
    */
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaInstanceGroupsScopedList {
  @scala.inline
  def apply(instanceGroups: js.Array[SchemaInstanceGroup] = null, warning: AnonCode = null): SchemaInstanceGroupsScopedList = {
    val __obj = js.Dynamic.literal()
    if (instanceGroups != null) __obj.updateDynamic("instanceGroups")(instanceGroups.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupsScopedList]
  }
}

