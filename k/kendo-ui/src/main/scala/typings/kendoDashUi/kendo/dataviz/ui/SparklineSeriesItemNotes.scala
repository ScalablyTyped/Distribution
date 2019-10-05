package typings.kendoDashUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineSeriesItemNotes extends js.Object {
  var icon: js.UndefOr[SparklineSeriesItemNotesIcon] = js.undefined
  var label: js.UndefOr[SparklineSeriesItemNotesLabel] = js.undefined
  var line: js.UndefOr[SparklineSeriesItemNotesLine] = js.undefined
  var position: js.UndefOr[String] = js.undefined
}

object SparklineSeriesItemNotes {
  @scala.inline
  def apply(
    icon: SparklineSeriesItemNotesIcon = null,
    label: SparklineSeriesItemNotesLabel = null,
    line: SparklineSeriesItemNotesLine = null,
    position: String = null
  ): SparklineSeriesItemNotes = {
    val __obj = js.Dynamic.literal()
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[SparklineSeriesItemNotes]
  }
}

