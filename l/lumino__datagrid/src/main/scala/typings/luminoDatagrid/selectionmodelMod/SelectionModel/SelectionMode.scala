package typings.luminoDatagrid.selectionmodelMod.SelectionModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the selection mode.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.row
  - typings.luminoDatagrid.luminoDatagridStrings.column
  - typings.luminoDatagrid.luminoDatagridStrings.cell
*/
trait SelectionMode extends js.Object

object SelectionMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cell: typings.luminoDatagrid.luminoDatagridStrings.cell = this.cast("cell")
  @scala.inline
  def column: typings.luminoDatagrid.luminoDatagridStrings.column = this.cast("column")
  @scala.inline
  def row: typings.luminoDatagrid.luminoDatagridStrings.row = this.cast("row")
}

