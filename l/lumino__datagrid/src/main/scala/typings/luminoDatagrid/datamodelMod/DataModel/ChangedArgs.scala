package typings.luminoDatagrid.datamodelMod.DataModel

import typings.luminoDatagrid.luminoDatagridStrings.`cells-changed`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-moved`
import typings.luminoDatagrid.luminoDatagridStrings.`columns-removed`
import typings.luminoDatagrid.luminoDatagridStrings.`model-reset`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-inserted`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-moved`
import typings.luminoDatagrid.luminoDatagridStrings.`rows-removed`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the args objects of the `changed` signal.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.datamodelMod.DataModel.RowsChangedArgs
  - typings.luminoDatagrid.datamodelMod.DataModel.ColumnsChangedArgs
  - typings.luminoDatagrid.datamodelMod.DataModel.RowsMovedArgs
  - typings.luminoDatagrid.datamodelMod.DataModel.ColumnsMovedArgs
  - typings.luminoDatagrid.datamodelMod.DataModel.CellsChangedArgs
  - typings.luminoDatagrid.datamodelMod.DataModel.ModelResetArgs
*/
trait ChangedArgs extends js.Object

object ChangedArgs {
  @scala.inline
  def RowsMovedArgs(destination: Double, index: Double, region: RowRegion, span: Double, `type`: `rows-moved`): ChangedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def CellsChangedArgs(
    column: Double,
    columnSpan: Double,
    region: CellRegion,
    row: Double,
    rowSpan: Double,
    `type`: `cells-changed`
  ): ChangedArgs = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def ModelResetArgs(`type`: `model-reset`): ChangedArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def RowsChangedArgs(index: Double, region: RowRegion, span: Double, `type`: `rows-inserted` | `rows-removed`): ChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def ColumnsChangedArgs(index: Double, region: ColumnRegion, span: Double, `type`: `columns-inserted` | `columns-removed`): ChangedArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
  @scala.inline
  def ColumnsMovedArgs(destination: Double, index: Double, region: ColumnRegion, span: Double, `type`: `columns-moved`): ChangedArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangedArgs]
  }
}

