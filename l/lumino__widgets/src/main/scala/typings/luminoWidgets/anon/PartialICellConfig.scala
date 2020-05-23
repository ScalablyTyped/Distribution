package typings.luminoWidgets.anon

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
    column: js.UndefOr[Double] = js.undefined,
    columnSpan: js.UndefOr[Double] = js.undefined,
    row: js.UndefOr[Double] = js.undefined,
    rowSpan: js.UndefOr[Double] = js.undefined
  ): PartialICellConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnSpan)) __obj.updateDynamic("columnSpan")(columnSpan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(row)) __obj.updateDynamic("row")(row.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rowSpan)) __obj.updateDynamic("rowSpan")(rowSpan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialICellConfig]
  }
}

