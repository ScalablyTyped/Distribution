package typings.luminoDatagrid.datagridMod.DataGrid

import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the arguments to a copy format function.
  */
trait CopyFormatArgs extends js.Object {
  /**
    * The column index of the value.
    */
  var column: Double
  /**
    * The metadata for the cell.
    */
  var metadata: Metadata
  /**
    * The cell region for the value.
    */
  var region: CellRegion
  /**
    * The row index of the value.
    */
  var row: Double
  /**
    * The value for the cell.
    */
  var value: js.Any
}

object CopyFormatArgs {
  @scala.inline
  def apply(column: Double, metadata: Metadata, region: CellRegion, row: Double, value: js.Any): CopyFormatArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CopyFormatArgs]
  }
}

