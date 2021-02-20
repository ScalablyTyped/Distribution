package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchCreateRowsRequest extends StObject {
  
  /** Required. The request message specifying the rows to create. A maximum of 500 rows can be created in a single batch. */
  var requests: js.UndefOr[js.Array[CreateRowRequest]] = js.native
}
object BatchCreateRowsRequest {
  
  @scala.inline
  def apply(): BatchCreateRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCreateRowsRequest]
  }
  
  @scala.inline
  implicit class BatchCreateRowsRequestMutableBuilder[Self <: BatchCreateRowsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRequests(value: js.Array[CreateRowRequest]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
    
    @scala.inline
    def setRequestsVarargs(value: CreateRowRequest*): Self = StObject.set(x, "requests", js.Array(value :_*))
  }
}
