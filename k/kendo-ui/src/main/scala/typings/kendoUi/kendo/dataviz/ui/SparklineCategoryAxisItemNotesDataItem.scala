package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineCategoryAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[SparklineCategoryAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[SparklineCategoryAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[SparklineCategoryAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SparklineCategoryAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: SparklineCategoryAxisItemNotesDataItemIcon = null,
    label: SparklineCategoryAxisItemNotesDataItemLabel = null,
    line: SparklineCategoryAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): SparklineCategoryAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineCategoryAxisItemNotesDataItem]
  }
}

