package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StockChartNavigatorCategoryAxisNotesDataItemIcon extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[StockChartNavigatorCategoryAxisNotesDataItemIconBorder] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object StockChartNavigatorCategoryAxisNotesDataItemIcon {
  @scala.inline
  def apply(
    background: String = null,
    border: StockChartNavigatorCategoryAxisNotesDataItemIconBorder = null,
    size: Int | Double = null,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StockChartNavigatorCategoryAxisNotesDataItemIcon = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background)
    if (border != null) __obj.updateDynamic("border")(border)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StockChartNavigatorCategoryAxisNotesDataItemIcon]
  }
}

