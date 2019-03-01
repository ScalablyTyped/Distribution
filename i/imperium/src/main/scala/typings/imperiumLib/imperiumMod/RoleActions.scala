package typings
package imperiumLib.imperiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleActions extends js.Object {
  var actions: js.Array[Action]
  var getAcl: js.UndefOr[GetAcl] = js.undefined
}

object RoleActions {
  @scala.inline
  def apply(actions: js.Array[Action], getAcl: GetAcl = null): RoleActions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("actions")(actions)
    if (getAcl != null) __obj.updateDynamic("getAcl")(getAcl)
    __obj.asInstanceOf[RoleActions]
  }
}

