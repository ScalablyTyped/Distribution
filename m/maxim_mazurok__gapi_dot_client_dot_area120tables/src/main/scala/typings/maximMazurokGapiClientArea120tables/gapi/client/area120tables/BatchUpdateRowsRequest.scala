package typings.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateRowsRequest extends js.Object {
  
  /** Required. The request messages specifying the rows to update. A maximum of 500 rows can be modified in a single batch. */
  var requests: js.UndefOr[js.Array[UpdateRowRequest]] = js.native
}
object BatchUpdateRowsRequest {
  
  @scala.inline
  def apply(): BatchUpdateRowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateRowsRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateRowsRequestOps[Self <: BatchUpdateRowsRequest] (val x: Self) extends AnyVal {
    
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
    def setRequestsVarargs(value: UpdateRowRequest*): Self = this.set("requests", js.Array(value :_*))
    
    @scala.inline
    def setRequests(value: js.Array[UpdateRowRequest]): Self = this.set("requests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequests: Self = this.set("requests", js.undefined)
  }
}
