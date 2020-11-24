package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpHeaderAction extends js.Object {
  
  /** Headers to add to a matching request prior to forwarding the request to the backendService. */
  var requestHeadersToAdd: js.UndefOr[js.Array[HttpHeaderOption]] = js.native
  
  /** A list of header names for headers that need to be removed from the request prior to forwarding the request to the backendService. */
  var requestHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
  
  /** Headers to add the response prior to sending the response back to the client. */
  var responseHeadersToAdd: js.UndefOr[js.Array[HttpHeaderOption]] = js.native
  
  /** A list of header names for headers that need to be removed from the response prior to sending the response back to the client. */
  var responseHeadersToRemove: js.UndefOr[js.Array[String]] = js.native
}
object HttpHeaderAction {
  
  @scala.inline
  def apply(): HttpHeaderAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpHeaderAction]
  }
  
  @scala.inline
  implicit class HttpHeaderActionOps[Self <: HttpHeaderAction] (val x: Self) extends AnyVal {
    
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
    def setRequestHeadersToAddVarargs(value: HttpHeaderOption*): Self = this.set("requestHeadersToAdd", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeadersToAdd(value: js.Array[HttpHeaderOption]): Self = this.set("requestHeadersToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeadersToAdd: Self = this.set("requestHeadersToAdd", js.undefined)
    
    @scala.inline
    def setRequestHeadersToRemoveVarargs(value: String*): Self = this.set("requestHeadersToRemove", js.Array(value :_*))
    
    @scala.inline
    def setRequestHeadersToRemove(value: js.Array[String]): Self = this.set("requestHeadersToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestHeadersToRemove: Self = this.set("requestHeadersToRemove", js.undefined)
    
    @scala.inline
    def setResponseHeadersToAddVarargs(value: HttpHeaderOption*): Self = this.set("responseHeadersToAdd", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeadersToAdd(value: js.Array[HttpHeaderOption]): Self = this.set("responseHeadersToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeadersToAdd: Self = this.set("responseHeadersToAdd", js.undefined)
    
    @scala.inline
    def setResponseHeadersToRemoveVarargs(value: String*): Self = this.set("responseHeadersToRemove", js.Array(value :_*))
    
    @scala.inline
    def setResponseHeadersToRemove(value: js.Array[String]): Self = this.set("responseHeadersToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseHeadersToRemove: Self = this.set("responseHeadersToRemove", js.undefined)
  }
}
