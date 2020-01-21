package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.highcharts.mod.XAxisPlotLinesOptions
  - typings.highcharts.mod.YAxisPlotLinesOptions
  - typings.highcharts.mod.ZAxisPlotLinesOptions
*/
trait AxisPlotLinesOptions extends js.Object

object AxisPlotLinesOptions {
  @scala.inline
  def XAxisPlotLinesOptions(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: ColorString = null,
    dashStyle: DashStyleValue = null,
    events: XAxisPlotLinesEventsOptions = null,
    id: String = null,
    label: XAxisPlotLinesLabelOptions = null,
    value: Int | Double = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): AxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotLinesOptions]
  }
  @scala.inline
  def YAxisPlotLinesOptions(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: ColorString = null,
    dashStyle: DashStyleValue = null,
    events: YAxisPlotLinesEventsOptions = null,
    id: String = null,
    label: YAxisPlotLinesLabelOptions = null,
    value: Int | Double = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): AxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotLinesOptions]
  }
  @scala.inline
  def ZAxisPlotLinesOptions(
    acrossPanes: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    color: ColorString = null,
    dashStyle: DashStyleValue = null,
    events: ZAxisPlotLinesEventsOptions = null,
    id: String = null,
    label: ZAxisPlotLinesLabelOptions = null,
    value: Int | Double = null,
    width: Int | Double = null,
    zIndex: Int | Double = null
  ): AxisPlotLinesOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(acrossPanes)) __obj.updateDynamic("acrossPanes")(acrossPanes.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dashStyle != null) __obj.updateDynamic("dashStyle")(dashStyle.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisPlotLinesOptions]
  }
}

