package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItemNotesDataItem extends js.Object {
  var icon: js.UndefOr[ChartValueAxisItemNotesDataItemIcon] = js.undefined
  var label: js.UndefOr[ChartValueAxisItemNotesDataItemLabel] = js.undefined
  var line: js.UndefOr[ChartValueAxisItemNotesDataItemLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ChartValueAxisItemNotesDataItem {
  @scala.inline
  def apply(
    icon: ChartValueAxisItemNotesDataItemIcon = null,
    label: ChartValueAxisItemNotesDataItemLabel = null,
    line: ChartValueAxisItemNotesDataItemLine = null,
    position: java.lang.String = null,
    value: js.Any = null
  ): ChartValueAxisItemNotesDataItem = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChartValueAxisItemNotesDataItem]
  }
}

