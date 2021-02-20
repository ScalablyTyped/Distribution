package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The contents and style of a cell in a Table.
  */
@js.native
trait SchemaTableCell extends StObject {
  
  /**
    * The content of the cell.
    */
  var content: js.UndefOr[js.Array[SchemaStructuralElement]] = js.native
  
  /**
    * The zero-based end index of this cell, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  
  /**
    * The zero-based start index of this cell, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested insertion IDs. A TableCell may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The suggested changes to the table cell style, keyed by suggestion ID.
    */
  var suggestedTableCellStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTableCellStyle]] = js.native
  
  /**
    * The style of the cell.
    */
  var tableCellStyle: js.UndefOr[SchemaTableCellStyle] = js.native
}
object SchemaTableCell {
  
  @scala.inline
  def apply(): SchemaTableCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableCell]
  }
  
  @scala.inline
  implicit class SchemaTableCellMutableBuilder[Self <: SchemaTableCell] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: js.Array[SchemaStructuralElement]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setContentVarargs(value: SchemaStructuralElement*): Self = StObject.set(x, "content", js.Array(value :_*))
    
    @scala.inline
    def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndexUndefined: Self = StObject.set(x, "startIndex", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedTableCellStyleChanges(value: StringDictionary[SchemaSuggestedTableCellStyle]): Self = StObject.set(x, "suggestedTableCellStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTableCellStyleChangesUndefined: Self = StObject.set(x, "suggestedTableCellStyleChanges", js.undefined)
    
    @scala.inline
    def setTableCellStyle(value: SchemaTableCellStyle): Self = StObject.set(x, "tableCellStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellStyleUndefined: Self = StObject.set(x, "tableCellStyle", js.undefined)
  }
}
