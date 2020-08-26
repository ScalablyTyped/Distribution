package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesDefaultsNotes extends js.Object {
  var icon: js.UndefOr[ChartSeriesDefaultsNotesIcon] = js.native
  var label: js.UndefOr[ChartSeriesDefaultsNotesLabel] = js.native
  var line: js.UndefOr[ChartSeriesDefaultsNotesLine] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartSeriesDefaultsNotes {
  @scala.inline
  def apply(): ChartSeriesDefaultsNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesDefaultsNotes]
  }
  @scala.inline
  implicit class ChartSeriesDefaultsNotesOps[Self <: ChartSeriesDefaultsNotes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIcon(value: ChartSeriesDefaultsNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: ChartSeriesDefaultsNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLine(value: ChartSeriesDefaultsNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
  
}

