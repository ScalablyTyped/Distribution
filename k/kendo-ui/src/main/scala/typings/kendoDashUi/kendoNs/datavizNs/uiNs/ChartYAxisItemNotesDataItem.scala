package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[ChartYAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[ChartYAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[ChartYAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartYAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: ChartYAxisItemNotesDataItemIcon = null,
    label: ChartYAxisItemNotesDataItemLabel = null,
    line: ChartYAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): ChartYAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartYAxisItemNotesDataItem]
  }
}

