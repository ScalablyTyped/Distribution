package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateRowsRequest extends StObject {
  
  /** Required. The request messages specifying the rows to update. A maximum of 500 rows can be modified in a single batch. */
  var requests: js.UndefOr[js.Array[UpdateRowRequest]] = js.undefined
}
object BatchUpdateRowsRequest {
  
  inline def apply(): BatchUpdateRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateRowsRequest]
  }
  
  extension [Self <: BatchUpdateRowsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[UpdateRowRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: UpdateRowRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
