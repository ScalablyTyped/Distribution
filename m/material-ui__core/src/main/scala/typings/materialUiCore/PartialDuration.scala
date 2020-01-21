package typings.materialUiCore

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
    complex: Int | Double = null,
    enteringScreen: Int | Double = null,
    leavingScreen: Int | Double = null,
    short: Int | Double = null,
    shorter: Int | Double = null,
    shortest: Int | Double = null,
    standard: Int | Double = null
  ): PartialDuration = {
    val __obj = js.Dynamic.literal()
    if (complex != null) __obj.updateDynamic("complex")(complex.asInstanceOf[js.Any])
    if (enteringScreen != null) __obj.updateDynamic("enteringScreen")(enteringScreen.asInstanceOf[js.Any])
    if (leavingScreen != null) __obj.updateDynamic("leavingScreen")(leavingScreen.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (shorter != null) __obj.updateDynamic("shorter")(shorter.asInstanceOf[js.Any])
    if (shortest != null) __obj.updateDynamic("shortest")(shortest.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialDuration]
  }
}

