package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTable extends StObject {
  
  /**
    * Number of columns in the table.
    */
  var columns: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Properties of horizontal cell borders. A table's horizontal cell borders are represented as a grid. The grid has one more row than the number of rows in the table and the same number of columns as the table. For example, if the table is 3 x 3, its horizontal borders will be represented as a grid with 4 rows and 3 columns.
    */
  var horizontalBorderRows: js.UndefOr[js.Array[SchemaTableBorderRow]] = js.undefined
  
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Properties of each column.
    */
  var tableColumns: js.UndefOr[js.Array[SchemaTableColumnProperties]] = js.undefined
  
  /**
    * Properties and contents of each row. Cells that span multiple rows are contained in only one of these rows and have a row_span greater than 1.
    */
  var tableRows: js.UndefOr[js.Array[SchemaTableRow]] = js.undefined
  
  /**
    * Properties of vertical cell borders. A table's vertical cell borders are represented as a grid. The grid has the same number of rows as the table and one more column than the number of columns in the table. For example, if the table is 3 x 3, its vertical borders will be represented as a grid with 3 rows and 4 columns.
    */
  var verticalBorderRows: js.UndefOr[js.Array[SchemaTableBorderRow]] = js.undefined
}
object SchemaTable {
  
  inline def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  extension [Self <: SchemaTable](x: Self) {
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsNull: Self = StObject.set(x, "columns", null)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setHorizontalBorderRows(value: js.Array[SchemaTableBorderRow]): Self = StObject.set(x, "horizontalBorderRows", value.asInstanceOf[js.Any])
    
    inline def setHorizontalBorderRowsUndefined: Self = StObject.set(x, "horizontalBorderRows", js.undefined)
    
    inline def setHorizontalBorderRowsVarargs(value: SchemaTableBorderRow*): Self = StObject.set(x, "horizontalBorderRows", js.Array(value*))
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsNull: Self = StObject.set(x, "rows", null)
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setTableColumns(value: js.Array[SchemaTableColumnProperties]): Self = StObject.set(x, "tableColumns", value.asInstanceOf[js.Any])
    
    inline def setTableColumnsUndefined: Self = StObject.set(x, "tableColumns", js.undefined)
    
    inline def setTableColumnsVarargs(value: SchemaTableColumnProperties*): Self = StObject.set(x, "tableColumns", js.Array(value*))
    
    inline def setTableRows(value: js.Array[SchemaTableRow]): Self = StObject.set(x, "tableRows", value.asInstanceOf[js.Any])
    
    inline def setTableRowsUndefined: Self = StObject.set(x, "tableRows", js.undefined)
    
    inline def setTableRowsVarargs(value: SchemaTableRow*): Self = StObject.set(x, "tableRows", js.Array(value*))
    
    inline def setVerticalBorderRows(value: js.Array[SchemaTableBorderRow]): Self = StObject.set(x, "verticalBorderRows", value.asInstanceOf[js.Any])
    
    inline def setVerticalBorderRowsUndefined: Self = StObject.set(x, "verticalBorderRows", js.undefined)
    
    inline def setVerticalBorderRowsVarargs(value: SchemaTableBorderRow*): Self = StObject.set(x, "verticalBorderRows", js.Array(value*))
  }
}
