package typings.kendoDashUi.kendoNs.datavizNs.uiNs

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
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartSeriesDefaultsNotes]
  }
}

