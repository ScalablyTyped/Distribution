package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorPaneTitle extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorPaneTitleBorder] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var font: js.UndefOr[java.lang.String] = js.undefined
  var margin: js.UndefOr[StockChartNavigatorPaneTitleMargin] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object StockChartNavigatorPaneTitle {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartNavigatorPaneTitleBorder = null,
    color: java.lang.String = null,
    font: java.lang.String = null,
    margin: StockChartNavigatorPaneTitleMargin = null,
    position: java.lang.String = null,
    text: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): StockChartNavigatorPaneTitle = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (color != null) __obj.updateDynamic("color")(color)
    if (font != null) __obj.updateDynamic("font")(font)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (position != null) __obj.updateDynamic("position")(position)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigatorPaneTitle]
  }
}

