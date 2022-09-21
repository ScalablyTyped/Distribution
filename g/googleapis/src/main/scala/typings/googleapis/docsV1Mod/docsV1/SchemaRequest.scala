package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequest extends StObject {
  
  /**
    * Creates a footer.
    */
  var createFooter: js.UndefOr[SchemaCreateFooterRequest] = js.undefined
  
  /**
    * Creates a footnote.
    */
  var createFootnote: js.UndefOr[SchemaCreateFootnoteRequest] = js.undefined
  
  /**
    * Creates a header.
    */
  var createHeader: js.UndefOr[SchemaCreateHeaderRequest] = js.undefined
  
  /**
    * Creates a named range.
    */
  var createNamedRange: js.UndefOr[SchemaCreateNamedRangeRequest] = js.undefined
  
  /**
    * Creates bullets for paragraphs.
    */
  var createParagraphBullets: js.UndefOr[SchemaCreateParagraphBulletsRequest] = js.undefined
  
  /**
    * Deletes content from the document.
    */
  var deleteContentRange: js.UndefOr[SchemaDeleteContentRangeRequest] = js.undefined
  
  /**
    * Deletes a footer from the document.
    */
  var deleteFooter: js.UndefOr[SchemaDeleteFooterRequest] = js.undefined
  
  /**
    * Deletes a header from the document.
    */
  var deleteHeader: js.UndefOr[SchemaDeleteHeaderRequest] = js.undefined
  
  /**
    * Deletes a named range.
    */
  var deleteNamedRange: js.UndefOr[SchemaDeleteNamedRangeRequest] = js.undefined
  
  /**
    * Deletes bullets from paragraphs.
    */
  var deleteParagraphBullets: js.UndefOr[SchemaDeleteParagraphBulletsRequest] = js.undefined
  
  /**
    * Deletes a positioned object from the document.
    */
  var deletePositionedObject: js.UndefOr[SchemaDeletePositionedObjectRequest] = js.undefined
  
  /**
    * Deletes a column from a table.
    */
  var deleteTableColumn: js.UndefOr[SchemaDeleteTableColumnRequest] = js.undefined
  
  /**
    * Deletes a row from a table.
    */
  var deleteTableRow: js.UndefOr[SchemaDeleteTableRowRequest] = js.undefined
  
  /**
    * Inserts an inline image at the specified location.
    */
  var insertInlineImage: js.UndefOr[SchemaInsertInlineImageRequest] = js.undefined
  
  /**
    * Inserts a page break at the specified location.
    */
  var insertPageBreak: js.UndefOr[SchemaInsertPageBreakRequest] = js.undefined
  
  /**
    * Inserts a section break at the specified location.
    */
  var insertSectionBreak: js.UndefOr[SchemaInsertSectionBreakRequest] = js.undefined
  
  /**
    * Inserts a table at the specified location.
    */
  var insertTable: js.UndefOr[SchemaInsertTableRequest] = js.undefined
  
  /**
    * Inserts an empty column into a table.
    */
  var insertTableColumn: js.UndefOr[SchemaInsertTableColumnRequest] = js.undefined
  
  /**
    * Inserts an empty row into a table.
    */
  var insertTableRow: js.UndefOr[SchemaInsertTableRowRequest] = js.undefined
  
  /**
    * Inserts text at the specified location.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.undefined
  
  /**
    * Merges cells in a table.
    */
  var mergeTableCells: js.UndefOr[SchemaMergeTableCellsRequest] = js.undefined
  
  /**
    * Updates the number of pinned header rows in a table.
    */
  var pinTableHeaderRows: js.UndefOr[SchemaPinTableHeaderRowsRequest] = js.undefined
  
  /**
    * Replaces all instances of the specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.undefined
  
  /**
    * Replaces an image in the document.
    */
  var replaceImage: js.UndefOr[SchemaReplaceImageRequest] = js.undefined
  
  /**
    * Replaces the content in a named range.
    */
  var replaceNamedRangeContent: js.UndefOr[SchemaReplaceNamedRangeContentRequest] = js.undefined
  
  /**
    * Unmerges cells in a table.
    */
  var unmergeTableCells: js.UndefOr[SchemaUnmergeTableCellsRequest] = js.undefined
  
  /**
    * Updates the style of the document.
    */
  var updateDocumentStyle: js.UndefOr[SchemaUpdateDocumentStyleRequest] = js.undefined
  
  /**
    * Updates the paragraph style at the specified range.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.undefined
  
  /**
    * Updates the section style of the specified range.
    */
  var updateSectionStyle: js.UndefOr[SchemaUpdateSectionStyleRequest] = js.undefined
  
  /**
    * Updates the style of table cells.
    */
  var updateTableCellStyle: js.UndefOr[SchemaUpdateTableCellStyleRequest] = js.undefined
  
  /**
    * Updates the properties of columns in a table.
    */
  var updateTableColumnProperties: js.UndefOr[SchemaUpdateTableColumnPropertiesRequest] = js.undefined
  
  /**
    * Updates the row style in a table.
    */
  var updateTableRowStyle: js.UndefOr[SchemaUpdateTableRowStyleRequest] = js.undefined
  
  /**
    * Updates the text style at the specified range.
    */
  var updateTextStyle: js.UndefOr[SchemaUpdateTextStyleRequest] = js.undefined
}
object SchemaRequest {
  
