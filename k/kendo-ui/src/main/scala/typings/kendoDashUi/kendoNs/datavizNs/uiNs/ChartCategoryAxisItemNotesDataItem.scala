package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[ChartCategoryAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[ChartCategoryAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[ChartCategoryAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartCategoryAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: ChartCategoryAxisItemNotesDataItemIcon = null,
    label: ChartCategoryAxisItemNotesDataItemLabel = null,
    line: ChartCategoryAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): ChartCategoryAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartCategoryAxisItemNotesDataItem]
  }
}

