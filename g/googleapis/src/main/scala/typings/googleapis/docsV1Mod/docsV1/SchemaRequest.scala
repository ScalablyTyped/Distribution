package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single update to apply to a document.
  */
@js.native
trait SchemaRequest extends js.Object {
  /**
    * Creates a named range.
    */
  var createNamedRange: js.UndefOr[SchemaCreateNamedRangeRequest] = js.native
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[SchemaCreateParagraphBulletsRequest] = js.native
  /**
    * Deletes content from the document.
    */
  var deleteContentRange: js.UndefOr[SchemaDeleteContentRangeRequest] = js.native
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[SchemaDeleteNamedRangeRequest] = js.native
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[SchemaDeleteParagraphBulletsRequest] = js.native
  /**
    * Deletes a positioned object from the document.
    */
  var deletePositionedObject: js.UndefOr[SchemaDeletePositionedObjectRequest] = js.native
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[SchemaDeleteTableColumnRequest] = js.native
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[SchemaDeleteTableRowRequest] = js.native
  /**
    * Inserts an inline image at the specified location.
    */
  var insertInlineImage: js.UndefOr[SchemaInsertInlineImageRequest] = js.native
  /**
    * Inserts a page break at the specified location.
    */
  var insertPageBreak: js.UndefOr[SchemaInsertPageBreakRequest] = js.native
  /**
    * Inserts a table at the specified location.
    */
  var insertTable: js.UndefOr[SchemaInsertTableRequest] = js.native
  /**
    * Inserts an empty row into a table.
    */
  var insertTableRow: js.UndefOr[SchemaInsertTableRowRequest] = js.native
  /**
    * Inserts text at the specified location.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.native
  /**
    * Replaces all instances of the specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.native
  /**
    * Updates the paragraph style at the specified range.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.native
  /**
    * Updates the text style at the specified range.
    */
  var updateTextStyle: js.UndefOr[SchemaUpdateTextStyleRequest] = js.native
}

object SchemaRequest {
  @scala.inline
  def apply(
    createNamedRange: SchemaCreateNamedRangeRequest = null,
    createParagraphBullets: SchemaCreateParagraphBulletsRequest = null,
    deleteContentRange: SchemaDeleteContentRangeRequest = null,
    deleteNamedRange: SchemaDeleteNamedRangeRequest = null,
    deleteParagraphBullets: SchemaDeleteParagraphBulletsRequest = null,
    deletePositionedObject: SchemaDeletePositionedObjectRequest = null,
    deleteTableColumn: SchemaDeleteTableColumnRequest = null,
    deleteTableRow: SchemaDeleteTableRowRequest = null,
    insertInlineImage: SchemaInsertInlineImageRequest = null,
    insertPageBreak: SchemaInsertPageBreakRequest = null,
    insertTable: SchemaInsertTableRequest = null,
    insertTableRow: SchemaInsertTableRowRequest = null,
    insertText: SchemaInsertTextRequest = null,
    replaceAllText: SchemaReplaceAllTextRequest = null,
    updateParagraphStyle: SchemaUpdateParagraphStyleRequest = null,
    updateTextStyle: SchemaUpdateTextStyleRequest = null
  ): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    if (createNamedRange != null) __obj.updateDynamic("createNamedRange")(createNamedRange.asInstanceOf[js.Any])
    if (createParagraphBullets != null) __obj.updateDynamic("createParagraphBullets")(createParagraphBullets.asInstanceOf[js.Any])
    if (deleteContentRange != null) __obj.updateDynamic("deleteContentRange")(deleteContentRange.asInstanceOf[js.Any])
    if (deleteNamedRange != null) __obj.updateDynamic("deleteNamedRange")(deleteNamedRange.asInstanceOf[js.Any])
    if (deleteParagraphBullets != null) __obj.updateDynamic("deleteParagraphBullets")(deleteParagraphBullets.asInstanceOf[js.Any])
    if (deletePositionedObject != null) __obj.updateDynamic("deletePositionedObject")(deletePositionedObject.asInstanceOf[js.Any])
    if (deleteTableColumn != null) __obj.updateDynamic("deleteTableColumn")(deleteTableColumn.asInstanceOf[js.Any])
    if (deleteTableRow != null) __obj.updateDynamic("deleteTableRow")(deleteTableRow.asInstanceOf[js.Any])
    if (insertInlineImage != null) __obj.updateDynamic("insertInlineImage")(insertInlineImage.asInstanceOf[js.Any])
    if (insertPageBreak != null) __obj.updateDynamic("insertPageBreak")(insertPageBreak.asInstanceOf[js.Any])
    if (insertTable != null) __obj.updateDynamic("insertTable")(insertTable.asInstanceOf[js.Any])
    if (insertTableRow != null) __obj.updateDynamic("insertTableRow")(insertTableRow.asInstanceOf[js.Any])
    if (insertText != null) __obj.updateDynamic("insertText")(insertText.asInstanceOf[js.Any])
    if (replaceAllText != null) __obj.updateDynamic("replaceAllText")(replaceAllText.asInstanceOf[js.Any])
    if (updateParagraphStyle != null) __obj.updateDynamic("updateParagraphStyle")(updateParagraphStyle.asInstanceOf[js.Any])
    if (updateTextStyle != null) __obj.updateDynamic("updateTextStyle")(updateTextStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRequest]
  }
}

