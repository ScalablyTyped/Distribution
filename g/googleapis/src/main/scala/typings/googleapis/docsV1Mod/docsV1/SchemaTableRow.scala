package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contents and style of a row in a Table.
  */
@js.native
trait SchemaTableRow extends js.Object {
  /**
    * The zero-based end index of this row, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * The zero-based start index of this row, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested insertion IDs. A TableRow may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * The suggested style changes to this row, keyed by suggestion ID.
    */
  var suggestedTableRowStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTableRowStyle]] = js.native
  /**
    * The contents and style of each cell in this row.  It is possible for a
    * table to be non-rectangular, so some rows may have a different number of
    * cells than other rows in the same table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.native
  /**
    * The style of the table row.
    */
  var tableRowStyle: js.UndefOr[SchemaTableRowStyle] = js.native
}

object SchemaTableRow {
  @scala.inline
  def apply(
    endIndex: Int | Double = null,
    startIndex: Int | Double = null,
    suggestedDeletionIds: js.Array[String] = null,
    suggestedInsertionIds: js.Array[String] = null,
    suggestedTableRowStyleChanges: StringDictionary[SchemaSuggestedTableRowStyle] = null,
    tableCells: js.Array[SchemaTableCell] = null,
    tableRowStyle: SchemaTableRowStyle = null
  ): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    if (endIndex != null) __obj.updateDynamic("endIndex")(endIndex.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (suggestedDeletionIds != null) __obj.updateDynamic("suggestedDeletionIds")(suggestedDeletionIds.asInstanceOf[js.Any])
    if (suggestedInsertionIds != null) __obj.updateDynamic("suggestedInsertionIds")(suggestedInsertionIds.asInstanceOf[js.Any])
    if (suggestedTableRowStyleChanges != null) __obj.updateDynamic("suggestedTableRowStyleChanges")(suggestedTableRowStyleChanges.asInstanceOf[js.Any])
    if (tableCells != null) __obj.updateDynamic("tableCells")(tableCells.asInstanceOf[js.Any])
    if (tableRowStyle != null) __obj.updateDynamic("tableRowStyle")(tableRowStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTableRow]
  }
}

