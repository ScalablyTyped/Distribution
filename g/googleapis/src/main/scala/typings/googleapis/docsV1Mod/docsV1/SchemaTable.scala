package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A StructuralElement representing a table.
  */
@js.native
trait SchemaTable extends js.Object {
  /**
    * Number of columns in the table.  It is possible for a table to be
    * non-rectangular, so some rows may have a different number of cells.
    */
  var columns: js.UndefOr[Double] = js.native
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A Table may have multiple insertion IDs if
    * it is a nested suggested change. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The contents and style of each row.
    */
  var tableRows: js.UndefOr[js.Array[SchemaTableRow]] = js.native
  /**
    * The style of the table.
    */
  var tableStyle: js.UndefOr[SchemaTableStyle] = js.native
}

object SchemaTable {
  @scala.inline
  def apply(
    columns: js.UndefOr[Double] = js.undefined,
    rows: js.UndefOr[Double] = js.undefined,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    tableRows: js.Array[SchemaTableRow] = null,
    tableStyle: SchemaTableStyle = null
  ): SchemaTable = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(columns)) __obj.updateDynamic("columns")(columns.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rows)) __obj.updateDynamic("rows")(rows.get.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (tableRows != null) __obj.updateDynamic("tableRows")(tableRows.asInstanceOf[js.Any])
    if (tableStyle != null) __obj.updateDynamic("tableStyle")(tableStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTable]
  }
}

