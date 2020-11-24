package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpFaultDelay extends js.Object {
  
  /** Specifies the value of the fixed delay interval. */
  var fixedDelay: js.UndefOr[Duration] = js.native
  
  /**
    * The percentage of traffic (connections/operations/requests) on which delay will be introduced as part of fault injection.
    * The value must be between 0.0 and 100.0 inclusive.
    */
  var percentage: js.UndefOr[Double] = js.native
}
object HttpFaultDelay {
  
  @scala.inline
  def apply(): HttpFaultDelay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpFaultDelay]
  }
  
  @scala.inline
  implicit class HttpFaultDelayOps[Self <: HttpFaultDelay] (val x: Self) extends AnyVal {
    
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
    def setFixedDelay(value: Duration): Self = this.set("fixedDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedDelay: Self = this.set("fixedDelay", js.undefined)
    
    @scala.inline
    def setPercentage(value: Double): Self = this.set("percentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentage: Self = this.set("percentage", js.undefined)
  }
}
