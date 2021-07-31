package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTable extends StObject {
  
  /**
    * Headers of the table&#39;s columns. Optional: if not set then the table
    * has only one dimension.
    */
  var columnHeaders: js.UndefOr[SchemaHeaders] = js.undefined
  
  /**
    * Name of the table. Required for subtables, ignored for the main table.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Headers of the table&#39;s rows. Required.
    */
  var rowHeaders: js.UndefOr[SchemaHeaders] = js.undefined
  
  /**
    * The list of rows that constitute the table. Must have the same length as
    * rowHeaders. Required.
    */
  var rows: js.UndefOr[js.Array[SchemaRow]] = js.undefined
}
object SchemaTable {
  
  @scala.inline
  def apply(): SchemaTable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTable]
  }
  
  @scala.inline
  implicit class SchemaTableMutableBuilder[Self <: SchemaTable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnHeaders(value: SchemaHeaders): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRowHeaders(value: SchemaHeaders): Self = StObject.set(x, "rowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeadersUndefined: Self = StObject.set(x, "rowHeaders", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[SchemaRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: SchemaRow*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
