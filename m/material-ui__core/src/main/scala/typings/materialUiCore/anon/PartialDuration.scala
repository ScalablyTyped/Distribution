package typings.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Duration> */
@js.native
trait PartialDuration extends js.Object {
  var complex: js.UndefOr[Double] = js.native
  var enteringScreen: js.UndefOr[Double] = js.native
  var leavingScreen: js.UndefOr[Double] = js.native
  var short: js.UndefOr[Double] = js.native
  var shorter: js.UndefOr[Double] = js.native
  var shortest: js.UndefOr[Double] = js.native
  var standard: js.UndefOr[Double] = js.native
}

object PartialDuration {
  @scala.inline
  def apply(
    complex: js.UndefOr[Double] = js.undefined,
    enteringScreen: js.UndefOr[Double] = js.undefined,
    leavingScreen: js.UndefOr[Double] = js.undefined,
    short: js.UndefOr[Double] = js.undefined,
    shorter: js.UndefOr[Double] = js.undefined,
    shortest: js.UndefOr[Double] = js.undefined,
    standard: js.UndefOr[Double] = js.undefined
  ): PartialDuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(complex)) __obj.updateDynamic("complex")(complex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enteringScreen)) __obj.updateDynamic("enteringScreen")(enteringScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(leavingScreen)) __obj.updateDynamic("leavingScreen")(leavingScreen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(short)) __obj.updateDynamic("short")(short.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shorter)) __obj.updateDynamic("shorter")(shorter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shortest)) __obj.updateDynamic("shortest")(shortest.get.asInstanceOf[js.Any])
    if (!js.isUndefined(standard)) __obj.updateDynamic("standard")(standard.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDuration]
  }
}

