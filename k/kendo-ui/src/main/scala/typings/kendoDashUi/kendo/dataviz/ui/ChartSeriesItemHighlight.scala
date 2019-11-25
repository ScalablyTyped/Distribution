package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[ChartSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var line: js.UndefOr[ChartSeriesItemHighlightLine] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
  var toggle: js.UndefOr[js.Function] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesItemHighlight {
  @scala.inline
  def apply(
    border: ChartSeriesItemHighlightBorder = null,
    color: String = null,
    line: ChartSeriesItemHighlightLine = null,
    opacity: Int | Double = null,
    toggle: js.Function = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemHighlight]
  }
}

