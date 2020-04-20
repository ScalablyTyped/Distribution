package typings.luminoDatagrid.celleditorMod.Private

import typings.luminoDatagrid.datagridMod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for cell properties.
  */
trait ICellInfo extends js.Object {
  var column: Double
  var data: js.Any
  var grid: DataGrid
  var height: Double
  var row: Double
  var width: Double
  var x: Double
  var y: Double
}

object ICellInfo {
  @scala.inline
  def apply(
    column: Double,
    data: js.Any,
    grid: DataGrid,
    height: Double,
    row: Double,
    width: Double,
    x: Double,
    y: Double
  ): ICellInfo = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellInfo]
  }
}

