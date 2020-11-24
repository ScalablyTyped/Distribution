package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  
  @scala.inline
  implicit class SchemaTableRowOps[Self <: SchemaTableRow] (val x: Self) extends AnyVal {
    
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
    def setEndIndex(value: Double): Self = this.set("endIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndIndex: Self = this.set("endIndex", js.undefined)
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    
    @scala.inline
    def setSuggestedDeletionIdsVarargs(value: String*): Self = this.set("suggestedDeletionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedDeletionIds(value: js.Array[String]): Self = this.set("suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedDeletionIds: Self = this.set("suggestedDeletionIds", js.undefined)
    
    @scala.inline
    def setSuggestedInsertionIdsVarargs(value: String*): Self = this.set("suggestedInsertionIds", js.Array(value :_*))
    
    @scala.inline
    def setSuggestedInsertionIds(value: js.Array[String]): Self = this.set("suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedInsertionIds: Self = this.set("suggestedInsertionIds", js.undefined)
    
    @scala.inline
    def setSuggestedTableRowStyleChanges(value: StringDictionary[SchemaSuggestedTableRowStyle]): Self = this.set("suggestedTableRowStyleChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestedTableRowStyleChanges: Self = this.set("suggestedTableRowStyleChanges", js.undefined)
    
    @scala.inline
    def setTableCellsVarargs(value: SchemaTableCell*): Self = this.set("tableCells", js.Array(value :_*))
    
    @scala.inline
    def setTableCells(value: js.Array[SchemaTableCell]): Self = this.set("tableCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCells: Self = this.set("tableCells", js.undefined)
    
    @scala.inline
    def setTableRowStyle(value: SchemaTableRowStyle): Self = this.set("tableRowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRowStyle: Self = this.set("tableRowStyle", js.undefined)
  }
}
