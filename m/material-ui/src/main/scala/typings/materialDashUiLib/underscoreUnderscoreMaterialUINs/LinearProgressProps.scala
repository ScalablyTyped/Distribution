package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearProgressProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.determinate | materialDashUiLib.materialDashUiLibStrings.indeterminate
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object LinearProgressProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    mode: materialDashUiLib.materialDashUiLibStrings.determinate | materialDashUiLib.materialDashUiLibStrings.indeterminate = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    value: scala.Int | scala.Double = null
  ): LinearProgressProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearProgressProps]
  }
}

