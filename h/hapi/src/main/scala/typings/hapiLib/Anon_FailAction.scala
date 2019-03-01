package typings
package hapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailAction extends js.Object {
  var failAction: js.UndefOr[hapiLib.hapiMod.LifecycleNs.FailAction] = js.undefined
  var parse: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_FailAction {
  @scala.inline
  def apply(
    failAction: hapiLib.hapiMod.LifecycleNs.FailAction = null,
    parse: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_FailAction = {
    val __obj = js.Dynamic.literal()
    if (failAction != null) __obj.updateDynamic("failAction")(failAction.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_FailAction]
  }
}

