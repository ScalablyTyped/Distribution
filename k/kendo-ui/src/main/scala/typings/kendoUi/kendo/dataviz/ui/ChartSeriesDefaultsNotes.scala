package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaultsNotes extends js.Object {
  var icon: js.UndefOr[ChartSeriesDefaultsNotesIcon] = js.undefined
  var label: js.UndefOr[ChartSeriesDefaultsNotesLabel] = js.undefined
  var line: js.UndefOr[ChartSeriesDefaultsNotesLine] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesDefaultsNotes {
  @scala.inline
  def apply(
    icon: ChartSeriesDefaultsNotesIcon = null,
    label: ChartSeriesDefaultsNotesLabel = null,
    line: ChartSeriesDefaultsNotesLine = null,
    visual: js.Function = null
  ): ChartSeriesDefaultsNotes = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaultsNotes]
  }
}

