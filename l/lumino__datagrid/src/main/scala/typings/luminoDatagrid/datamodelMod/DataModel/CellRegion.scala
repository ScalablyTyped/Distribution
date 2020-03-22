package typings.luminoDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model cell regions.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.body
  - typings.luminoDatagrid.luminoDatagridStrings.`row-header`
  - typings.luminoDatagrid.luminoDatagridStrings.`column-header`
  - typings.luminoDatagrid.luminoDatagridStrings.`corner-header`
*/
trait CellRegion extends js.Object

object CellRegion {
  @scala.inline
  def body: typings.luminoDatagrid.luminoDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `column-header`: typings.luminoDatagrid.luminoDatagridStrings.`column-header` = this.cast("column-header")
  @scala.inline
  def `corner-header`: typings.luminoDatagrid.luminoDatagridStrings.`corner-header` = this.cast("corner-header")
  @scala.inline
  def `row-header`: typings.luminoDatagrid.luminoDatagridStrings.`row-header` = this.cast("row-header")
}

