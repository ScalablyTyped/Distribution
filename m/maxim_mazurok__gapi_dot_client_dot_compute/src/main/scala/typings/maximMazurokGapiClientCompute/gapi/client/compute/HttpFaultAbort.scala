package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpFaultAbort extends js.Object {
  
  /**
    * The HTTP status code used to abort the request.
    * The value must be between 200 and 599 inclusive.
    */
  var httpStatus: js.UndefOr[Double] = js.native
  
  /**
    * The percentage of traffic (connections/operations/requests) which will be aborted as part of fault injection.
    * The value must be between 0.0 and 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}
object HttpFaultAbort {
  
  @scala.inline
  def apply(): HttpFaultAbort = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultAbort]
  }
  
  @scala.inline
  implicit class HttpFaultAbortOps[Self <: HttpFaultAbort] (val x: Self) extends AnyVal {
    
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
    def setHttpStatus(value: Double): Self = this.set("httpStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpStatus: Self = this.set("httpStatus", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
  }
}
