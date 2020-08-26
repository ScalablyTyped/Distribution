package typings.luminoDatagrid.celleditorMod.CellEditor

import typings.luminoDatagrid.datagridMod.DataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the configuration data for a cell.
  */
@js.native
trait CellConfig extends js.Object {
  /**
    * The column index of the cell.
    */
  val column: Double = js.native
  /**
    * The grid containing the cell.
    */
  val grid: DataGrid = js.native
  /**
    * The row index of the cell.
    */
  val row: Double = js.native
}

object CellConfig {
  @scala.inline
  def apply(column: Double, grid: DataGrid, row: Double): CellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellConfig]
  }
  @scala.inline
  implicit class CellConfigOps[Self <: CellConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrid(value: DataGrid): Self = this.set("grid", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
  }
  
}

