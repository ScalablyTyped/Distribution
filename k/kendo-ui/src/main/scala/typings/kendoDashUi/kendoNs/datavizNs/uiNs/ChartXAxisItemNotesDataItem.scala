package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartXAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[ChartXAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[ChartXAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[ChartXAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartXAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: ChartXAxisItemNotesDataItemIcon = null,
    label: ChartXAxisItemNotesDataItemLabel = null,
    line: ChartXAxisItemNotesDataItemLine = null,
    position: String = null,
    value: js.Any = null
  ): ChartXAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartXAxisItemNotesDataItem]
  }
}

