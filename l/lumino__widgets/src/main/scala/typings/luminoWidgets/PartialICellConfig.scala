package typings.luminoWidgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@lumino/widgets.@lumino/widgets/lib/gridlayout.GridLayout.ICellConfig> */
trait PartialICellConfig extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var columnSpan: js.UndefOr[Double] = js.undefined
  var row: js.UndefOr[Double] = js.undefined
  var rowSpan: js.UndefOr[Double] = js.undefined
}

object PartialICellConfig {
  @scala.inline
  def apply(
    column: Int | Double = null,
    columnSpan: Int | Double = null,
    row: Int | Double = null,
    rowSpan: Int | Double = null
  ): PartialICellConfig = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnSpan != null) __obj.updateDynamic("columnSpan")(columnSpan.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowSpan != null) __obj.updateDynamic("rowSpan")(rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialICellConfig]
  }
}

