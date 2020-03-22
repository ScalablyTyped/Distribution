package typings.luminoDatagrid.datamodelMod.DataModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A type alias for the data model column regions.
  */
/* Rewritten from type alias, can be one of: 
  - typings.luminoDatagrid.luminoDatagridStrings.body
  - typings.luminoDatagrid.luminoDatagridStrings.`row-header`
*/
trait ColumnRegion extends js.Object

object ColumnRegion {
  @scala.inline
  def body: typings.luminoDatagrid.luminoDatagridStrings.body = this.cast("body")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `row-header`: typings.luminoDatagrid.luminoDatagridStrings.`row-header` = this.cast("row-header")
}

