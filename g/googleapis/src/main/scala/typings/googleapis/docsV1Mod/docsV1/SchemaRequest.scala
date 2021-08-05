package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single update to apply to a document.
  */
trait SchemaRequest extends StObject {
  
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
    * Inserts a table at the specified location.
    */
  var insertTable: js.UndefOr[SchemaInsertTableRequest] = js.undefined
  
  /**
    * Inserts an empty row into a table.
    */
  var insertTableRow: js.UndefOr[SchemaInsertTableRowRequest] = js.undefined
  
  /**
    * Inserts text at the specified location.
    */
  var insertText: js.UndefOr[SchemaInsertTextRequest] = js.undefined
  
  /**
    * Replaces all instances of the specified text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextRequest] = js.undefined
  
  /**
    * Updates the paragraph style at the specified range.
    */
  var updateParagraphStyle: js.UndefOr[SchemaUpdateParagraphStyleRequest] = js.undefined
  
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
    
    inline def setCreateNamedRange(value: SchemaCreateNamedRangeRequest): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    inline def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    inline def setCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    inline def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    inline def setDeleteContentRange(value: SchemaDeleteContentRangeRequest): Self = StObject.set(x, "deleteContentRange", value.asInstanceOf[js.Any])
    
    inline def setDeleteContentRangeUndefined: Self = StObject.set(x, "deleteContentRange", js.undefined)
    
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
    
    inline def setInsertTable(value: SchemaInsertTableRequest): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRow(value: SchemaInsertTableRowRequest): Self = StObject.set(x, "insertTableRow", value.asInstanceOf[js.Any])
    
    inline def setInsertTableRowUndefined: Self = StObject.set(x, "insertTableRow", js.undefined)
    
    inline def setInsertTableUndefined: Self = StObject.set(x, "insertTable", js.undefined)
    
    inline def setInsertText(value: SchemaInsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    inline def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    inline def setReplaceAllText(value: SchemaReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    inline def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    inline def setUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    inline def setUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    inline def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
  }
}
