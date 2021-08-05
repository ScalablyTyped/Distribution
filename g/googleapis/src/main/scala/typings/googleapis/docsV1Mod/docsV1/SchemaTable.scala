package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A StructuralElement representing a table.
  */
trait SchemaTable extends StObject {
  
  /**
    * Number of columns in the table.  It is possible for a table to be
    * non-rectangular, so some rows may have a different number of cells.
    */
  var columns: js.UndefOr[Double] = js.undefined
  
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * The suggested deletion IDs. If empty, then there are no suggested
    * deletions of this content.
    */
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The suggested insertion IDs. A Table may have multiple insertion IDs if
    * it is a nested suggested change. If empty, then this is not a suggested
    * insertion.
    */
  var suggestedInsertionIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The contents and style of each row.
    */
  var tableRows: js.UndefOr[js.Array[SchemaTableRow]] = js.undefined
  
  /**
    * The style of the table.
    */
  var tableStyle: js.UndefOr[SchemaTableStyle] = js.undefined
}
object SchemaTable {
  
  inline def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  extension [Self <: SchemaTable](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSuggestedDeletionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedDeletionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedDeletionIdsUndefined: Self = StObject.set(x, "suggestedDeletionIds", js.undefined)
    
    inline def setSuggestedDeletionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedDeletionIds", js.Array(value :_*))
    
    inline def setSuggestedInsertionIds(value: js.Array[String]): Self = StObject.set(x, "suggestedInsertionIds", value.asInstanceOf[js.Any])
    
    inline def setSuggestedInsertionIdsUndefined: Self = StObject.set(x, "suggestedInsertionIds", js.undefined)
    
    inline def setSuggestedInsertionIdsVarargs(value: String*): Self = StObject.set(x, "suggestedInsertionIds", js.Array(value :_*))
    
    inline def setTableRows(value: js.Array[SchemaTableRow]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
    
    inline def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
    
    inline def setTableRowsVarargs(value: SchemaTableRow*): Self = StObject.set(x, "tableRows", js.Array(value :_*))
    
    inline def setTableStyle(value: SchemaTableStyle): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
    
    inline def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
  }
}
