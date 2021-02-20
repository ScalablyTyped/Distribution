package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single update to apply to a document.
  */
@js.native
trait SchemaRequest extends StObject {
  
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
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  @scala.inline
  implicit class SchemaRequestMutableBuilder[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateNamedRange(value: SchemaCreateNamedRangeRequest): Self = StObject.set(x, "createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateNamedRangeUndefined: Self = StObject.set(x, "createNamedRange", js.undefined)
    
    @scala.inline
    def setCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = StObject.set(x, "createParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateParagraphBulletsUndefined: Self = StObject.set(x, "createParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeleteContentRange(value: SchemaDeleteContentRangeRequest): Self = StObject.set(x, "deleteContentRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteContentRangeUndefined: Self = StObject.set(x, "deleteContentRange", js.undefined)
    
    @scala.inline
    def setDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = StObject.set(x, "deleteNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteNamedRangeUndefined: Self = StObject.set(x, "deleteNamedRange", js.undefined)
    
    @scala.inline
    def setDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = StObject.set(x, "deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteParagraphBulletsUndefined: Self = StObject.set(x, "deleteParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeletePositionedObject(value: SchemaDeletePositionedObjectRequest): Self = StObject.set(x, "deletePositionedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePositionedObjectUndefined: Self = StObject.set(x, "deletePositionedObject", js.undefined)
    
    @scala.inline
    def setDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = StObject.set(x, "deleteTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableColumnUndefined: Self = StObject.set(x, "deleteTableColumn", js.undefined)
    
    @scala.inline
    def setDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = StObject.set(x, "deleteTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteTableRowUndefined: Self = StObject.set(x, "deleteTableRow", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: SchemaInsertInlineImageRequest): Self = StObject.set(x, "insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertInlineImageUndefined: Self = StObject.set(x, "insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertPageBreak(value: SchemaInsertPageBreakRequest): Self = StObject.set(x, "insertPageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertPageBreakUndefined: Self = StObject.set(x, "insertPageBreak", js.undefined)
    
    @scala.inline
    def setInsertTable(value: SchemaInsertTableRequest): Self = StObject.set(x, "insertTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableRow(value: SchemaInsertTableRowRequest): Self = StObject.set(x, "insertTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTableRowUndefined: Self = StObject.set(x, "insertTableRow", js.undefined)
    
    @scala.inline
    def setInsertTableUndefined: Self = StObject.set(x, "insertTable", js.undefined)
    
    @scala.inline
    def setInsertText(value: SchemaInsertTextRequest): Self = StObject.set(x, "insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertTextUndefined: Self = StObject.set(x, "insertText", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextRequest): Self = StObject.set(x, "replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplaceAllTextUndefined: Self = StObject.set(x, "replaceAllText", js.undefined)
    
    @scala.inline
    def setUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = StObject.set(x, "updateParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateParagraphStyleUndefined: Self = StObject.set(x, "updateParagraphStyle", js.undefined)
    
    @scala.inline
    def setUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = StObject.set(x, "updateTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTextStyleUndefined: Self = StObject.set(x, "updateTextStyle", js.undefined)
  }
}
