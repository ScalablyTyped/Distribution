package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.luminoDatagridStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object which holds the result of a grid hit test.
  */
@js.native
trait HitTestResult extends js.Object {
  /**
    * The column index of the cell that was hit.
    *
    * This is `-1` for the `void` region.
    */
  val column: Double = js.native
  /**
    * The height of the cell.
    *
    * This is `-1` for the `void` region.
    */
  val height: Double = js.native
  /**
    * The region of the data grid that was hit.
    */
  val region: CellRegion | void = js.native
  /**
    * The row index of the cell that was hit.
    *
    * This is `-1` for the `void` region.
    */
  val row: Double = js.native
  /**
    * The width of the cell.
    *
    * This is `-1` for the `void` region.
    */
  val width: Double = js.native
  /**
    * The X coordinate of the mouse in cell coordinates.
    *
    * This is `-1` for the `void` region.
    */
  val x: Double = js.native
  /**
    * The Y coordinate of the mouse in cell coordinates.
    *
    * This is `-1` for the `void` region.
    */
  val y: Double = js.native
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
  @scala.inline
  implicit class HitTestResultOps[Self <: HitTestResult] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: CellRegion | void): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

