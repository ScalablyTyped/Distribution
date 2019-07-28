package typings.atHapiHapi

import typings.atHapiHapi.atHapiHapiMod.LifecycleNs.FailAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailAction extends js.Object {
  var failAction: js.UndefOr[FailAction] = js.undefined
  var parse: js.UndefOr[Boolean] = js.undefined
}

object Anon_FailAction {
  @scala.inline
  def apply(failAction: FailAction = null, parse: js.UndefOr[Boolean] = js.undefined): Anon_FailAction = {
    val __obj = js.Dynamic.literal()
    if (failAction != null) __obj.updateDynamic("failAction")(failAction.asInstanceOf[js.Any])
    if (!js.isUndefined(parse)) __obj.updateDynamic("parse")(parse)
    __obj.asInstanceOf[Anon_FailAction]
  }
}

