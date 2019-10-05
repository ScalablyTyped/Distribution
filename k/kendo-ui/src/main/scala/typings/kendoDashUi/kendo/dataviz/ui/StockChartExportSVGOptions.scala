package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartExportSVGOptions extends js.Object {
  var raw: js.UndefOr[Boolean] = js.undefined
}

object StockChartExportSVGOptions {
  @scala.inline
  def apply(raw: js.UndefOr[Boolean] = js.undefined): StockChartExportSVGOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    __obj.asInstanceOf[StockChartExportSVGOptions]
  }
}

