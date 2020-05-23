package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.mod.XAxisPlotBandsOptions
  - typings.highcharts.mod.YAxisPlotBandsOptions
  - typings.highcharts.mod.ZAxisPlotBandsOptions
*/
trait AxisPlotBandsOptions extends js.Object

object AxisPlotBandsOptions {
  @scala.inline
  def XAxisPlotBandsOptions(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    borderColor: ColorString = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    events: XAxisPlotBandsEventsOptions = null,
    from: js.UndefOr[Double] = js.undefined,
    id: String = null,
    label: XAxisPlotBandsLabelOptions = null,
    to: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): AxisPlotBandsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotBandsOptions]
  }
  @scala.inline
  def YAxisPlotBandsOptions(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    borderColor: ColorString = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    events: YAxisPlotBandsEventsOptions = null,
    from: js.UndefOr[Double] = js.undefined,
    id: String = null,
    innerRadius: Double | String = null,
    label: YAxisPlotBandsLabelOptions = null,
    outerRadius: Double | String = null,
    thickness: Double | String = null,
    to: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): AxisPlotBandsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotBandsOptions]
  }
  @scala.inline
  def ZAxisPlotBandsOptions(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    borderColor: ColorString = null,
    borderWidth: js.UndefOr[Double] = js.undefined,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    events: ZAxisPlotBandsEventsOptions = null,
    from: js.UndefOr[Double] = js.undefined,
    id: String = null,
    label: ZAxisPlotBandsLabelOptions = null,
    to: js.UndefOr[Double] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): AxisPlotBandsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.get.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (!js.isUndefined(from)) __obj.updateDynamic("from")(from.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(to)) __obj.updateDynamic("to")(to.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotBandsOptions]
  }
}

