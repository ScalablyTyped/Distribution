package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Properties and contents of each row in a table.
  */
trait SchemaTableRow extends StObject {
  
  /**
    * Height of a row.
    */
  var rowHeight: js.UndefOr[SchemaDimension] = js.undefined
  
  /**
    * Properties and contents of each cell.  Cells that span multiple columns
    * are represented only once with a column_span greater than 1. As a result,
    * the length of this collection does not always match the number of columns
    * of the entire table.
    */
  var tableCells: js.UndefOr[js.Array[SchemaTableCell]] = js.undefined
  
  /**
    * Properties of the row.
    */
  var tableRowProperties: js.UndefOr[SchemaTableRowProperties] = js.undefined
}
object SchemaTableRow {
  
  inline def apply(): SchemaTableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableRow]
  }
  
  extension [Self <: SchemaTableRow](x: Self) {
    
    inline def setRowHeight(value: SchemaDimension): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
    
    inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    
    inline def setTableCells(value: js.Array[SchemaTableCell]): Self = StObject.set(x, "tableCells", value.asInstanceOf[js.Any])
    
    inline def setTableCellsUndefined: Self = StObject.set(x, "tableCells", js.undefined)
    
    inline def setTableCellsVarargs(value: SchemaTableCell*): Self = StObject.set(x, "tableCells", js.Array(value :_*))
    
    inline def setTableRowProperties(value: SchemaTableRowProperties): Self = StObject.set(x, "tableRowProperties", value.asInstanceOf[js.Any])
    
    inline def setTableRowPropertiesUndefined: Self = StObject.set(x, "tableRowProperties", js.undefined)
  }
}
