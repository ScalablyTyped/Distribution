package typings.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SparklineSeriesItemNotes extends js.Object {
  var icon: js.UndefOr[SparklineSeriesItemNotesIcon] = js.native
  var label: js.UndefOr[SparklineSeriesItemNotesLabel] = js.native
  var line: js.UndefOr[SparklineSeriesItemNotesLine] = js.native
  var position: js.UndefOr[String] = js.native
}

object SparklineSeriesItemNotes {
  @scala.inline
  def apply(): SparklineSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SparklineSeriesItemNotes]
  }
  @scala.inline
  implicit class SparklineSeriesItemNotesOps[Self <: SparklineSeriesItemNotes] (val x: Self) extends AnyVal {
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
    def setIcon(value: SparklineSeriesItemNotesIcon): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLabel(value: SparklineSeriesItemNotesLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLine(value: SparklineSeriesItemNotesLine): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

