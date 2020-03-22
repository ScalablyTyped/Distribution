package typings.luminoDatagrid.datagridMod.DataGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the supported header visibility modes.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.all
  - typings.luminoDatagrid.luminoDatagridStrings.row
  - typings.luminoDatagrid.luminoDatagridStrings.column
  - typings.luminoDatagrid.luminoDatagridStrings.none
*/
trait HeaderVisibility extends js.Object

object HeaderVisibility {
  @scala.inline
  def all: typings.luminoDatagrid.luminoDatagridStrings.all = this.cast("all")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def column: typings.luminoDatagrid.luminoDatagridStrings.column = this.cast("column")
  @scala.inline
  def none: typings.luminoDatagrid.luminoDatagridStrings.none = this.cast("none")
  @scala.inline
  def row: typings.luminoDatagrid.luminoDatagridStrings.row = this.cast("row")
}

