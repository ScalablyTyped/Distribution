package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[ChartValueAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[ChartValueAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[ChartValueAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[ChartValueAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartValueAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[ChartValueAxisItemNotesDataItem] = null,
    icon: ChartValueAxisItemNotesIcon = null,
    label: ChartValueAxisItemNotesLabel = null,
    line: ChartValueAxisItemNotesLine = null,
    position: String = null,
    visual: js.Function = null
  ): ChartValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartValueAxisItemNotes]
  }
}

