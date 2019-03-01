package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemHighlight extends js.Object {
  var border: js.UndefOr[ChartSeriesItemHighlightBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var line: js.UndefOr[ChartSeriesItemHighlightLine] = js.undefined
  var opacity: js.UndefOr[scala.Double] = js.undefined
  var toggle: js.UndefOr[js.Function] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesItemHighlight {
  @scala.inline
  def apply(
    border: ChartSeriesItemHighlightBorder = null,
    color: java.lang.String = null,
    line: ChartSeriesItemHighlightLine = null,
    opacity: scala.Int | scala.Double = null,
    toggle: js.Function = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined,
    visual: js.Function = null
  ): ChartSeriesItemHighlight = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (line != null) __obj.updateDynamic("line")(line)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (toggle != null) __obj.updateDynamic("toggle")(toggle)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartSeriesItemHighlight]
  }
}

