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
trait CellsChangedArgs extends ChangedArgs {
  /**
    * The column index of the first modified cell.
    */
  val column: Double
  /**
    * The number of columns in the modified cell range.
    */
  val columnSpan: Double
  /**
    * The region which contains the modified cells.
    */
  val region: CellRegion
  /**
    * The row index of the first modified cell.
    */
  val row: Double
  /**
    * The number of rows in the modified cell range.
    */
  val rowSpan: Double
  /**
    * The discriminated type of the args object.
    */
  val `type`: `cells-changed`
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
}

