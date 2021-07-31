package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /** List of columns in this table. Order of columns matches the display order. */
  var columns: js.UndefOr[js.Array[ColumnDescription]] = js.undefined
  
  /** The human readable title of the table. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The resource name of the table. Table names have the form `tables/{table}`. */
  var name: js.UndefOr[String] = js.undefined
}
object Table {
  
  @scala.inline
  def apply(): Table = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table]
  }
  
  @scala.inline
  implicit class TableMutableBuilder[Self <: Table] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumns(value: js.Array[ColumnDescription]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: ColumnDescription*): Self = StObject.set(x, "columns", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
