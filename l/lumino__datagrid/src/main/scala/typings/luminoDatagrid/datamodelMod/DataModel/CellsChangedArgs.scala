package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`cells-changed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An arguments object for the `changed` signal.
  *
  * #### Notes
  * Data models should emit the `changed` signal with this args object
  * type when cells are changed in-place.
  */
@js.native
trait CellsChangedArgs extends ChangedArgs {
  /**
    * The column index of the first modified cell.
    */
  val column: Double = js.native
  /**
    * The number of columns in the modified cell range.
    */
  val columnSpan: Double = js.native
  /**
    * The region which contains the modified cells.
    */
  val region: CellRegion = js.native
  /**
    * The row index of the first modified cell.
    */
  val row: Double = js.native
  /**
    * The number of rows in the modified cell range.
    */
  val rowSpan: Double = js.native
  /**
    * The discriminated type of the args object.
    */
  val `type`: `cells-changed` = js.native
}

object CellsChangedArgs {
  @scala.inline
  def apply(
    column: Double,
    columnSpan: Double,
    region: CellRegion,
    row: Double,
    rowSpan: Double,
    `type`: `cells-changed`
  ): CellsChangedArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellsChangedArgs]
  }
  @scala.inline
  implicit class CellsChangedArgsOps[Self <: CellsChangedArgs] (val x: Self) extends AnyVal {
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
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: CellRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `cells-changed`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

