package typings
package isotopeDashLayoutLib.isotopeDashLayoutMod.IsotopeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellsByRow extends js.Object {
  var columnWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var rowHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object CellsByRow {
  @scala.inline
  def apply(
    columnWidth: scala.Double | java.lang.String = null,
    rowHeight: scala.Double | java.lang.String = null
  ): CellsByRow = {
    val __obj = js.Dynamic.literal()
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellsByRow]
  }
}

