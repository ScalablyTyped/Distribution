package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table extends StObject {
  
  /** Headers of the table's columns. Optional: if not set then the table has only one dimension. */
  var columnHeaders: js.UndefOr[Headers] = js.native
  
  /** Name of the table. Required for subtables, ignored for the main table. */
  var name: js.UndefOr[String] = js.native
  
  /** Headers of the table's rows. Required. */
  var rowHeaders: js.UndefOr[Headers] = js.native
  
  /** The list of rows that constitute the table. Must have the same length as `rowHeaders`. Required. */
  var rows: js.UndefOr[js.Array[Row]] = js.native
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
    def setColumnHeaders(value: Headers): Self = StObject.set(x, "columnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnHeadersUndefined: Self = StObject.set(x, "columnHeaders", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setRowHeaders(value: Headers): Self = StObject.set(x, "rowHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowHeadersUndefined: Self = StObject.set(x, "rowHeaders", js.undefined)
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
