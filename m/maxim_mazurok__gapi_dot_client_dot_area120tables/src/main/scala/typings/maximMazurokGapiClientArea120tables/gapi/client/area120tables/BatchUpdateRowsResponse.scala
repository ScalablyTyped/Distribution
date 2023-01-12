package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateRowsResponse extends StObject {
  
  /** The updated rows. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}
object BatchUpdateRowsResponse {
  
  inline def apply(): BatchUpdateRowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateRowsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchUpdateRowsResponse] (val x: Self) extends AnyVal {
    
    inline def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
