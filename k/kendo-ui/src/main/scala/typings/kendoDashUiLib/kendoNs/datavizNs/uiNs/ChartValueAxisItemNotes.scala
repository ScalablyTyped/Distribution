package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartValueAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[ChartValueAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[ChartValueAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[ChartValueAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[ChartValueAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartValueAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[ChartValueAxisItemNotesDataItem] = null,
    icon: ChartValueAxisItemNotesIcon = null,
    label: ChartValueAxisItemNotesLabel = null,
    line: ChartValueAxisItemNotesLine = null,
    position: java.lang.String = null,
    visual: js.Function = null
  ): ChartValueAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartValueAxisItemNotes]
  }
}

