package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A location of a single table cell within a table.
  */
@js.native
trait SchemaTableCellLocation extends js.Object {
  /**
    * The 0-based column index.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * The 0-based row index.
    */
  var rowIndex: js.UndefOr[Double] = js.native
}

object SchemaTableCellLocation {
  @scala.inline
  def apply(columnIndex: Int | Double = null, rowIndex: Int | Double = null): SchemaTableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableCellLocation]
  }
}

