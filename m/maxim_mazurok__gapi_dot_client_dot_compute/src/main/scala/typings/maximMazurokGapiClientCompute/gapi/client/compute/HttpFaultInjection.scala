package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpFaultInjection extends js.Object {
  
  /** The specification for how client requests are aborted as part of fault injection. */
  var abort: js.UndefOr[HttpFaultAbort] = js.native
  
  /** The specification for how client requests are delayed as part of fault injection, before being sent to a backend service. */
  var delay: js.UndefOr[HttpFaultDelay] = js.native
}
object HttpFaultInjection {
  
  @scala.inline
  def apply(): HttpFaultInjection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultInjection]
  }
  
  @scala.inline
  implicit class HttpFaultInjectionOps[Self <: HttpFaultInjection] (val x: Self) extends AnyVal {
    
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
    def setAbort(value: HttpFaultAbort): Self = this.set("abort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbort: Self = this.set("abort", js.undefined)
    
    @scala.inline
    def setDelay(value: HttpFaultDelay): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
  }
}
