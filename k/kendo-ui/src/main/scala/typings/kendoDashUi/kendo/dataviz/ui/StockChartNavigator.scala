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
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateField != null) __obj.updateDynamic("dateField")(dateField.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(select.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StockChartNavigator]
  }
}

