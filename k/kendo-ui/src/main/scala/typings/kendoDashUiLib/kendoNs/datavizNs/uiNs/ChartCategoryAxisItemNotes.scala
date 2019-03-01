package typings
package kendoDashUiLib.kendoNs.datavizNs.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartCategoryAxisItemNotes extends js.Object {
  var data: js.UndefOr[js.Array[ChartCategoryAxisItemNotesDataItem]] = js.undefined
  var icon: js.UndefOr[ChartCategoryAxisItemNotesIcon] = js.undefined
  var label: js.UndefOr[ChartCategoryAxisItemNotesLabel] = js.undefined
  var line: js.UndefOr[ChartCategoryAxisItemNotesLine] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartCategoryAxisItemNotes {
  @scala.inline
  def apply(
    data: js.Array[ChartCategoryAxisItemNotesDataItem] = null,
    icon: ChartCategoryAxisItemNotesIcon = null,
    label: ChartCategoryAxisItemNotesLabel = null,
    line: ChartCategoryAxisItemNotesLine = null,
    position: java.lang.String = null,
    visual: js.Function = null
  ): ChartCategoryAxisItemNotes = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (label != null) __obj.updateDynamic("label")(label)
    if (line != null) __obj.updateDynamic("line")(line)
    if (position != null) __obj.updateDynamic("position")(position)
    if (visual != null) __obj.updateDynamic("visual")(visual)
    __obj.asInstanceOf[ChartCategoryAxisItemNotes]
  }
}

