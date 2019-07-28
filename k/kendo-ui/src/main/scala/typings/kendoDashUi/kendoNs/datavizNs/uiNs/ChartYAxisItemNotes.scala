package typings.kendoDashUi.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartYAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[ChartYAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[ChartYAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[ChartYAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[ChartYAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartYAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[ChartYAxisItemNotesDataItem] = null,
    icon: ChartYAxisItemNotesIcon = null,
    label: ChartYAxisItemNotesLabel = null,
    line: ChartYAxisItemNotesLine = null,
    position: String = null,
    visual: js.Function = null
  ): ChartYAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartYAxisItemNotes]
  }
}

