package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorPane extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorPaneBorder] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double | StockChartNavigatorPaneMargin] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double | StockChartNavigatorPanePadding] = js.undefined
  var title: js.UndefOr[String | StockChartNavigatorPaneTitle] = js.undefined
}

object StockChartNavigatorPane {
  @scala.inline
  def apply(
    background: String = null,
    border: StockChartNavigatorPaneBorder = null,
    height: Int | Double = null,
    margin: Double | StockChartNavigatorPaneMargin = null,
    name: String = null,
    padding: Double | StockChartNavigatorPanePadding = null,
    title: String | StockChartNavigatorPaneTitle = null
  ): StockChartNavigatorPane = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigatorPane]
  }
}

