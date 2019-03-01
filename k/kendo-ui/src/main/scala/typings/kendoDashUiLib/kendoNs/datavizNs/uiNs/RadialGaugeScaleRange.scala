package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialGaugeScaleRange extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[scala.Double] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var to: js.UndefOr[scala.Double] = js.undefined
}

object RadialGaugeScaleRange {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    from: scala.Int | scala.Double = null,
    opacity: scala.Int | scala.Double = null,
    to: scala.Int | scala.Double = null
  ): RadialGaugeScaleRange = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGaugeScaleRange]
  }
}

