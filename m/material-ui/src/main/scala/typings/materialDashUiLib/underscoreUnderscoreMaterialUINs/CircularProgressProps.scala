package typings
package materialDashUiLib.underscoreUnderscoreMaterialUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularProgressProps extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var innerStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var max: js.UndefOr[scala.Double] = js.undefined
  var min: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[
    materialDashUiLib.materialDashUiLibStrings.determinate | materialDashUiLib.materialDashUiLibStrings.indeterminate
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var thickness: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object CircularProgressProps {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    innerStyle: reactLib.reactMod.CSSProperties = null,
    max: scala.Int | scala.Double = null,
    min: scala.Int | scala.Double = null,
    mode: materialDashUiLib.materialDashUiLibStrings.determinate | materialDashUiLib.materialDashUiLibStrings.indeterminate = null,
    size: scala.Int | scala.Double = null,
    style: reactLib.reactMod.CSSProperties = null,
    thickness: scala.Int | scala.Double = null,
    value: scala.Int | scala.Double = null
  ): CircularProgressProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressProps]
  }
}

