package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The contents and style of a row in a Table.
  */
trait SchemaTableRow extends StObject {
  
  /**
    * The zero-based end index of this row, exclusive, in UTF-16 code units.
    */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The zero-based start index of this row, in UTF-16 code units.
    */
  var startIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested insertion IDs. A TableRow may have multiple insertion IDs
    * if it is a nested suggested change. If empty, then this is not a
    * suggested insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested style changes to this row, keyed by suggestion ID.
    */
  var suggestedTableRowStyleChanges: js.UndefOr[StringDictionary[SchemaSuggestedTableRowStyle]] = js.undefined
  
  /**
    * The contents and style of each cell in this row.  It is possible for a
    * table to be non-rectangular, so some rows may have a different number of
    * cells than other rows in the same table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.undefined
  
  /**
    * The style of the table row.
    */
  var tableRowStyle: js.UndefOr[SchemaTableRowStyle] = js.undefined
}
object SchemaTableRow {
  
  @scala.inline
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  
  @scala.inline
  implicit class SchemaTableRowMutableBuilder[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
    
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
    def setSuggestedTableRowStyleChanges(value: StringDictionary[SchemaSuggestedTableRowStyle]): Self = StObject.set(x, "suggestedTableRowStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedTableRowStyleChangesUndefined: Self = StObject.set(x, "suggestedTableRowStyleChanges", js.undefined)
    
    @scala.inline
    def setTableCells(value: js.Array[SchemaTableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
    
    @scala.inline
    def setTableCellsVarargs(value: SchemaTableCell*): Self = StObject.set(x, "tableCells", js.Array(value :_*))
    
    @scala.inline
    def setTableRowStyle(value: SchemaTableRowStyle): Self = StObject.set(x, "tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableRowStyleUndefined: Self = StObject.set(x, "tableRowStyle", js.undefined)
  }
}
