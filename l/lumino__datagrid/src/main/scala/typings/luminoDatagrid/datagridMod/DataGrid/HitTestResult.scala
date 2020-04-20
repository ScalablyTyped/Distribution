package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.luminoDatagridStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the result of a grid hit test.
  */
trait HitTestResult extends js.Object {
  /**
    * The column index of the cell that was hit.
    *
    * This is `-1` for the `void` region.
    */
  val column: Double
  /**
    * The height of the cell.
    *
    * This is `-1` for the `void` region.
    */
  val height: Double
  /**
    * The region of the data grid that was hit.
    */
  val region: CellRegion | void
  /**
    * The row index of the cell that was hit.
    *
    * This is `-1` for the `void` region.
    */
  val row: Double
  /**
    * The width of the cell.
    *
    * This is `-1` for the `void` region.
    */
  val width: Double
  /**
    * The X coordinate of the mouse in cell coordinates.
    *
    * This is `-1` for the `void` region.
    */
  val x: Double
  /**
    * The Y coordinate of the mouse in cell coordinates.
    *
    * This is `-1` for the `void` region.
    */
  val y: Double
}

object HitTestResult {
  @scala.inline
  def apply(
    column: Double,
    height: Double,
    region: CellRegion | void,
    row: Double,
    width: Double,
    x: Double,
    y: Double
  ): HitTestResult = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitTestResult]
  }
}

