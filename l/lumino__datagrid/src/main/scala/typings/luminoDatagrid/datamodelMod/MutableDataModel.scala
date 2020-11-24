package typings.luminoDatagrid.datamodelMod

import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/datagrid/lib/datamodel", "MutableDataModel")
@js.native
abstract class MutableDataModel () extends DataModel {
  
  /**
    * Set the data value for a cell in the data model.
    *
    * @param region - The cell region of interest.
    *
    * @param row - The row index of the cell of interest.
    *
    * @param column - The column index of the cell of interest.
    *
    * @returns true if succeeds, false otherwise.
    *
    */
  def setData(region: CellRegion, row: Double, column: Double, value: js.Any): Boolean = js.native
}
