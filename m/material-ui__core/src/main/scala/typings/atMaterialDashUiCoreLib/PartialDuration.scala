package typings
package atMaterialDashUiCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/styles/transitions.Duration> */
trait PartialDuration extends js.Object {
  var complex: js.UndefOr[scala.Double] = js.undefined
  var enteringScreen: js.UndefOr[scala.Double] = js.undefined
  var leavingScreen: js.UndefOr[scala.Double] = js.undefined
  var short: js.UndefOr[scala.Double] = js.undefined
  var shorter: js.UndefOr[scala.Double] = js.undefined
  var shortest: js.UndefOr[scala.Double] = js.undefined
  var standard: js.UndefOr[scala.Double] = js.undefined
}

object PartialDuration {
  @scala.inline
  def apply(
    complex: scala.Int | scala.Double = null,
    enteringScreen: scala.Int | scala.Double = null,
    leavingScreen: scala.Int | scala.Double = null,
    short: scala.Int | scala.Double = null,
    shorter: scala.Int | scala.Double = null,
    shortest: scala.Int | scala.Double = null,
    standard: scala.Int | scala.Double = null
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