  inline def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  extension [Self <: SchemaRequest](x: Self) {
    
    inline def setCreateFooter(value: SchemaCreateFooterRequest): Self = StObject.set(x, "createFooter", value.asInstanceOf[js.Any])
    
    inline def setCreateFooterUndefined: Self = StObject.set(x, "createFooter", js.undefined)
    
    inline def setCreateFootnote(value: SchemaCreateFootnoteRequest): Self = StObject.set(x, "createFootnote", value.asInstanceOf[js.Any])
    
    inline def setCreateFootnoteUndefined: Self = StObject.set(x, "createFootnote", js.undefined)
    
    inline def setCreateHeader(value: SchemaCreateHeaderRequest): Self = StObject.set(x, "createHeader", value.asInstanceOf[js.Any])
    
    inline def setCreateHeaderUndefined: Self = StObject.set(x, "createHeader", js.undefined)
    
    inline def setCreateNamedRange(value: SchemaCreateNamedRangeRequest): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    inline def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    inline def setCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    inline def setDeleteContentRange(value: SchemaDeleteContentRangeRequest): Self = StObject.set(x, "deleteContentRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteContentRangeUndefined: Self = StObject.set(x, "deleteContentRange", js.undefined)
    
    inline def setDeleteFooter(value: SchemaDeleteFooterRequest): Self = StObject.set(x, "deleteFooter", value.asInstanceOf[js.Any])
    
    inline def setDeleteFooterUndefined: Self = StObject.set(x, "deleteFooter", js.undefined)
    
    inline def setDeleteHeader(value: SchemaDeleteHeaderRequest): Self = StObject.set(x, "deleteHeader", value.asInstanceOf[js.Any])
    
    inline def setDeleteHeaderUndefined: Self = StObject.set(x, "deleteHeader", js.undefined)
    
    inline def setDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    inline def setDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    inline def setDeletePositionedObject(value: SchemaDeletePositionedObjectRequest): Self = StObject.set(x, "deletePositionedObject", value.asInstanceOf[js.Any])
    
    inline def setDeletePositionedObjectUndefined: Self = StObject.set(x, "deletePositionedObject", js.undefined)
    
    inline def setDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    inline def setDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    inline def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    inline def setInsertInlineImage(value: SchemaInsertInlineImageRequest): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
    
    inline def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
    
    inline def setInsertPageBreak(value: SchemaInsertPageBreakRequest): Self = StObject.set(x, "insertPageBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertPageBreakUndefined: Self = StObject.set(x, "insertPageBreak", js.undefined)
    
    inline def setInsertSectionBreak(value: SchemaInsertSectionBreakRequest): Self = StObject.set(x, "insertSectionBreak", value.asInstanceOf[js.Any])
    
    inline def setInsertSectionBreakUndefined: Self = StObject.set(x, "insertSectionBreak", js.undefined)
    
    inline def setInsertTable(value: SchemaInsertTableRequest): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumn(value: SchemaInsertTableColumnRequest): Self = StObject.set(x, "insertTableColumn", value.asInstanceOf[js.Any])
    
    inline def setInsertTableColumnUndefined: Self = StObject.set(x, "insertTableColumn", js.undefined)
    
    inline def setInsertTableRow(value: SchemaInsertTableRowRequest): Self = StObject.set(x, "insertTableRow", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowUndefined: Self = StObject.set(x, "insertTableRow", js.undefined)
    
    inline def setInsertTableUndefined: Self = StObject.set(x, "insertTable", js.undefined)
    
    inline def setInsertText(value: SchemaInsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setMergeTableCells(value: SchemaMergeTableCellsRequest): Self = StObject.set(x, "mergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setMergeTableCellsUndefined: Self = StObject.set(x, "mergeTableCells", js.undefined)
    
    inline def setPinTableHeaderRows(value: SchemaPinTableHeaderRowsRequest): Self = StObject.set(x, "pinTableHeaderRows", value.asInstanceOf[js.Any])
    
    inline def setPinTableHeaderRowsUndefined: Self = StObject.set(x, "pinTableHeaderRows", js.undefined)
    
    inline def setReplaceAllText(value: SchemaReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    inline def setReplaceImage(value: SchemaReplaceImageRequest): Self = StObject.set(x, "replaceImage", value.asInstanceOf[js.Any])
    
    inline def setReplaceImageUndefined: Self = StObject.set(x, "replaceImage", js.undefined)
    
    inline def setReplaceNamedRangeContent(value: SchemaReplaceNamedRangeContentRequest): Self = StObject.set(x, "replaceNamedRangeContent", value.asInstanceOf[js.Any])
    
    inline def setReplaceNamedRangeContentUndefined: Self = StObject.set(x, "replaceNamedRangeContent", js.undefined)
    
    inline def setUnmergeTableCells(value: SchemaUnmergeTableCellsRequest): Self = StObject.set(x, "unmergeTableCells", value.asInstanceOf[js.Any])
    
    inline def setUnmergeTableCellsUndefined: Self = StObject.set(x, "unmergeTableCells", js.undefined)
    
    inline def setUpdateDocumentStyle(value: SchemaUpdateDocumentStyleRequest): Self = StObject.set(x, "updateDocumentStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateDocumentStyleUndefined: Self = StObject.set(x, "updateDocumentStyle", js.undefined)
    
    inline def setUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    inline def setUpdateSectionStyle(value: SchemaUpdateSectionStyleRequest): Self = StObject.set(x, "updateSectionStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateSectionStyleUndefined: Self = StObject.set(x, "updateSectionStyle", js.undefined)
    
    inline def setUpdateTableCellStyle(value: SchemaUpdateTableCellStyleRequest): Self = StObject.set(x, "updateTableCellStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableCellStyleUndefined: Self = StObject.set(x, "updateTableCellStyle", js.undefined)
    
    inline def setUpdateTableColumnProperties(value: SchemaUpdateTableColumnPropertiesRequest): Self = StObject.set(x, "updateTableColumnProperties", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableColumnPropertiesUndefined: Self = StObject.set(x, "updateTableColumnProperties", js.undefined)
    
    inline def setUpdateTableRowStyle(value: SchemaUpdateTableRowStyleRequest): Self = StObject.set(x, "updateTableRowStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTableRowStyleUndefined: Self = StObject.set(x, "updateTableRowStyle", js.undefined)
    
    inline def setUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
  }
}
