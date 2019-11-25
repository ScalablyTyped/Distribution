package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[ChartValueAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[ChartValueAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[ChartValueAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartValueAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: ChartValueAxisItemNotesDataItemIcon = null,
    label: ChartValueAxisItemNotesDataItemLabel = null,
    line: ChartValueAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): ChartValueAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartValueAxisItemNotesDataItem]
  }
}

