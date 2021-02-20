package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateRowsResponse extends StObject {
  
  /** The updated rows. */
  var rows: js.UndefOr[js.Array[Row]] = js.native
}
object BatchUpdateRowsResponse {
  
  @scala.inline
  def apply(): BatchUpdateRowsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateRowsResponse]
  }
  
  @scala.inline
  implicit class BatchUpdateRowsResponseMutableBuilder[Self <: BatchUpdateRowsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRows(value: js.Array[Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setRowsVarargs(value: Row*): Self = StObject.set(x, "rows", js.Array(value :_*))
  }
}
