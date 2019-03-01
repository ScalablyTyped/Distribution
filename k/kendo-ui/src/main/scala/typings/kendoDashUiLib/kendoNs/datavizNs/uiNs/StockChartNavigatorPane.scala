package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorPane extends js.Object {
  var background: js.UndefOr[java.lang.String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorPaneBorder] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var margin: js.UndefOr[StockChartNavigatorPaneMargin] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var padding: js.UndefOr[StockChartNavigatorPanePadding] = js.undefined
  var title: js.UndefOr[java.lang.String | StockChartNavigatorPaneTitle] = js.undefined
}

object StockChartNavigatorPane {
  @scala.inline
  def apply(
    background: java.lang.String = null,
    border: StockChartNavigatorPaneBorder = null,
    height: scala.Int | scala.Double = null,
    margin: StockChartNavigatorPaneMargin = null,
    name: java.lang.String = null,
    padding: StockChartNavigatorPanePadding = null,
    title: java.lang.String | StockChartNavigatorPaneTitle = null
  ): StockChartNavigatorPane = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorPane]
  }
}

