package typings.grommet

import typings.grommet.utilsMod.GapType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: js.UndefOr[GapType] = js.undefined
  var row: js.UndefOr[GapType] = js.undefined
}

object AnonColumn {
  @scala.inline
  def apply(column: GapType = null, row: GapType = null): AnonColumn = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}

