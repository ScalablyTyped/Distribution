package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesItemNotes extends js.Object {
  var icon: js.UndefOr[ChartSeriesItemNotesIcon] = js.undefined
  var label: js.UndefOr[ChartSeriesItemNotesLabel] = js.undefined
  var line: js.UndefOr[ChartSeriesItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesItemNotes {
  @scala.inline
  def apply(
    icon: ChartSeriesItemNotesIcon = null,
    label: ChartSeriesItemNotesLabel = null,
    line: ChartSeriesItemNotesLine = null,
    position: String = null,
    visual: js.Function = null
  ): ChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesItemNotes]
  }
}

