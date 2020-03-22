package typings.luminoDatagrid.celleditorMod.CellEditor

import typings.luminoDatagrid.datagridMod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the configuration data for a cell.
  */
trait CellConfig extends js.Object {
  /**
    * The column index of the cell.
    */
  val column: Double
  /**
    * The grid containing the cell.
    */
  val grid: DataGrid
  /**
    * The row index of the cell.
    */
  val row: Double
}

object CellConfig {
  @scala.inline
  def apply(column: Double, grid: DataGrid, row: Double): CellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CellConfig]
  }
}

