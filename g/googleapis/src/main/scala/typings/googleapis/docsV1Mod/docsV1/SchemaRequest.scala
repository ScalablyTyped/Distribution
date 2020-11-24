package typings.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequest]
  }
  
  @scala.inline
  implicit class SchemaRequestOps[Self <: SchemaRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateNamedRange(value: SchemaCreateNamedRangeRequest): Self = this.set("createNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateNamedRange: Self = this.set("createNamedRange", js.undefined)
    
    @scala.inline
    def setCreateParagraphBullets(value: SchemaCreateParagraphBulletsRequest): Self = this.set("createParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateParagraphBullets: Self = this.set("createParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeleteContentRange(value: SchemaDeleteContentRangeRequest): Self = this.set("deleteContentRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteContentRange: Self = this.set("deleteContentRange", js.undefined)
    
    @scala.inline
    def setDeleteNamedRange(value: SchemaDeleteNamedRangeRequest): Self = this.set("deleteNamedRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteNamedRange: Self = this.set("deleteNamedRange", js.undefined)
    
    @scala.inline
    def setDeleteParagraphBullets(value: SchemaDeleteParagraphBulletsRequest): Self = this.set("deleteParagraphBullets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteParagraphBullets: Self = this.set("deleteParagraphBullets", js.undefined)
    
    @scala.inline
    def setDeletePositionedObject(value: SchemaDeletePositionedObjectRequest): Self = this.set("deletePositionedObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeletePositionedObject: Self = this.set("deletePositionedObject", js.undefined)
    
    @scala.inline
    def setDeleteTableColumn(value: SchemaDeleteTableColumnRequest): Self = this.set("deleteTableColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTableColumn: Self = this.set("deleteTableColumn", js.undefined)
    
    @scala.inline
    def setDeleteTableRow(value: SchemaDeleteTableRowRequest): Self = this.set("deleteTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleteTableRow: Self = this.set("deleteTableRow", js.undefined)
    
    @scala.inline
    def setInsertInlineImage(value: SchemaInsertInlineImageRequest): Self = this.set("insertInlineImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertInlineImage: Self = this.set("insertInlineImage", js.undefined)
    
    @scala.inline
    def setInsertPageBreak(value: SchemaInsertPageBreakRequest): Self = this.set("insertPageBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertPageBreak: Self = this.set("insertPageBreak", js.undefined)
    
    @scala.inline
    def setInsertTable(value: SchemaInsertTableRequest): Self = this.set("insertTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTable: Self = this.set("insertTable", js.undefined)
    
    @scala.inline
    def setInsertTableRow(value: SchemaInsertTableRowRequest): Self = this.set("insertTableRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertTableRow: Self = this.set("insertTableRow", js.undefined)
    
    @scala.inline
    def setInsertText(value: SchemaInsertTextRequest): Self = this.set("insertText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsertText: Self = this.set("insertText", js.undefined)
    
    @scala.inline
    def setReplaceAllText(value: SchemaReplaceAllTextRequest): Self = this.set("replaceAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplaceAllText: Self = this.set("replaceAllText", js.undefined)
    
    @scala.inline
    def setUpdateParagraphStyle(value: SchemaUpdateParagraphStyleRequest): Self = this.set("updateParagraphStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateParagraphStyle: Self = this.set("updateParagraphStyle", js.undefined)
    
    @scala.inline
    def setUpdateTextStyle(value: SchemaUpdateTextStyleRequest): Self = this.set("updateTextStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTextStyle: Self = this.set("updateTextStyle", js.undefined)
  }
}
