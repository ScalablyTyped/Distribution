package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartPane extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartPaneBorder] = js.undefined
  var clip: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var margin: js.UndefOr[Double | js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var padding: js.UndefOr[Double | js.Any] = js.undefined
  var title: js.UndefOr[String | StockChartPaneTitle] = js.undefined
}

object StockChartPane {
  @scala.inline
  def apply(
    background: String = null,
    border: StockChartPaneBorder = null,
    clip: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    margin: Double | js.Any = null,
    name: String = null,
    padding: Double | js.Any = null,
    title: String | StockChartPaneTitle = null
  ): StockChartPane = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(clip)) __obj.updateDynamic("clip")(clip)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartPane]
  }
}

