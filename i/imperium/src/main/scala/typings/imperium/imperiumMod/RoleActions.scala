package typings.imperium.imperiumMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoleActions extends js.Object {
  var actions: js.Array[Action]
  var getAcl: js.UndefOr[GetAcl] = js.undefined
}

object RoleActions {
  @scala.inline
  def apply(
    actions: js.Array[Action],
    getAcl: /* req */ Request[ParamsDictionary] => js.Promise[Boolean | js.Object] = null
  ): RoleActions = {
    val __obj = js.Dynamic.literal(actions = actions)
    if (getAcl != null) __obj.updateDynamic("getAcl")(js.Any.fromFunction1(getAcl))
    __obj.asInstanceOf[RoleActions]
  }
}

