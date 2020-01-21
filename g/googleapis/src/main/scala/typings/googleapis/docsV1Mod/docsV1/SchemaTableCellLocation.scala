package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Location of a single cell within a table.
  */
@js.native
trait SchemaTableCellLocation extends js.Object {
  /**
    * The zero-based column index. For example, the second column in the table
    * has a column index of 1.
    */
  var columnIndex: js.UndefOr[Double] = js.native
  /**
    * The zero-based row index. For example, the second row in the table has a
    * row index of 1.
    */
  var rowIndex: js.UndefOr[Double] = js.native
  /**
    * The location where the table starts in the document.
    */
  var tableStartLocation: js.UndefOr[SchemaLocation] = js.native
}

object SchemaTableCellLocation {
  @scala.inline
  def apply(
    columnIndex: Int | Double = null,
    rowIndex: Int | Double = null,
    tableStartLocation: SchemaLocation = null
  ): SchemaTableCellLocation = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (tableStartLocation != null) __obj.updateDynamic("tableStartLocation")(tableStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableCellLocation]
  }
}

