package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PageElement kind representing a table.
  */
@js.native
trait SchemaTable extends js.Object {
  
  /**
    * Number of columns in the table.
    */
  var columns: js.UndefOr[Double] = js.native
  
  /**
    * Properties of horizontal cell borders.  A table&#39;s horizontal cell
    * borders are represented as a grid. The grid has one more row than the
    * number of rows in the table and the same number of columns as the table.
    * For example, if the table is 3 x 3, its horizontal borders will be
    * represented as a grid with 4 rows and 3 columns.
    */
  var horizontalBorderRows: js.UndefOr[js.Array[SchemaTableBorderRow]] = js.native
  
  /**
    * Number of rows in the table.
    */
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Properties of each column.
    */
  var tableColumns: js.UndefOr[js.Array[SchemaTableColumnProperties]] = js.native
  
  /**
    * Properties and contents of each row.  Cells that span multiple rows are
    * contained in only one of these rows and have a row_span greater than 1.
    */
  var tableRows: js.UndefOr[js.Array[SchemaTableRow]] = js.native
  
  /**
    * Properties of vertical cell borders.  A table&#39;s vertical cell borders
    * are represented as a grid. The grid has the same number of rows as the
    * table and one more column than the number of columns in the table. For
    * example, if the table is 3 x 3, its vertical borders will be represented
    * as a grid with 3 rows and 4 columns.
    */
  var verticalBorderRows: js.UndefOr[js.Array[SchemaTableBorderRow]] = js.native
}
object SchemaTable {
  
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  @scala.inline
  implicit class SchemaTableOps[Self <: SchemaTable] (val x: Self) extends AnyVal {
    
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setHorizontalBorderRowsVarargs(value: SchemaTableBorderRow*): Self = this.set("horizontalBorderRows", js.Array(value :_*))
    
    @scala.inline
    def setHorizontalBorderRows(value: js.Array[SchemaTableBorderRow]): Self = this.set("horizontalBorderRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalBorderRows: Self = this.set("horizontalBorderRows", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setTableColumnsVarargs(value: SchemaTableColumnProperties*): Self = this.set("tableColumns", js.Array(value :_*))
    
    @scala.inline
    def setTableColumns(value: js.Array[SchemaTableColumnProperties]): Self = this.set("tableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableColumns: Self = this.set("tableColumns", js.undefined)
    
    @scala.inline
    def setTableRowsVarargs(value: SchemaTableRow*): Self = this.set("tableRows", js.Array(value :_*))
    
    @scala.inline
    def setTableRows(value: js.Array[SchemaTableRow]): Self = this.set("tableRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableRows: Self = this.set("tableRows", js.undefined)
    
    @scala.inline
    def setVerticalBorderRowsVarargs(value: SchemaTableBorderRow*): Self = this.set("verticalBorderRows", js.Array(value :_*))
    
    @scala.inline
    def setVerticalBorderRows(value: js.Array[SchemaTableBorderRow]): Self = this.set("verticalBorderRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalBorderRows: Self = this.set("verticalBorderRows", js.undefined)
  }
}
