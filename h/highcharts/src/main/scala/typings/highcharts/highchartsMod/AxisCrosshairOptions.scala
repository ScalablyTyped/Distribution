package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.highchartsMod.XAxisCrosshairOptions
  - typings.highcharts.highchartsMod.YAxisCrosshairOptions
*/
trait AxisCrosshairOptions extends js.Object

object AxisCrosshairOptions {
  @scala.inline
  def XAxisCrosshairOptions(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    dashStyle: DashStyleValue = null,
    label: XAxisCrosshairLabelOptions = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): AxisCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisCrosshairOptions]
  }
  @scala.inline
  def YAxisCrosshairOptions(
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    dashStyle: DashStyleValue = null,
    label: YAxisCrosshairLabelOptions = null,
    snap: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): AxisCrosshairOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisCrosshairOptions]
  }
}

