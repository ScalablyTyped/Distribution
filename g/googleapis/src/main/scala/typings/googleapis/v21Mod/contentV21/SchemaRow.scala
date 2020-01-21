package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRow extends js.Object {
  /**
    * The list of cells that constitute the row. Must have the same length as
    * columnHeaders for two-dimensional tables, a length of 1 for
    * one-dimensional tables. Required.
    */
  var cells: js.UndefOr[js.Array[SchemaValue]] = js.native
}

object SchemaRow {
  @scala.inline
  def apply(cells: js.Array[SchemaValue] = null): SchemaRow = {
    val __obj = js.Dynamic.literal()
    if (cells != null) __obj.updateDynamic("cells")(cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRow]
  }
}

