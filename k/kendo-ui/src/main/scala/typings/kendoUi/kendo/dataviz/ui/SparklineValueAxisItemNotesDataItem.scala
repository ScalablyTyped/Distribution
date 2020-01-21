package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[SparklineValueAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[SparklineValueAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[SparklineValueAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SparklineValueAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: SparklineValueAxisItemNotesDataItemIcon = null,
    label: SparklineValueAxisItemNotesDataItemLabel = null,
    line: SparklineValueAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): SparklineValueAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SparklineValueAxisItemNotesDataItem]
  }
}

