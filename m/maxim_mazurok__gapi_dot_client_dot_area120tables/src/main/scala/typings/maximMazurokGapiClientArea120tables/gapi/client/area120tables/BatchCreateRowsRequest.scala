package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCreateRowsRequest extends StObject {
  
  /** Required. The request message specifying the rows to create. A maximum of 500 rows can be created in a single batch. */
  var requests: js.UndefOr[js.Array[CreateRowRequest]] = js.undefined
}
object BatchCreateRowsRequest {
  
  inline def apply(): BatchCreateRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateRowsRequest]
  }
  
  extension [Self <: BatchCreateRowsRequest](x: Self) {
    
    inline def setRequests(value: js.Array[CreateRowRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    inline def setRequestsVarargs(value: CreateRowRequest*): Self = StObject.set(x, "requests", js.Array(value*))
  }
}
