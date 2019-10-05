package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigator extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var categoryAxis: js.UndefOr[StockChartNavigatorCategoryAxis] = js.undefined
  var dataSource: js.UndefOr[js.Any] = js.undefined
  var dateField: js.UndefOr[String] = js.undefined
  var hint: js.UndefOr[StockChartNavigatorHint] = js.undefined
  var pane: js.UndefOr[StockChartNavigatorPane] = js.undefined
  var select: js.UndefOr[StockChartNavigatorSelect] = js.undefined
  var series: js.UndefOr[js.Array[StockChartNavigatorSeriesItem]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartNavigator {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    categoryAxis: StockChartNavigatorCategoryAxis = null,
    dataSource: js.Any = null,
    dateField: String = null,
    hint: StockChartNavigatorHint = null,
    pane: StockChartNavigatorPane = null,
    select: StockChartNavigatorSelect = null,
    series: js.Array[StockChartNavigatorSeriesItem] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartNavigator = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind)
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (dateField != null) __obj.updateDynamic("dateField")(dateField)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (select != null) __obj.updateDynamic("select")(select)
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigator]
  }
}

