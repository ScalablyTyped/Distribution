package typings.iotaDotLibDotJs

import typings.iotaDotLibDotJs.iotaDotLibDotJsMod.Security
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndInclusionStates extends js.Object {
  var end: js.UndefOr[Double] = js.undefined
  var inclusionStates: js.UndefOr[Boolean] = js.undefined
  var security: js.UndefOr[Security] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
}

object Anon_EndInclusionStates {
  @scala.inline
  def apply(
    end: Int | Double = null,
    inclusionStates: js.UndefOr[Boolean] = js.undefined,
    security: Security = null,
    start: Int | Double = null
  ): Anon_EndInclusionStates = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (!js.isUndefined(inclusionStates)) __obj.updateDynamic("inclusionStates")(inclusionStates)
    if (security != null) __obj.updateDynamic("security")(security)
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndInclusionStates]
  }
}

