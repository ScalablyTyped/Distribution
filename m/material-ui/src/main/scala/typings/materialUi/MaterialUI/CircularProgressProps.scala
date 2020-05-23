package typings.materialUi.MaterialUI

import typings.materialUi.materialUiStrings.determinate
import typings.materialUi.materialUiStrings.indeterminate
import typings.react.mod.CSSProperties
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
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    mode: determinate | indeterminate = null,
    size: js.UndefOr[Double] = js.undefined,
    style: CSSProperties = null,
    thickness: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): CircularProgressProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (innerStyle != null) __obj.updateDynamic("innerStyle")(innerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(thickness)) __obj.updateDynamic("thickness")(thickness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircularProgressProps]
  }
}

