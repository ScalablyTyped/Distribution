package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartXAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[ChartXAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[ChartXAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[ChartXAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[ChartXAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartXAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[ChartXAxisItemNotesDataItem] = null,
    icon: ChartXAxisItemNotesIcon = null,
    label: ChartXAxisItemNotesLabel = null,
    line: ChartXAxisItemNotesLine = null,
    position: String = null,
    visual: js.Function = null
  ): ChartXAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartXAxisItemNotes]
  }
}

