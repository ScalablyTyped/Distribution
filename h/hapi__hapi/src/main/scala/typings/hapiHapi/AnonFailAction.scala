package typings.hapiHapi

import typings.hapiHapi.mod.Lifecycle.FailAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailAction extends js.Object {
  var failAction: js.UndefOr[FailAction] = js.undefined
  var parse: js.UndefOr[Boolean] = js.undefined
}

object AnonFailAction {
  @scala.inline
  def apply(failAction: FailAction = null, parse: js.UndefOr[Boolean] = js.undefined): AnonFailAction = {
    val __obj = js.Dynamic.literal()
    if (failAction != null) __obj.updateDynamic("failAction")(failAction.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailAction]
  }
}

