package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRowsResponse extends StObject {
  
  /** The created rows. */
  var rows: js.UndefOr[js.Array[Row]] = js.undefined
}
object BatchCreateRowsResponse {
  
  @scala.inline
  def apply(): BatchCreateRowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateRowsResponse]
  }
  
  @scala.inline
  implicit class BatchCreateRowsResponseMutableBuilder[Self <: BatchCreateRowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
