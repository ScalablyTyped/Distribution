package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailAction extends js.Object {
  var failAction: js.UndefOr[typings.hapiHapi.mod.Lifecycle.FailAction] = js.undefined
  var parse: js.UndefOr[Boolean] = js.undefined
}

object FailAction {
  @scala.inline
  def apply(
    failAction: typings.hapiHapi.mod.Lifecycle.FailAction = null,
    parse: js.UndefOr[Boolean] = js.undefined
  ): FailAction = {
    val __obj = js.Dynamic.literal()
    if (failAction != null) __obj.updateDynamic("failAction")(failAction.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailAction]
  }
}

