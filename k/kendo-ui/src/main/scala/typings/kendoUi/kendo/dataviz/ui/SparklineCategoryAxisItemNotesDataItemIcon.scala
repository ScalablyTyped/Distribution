package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineCategoryAxisItemNotesDataItemIcon extends js.Object {
  var background: js.UndefOr[String] = js.undefined
  var border: js.UndefOr[SparklineCategoryAxisItemNotesDataItemIconBorder] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object SparklineCategoryAxisItemNotesDataItemIcon {
  @scala.inline
  def apply(
    background: String = null,
    border: SparklineCategoryAxisItemNotesDataItemIconBorder = null,
    size: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): SparklineCategoryAxisItemNotesDataItemIcon = {
    val __obj = js.Dynamic.literal()
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineCategoryAxisItemNotesDataItemIcon]
  }
}

