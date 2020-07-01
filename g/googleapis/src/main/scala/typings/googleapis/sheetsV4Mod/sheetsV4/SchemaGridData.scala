package typings.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data in the grid, as well as metadata about the dimensions.
  */
@js.native
trait SchemaGridData extends js.Object {
  /**
    * Metadata about the requested columns in the grid, starting with the
    * column in start_column.
    */
  var columnMetadata: js.UndefOr[js.Array[SchemaDimensionProperties]] = js.native
  /**
    * The data in the grid, one entry per row, starting with the row in
    * startRow. The values in RowData will correspond to columns starting at
    * start_column.
    */
  var rowData: js.UndefOr[js.Array[SchemaRowData]] = js.native
  /**
    * Metadata about the requested rows in the grid, starting with the row in
    * start_row.
    */
  var rowMetadata: js.UndefOr[js.Array[SchemaDimensionProperties]] = js.native
  /**
    * The first column this GridData refers to, zero-based.
    */
  var startColumn: js.UndefOr[Double] = js.native
  /**
    * The first row this GridData refers to, zero-based.
    */
  var startRow: js.UndefOr[Double] = js.native
}

object SchemaGridData {
  @scala.inline
  def apply(
    columnMetadata: js.Array[SchemaDimensionProperties] = null,
    rowData: js.Array[SchemaRowData] = null,
    rowMetadata: js.Array[SchemaDimensionProperties] = null,
    startColumn: js.UndefOr[Double] = js.undefined,
    startRow: js.UndefOr[Double] = js.undefined
  ): SchemaGridData = {
    val __obj = js.Dynamic.literal()
    if (columnMetadata != null) __obj.updateDynamic("columnMetadata")(columnMetadata.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (rowMetadata != null) __obj.updateDynamic("rowMetadata")(rowMetadata.asInstanceOf[js.Any])
    if (!js.isUndefined(startColumn)) __obj.updateDynamic("startColumn")(startColumn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startRow)) __obj.updateDynamic("startRow")(startRow.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGridData]
  }
}

