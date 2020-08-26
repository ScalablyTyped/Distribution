package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartSeriesItemNotes extends js.Object {
  var icon: js.UndefOr[ChartSeriesItemNotesIcon] = js.native
  var label: js.UndefOr[ChartSeriesItemNotesLabel] = js.native
  var line: js.UndefOr[ChartSeriesItemNotesLine] = js.native
  var position: js.UndefOr[String] = js.native
  var visual: js.UndefOr[js.Function] = js.native
}

object ChartSeriesItemNotes {
  @scala.inline
  def apply(): ChartSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartSeriesItemNotes]
  }
  @scala.inline
  implicit class ChartSeriesItemNotesOps[Self <: ChartSeriesItemNotes] (val x: Self) extends AnyVal {
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
    def setIcon(value: ChartSeriesItemNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: ChartSeriesItemNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLine(value: ChartSeriesItemNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setVisual(value: js.Function): Self = this.set("visual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisual: Self = this.set("visual", js.undefined)
  }
  
}

