package typings.iotaLibJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InclusionStates extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var inclusionStates: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[typings.iotaLibJs.mod.Security] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object InclusionStates {
  @scala.inline
  def apply(
    end: js.UndefOr[Double] = js.undefined,
    inclusionStates: js.UndefOr[Boolean] = js.undefined,
    security: typings.iotaLibJs.mod.Security = null,
    start: js.UndefOr[Double] = js.undefined
  ): InclusionStates = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusionStates)) __obj.updateDynamic("inclusionStates")(inclusionStates.get.asInstanceOf[js.Any])
    if (security != null) __obj.updateDynamic("security")(security.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclusionStates]
  }
}

