package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SparklineValueAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[SparklineValueAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[SparklineValueAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[SparklineValueAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[SparklineValueAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
}

object SparklineValueAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[SparklineValueAxisItemNotesDataItem] = null,
    icon: SparklineValueAxisItemNotesIcon = null,
    label: SparklineValueAxisItemNotesLabel = null,
    line: SparklineValueAxisItemNotesLine = null,
    position: java.lang.String = null
  ): SparklineValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[SparklineValueAxisItemNotes]
  }
}

