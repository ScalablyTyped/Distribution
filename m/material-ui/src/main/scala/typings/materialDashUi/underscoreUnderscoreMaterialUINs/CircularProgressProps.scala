package typings.materialDashUi.underscoreUnderscoreMaterialUINs

import typings.materialDashUi.materialDashUiStrings.determinate
import typings.materialDashUi.materialDashUiStrings.indeterminate
import typings.react.reactMod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircularProgressProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var innerStyle: js.UndefOr[CSSProperties] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[determinate | indeterminate] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var thickness: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object CircularProgressProps {
  @scala.inline
  def apply(
    color: String = null,
    innerStyle: CSSProperties = null,
    max: Int | Double = null,
    min: Int | Double = null,
    mode: determinate | indeterminate = null,
    size: Int | Double = null,
    style: CSSProperties = null,
    thickness: Int | Double = null,
    value: Int | Double = null
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

