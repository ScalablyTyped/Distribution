package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateActiveBreakpointRequest extends js.Object {
  
  /** Required. Updated breakpoint information. The field `id` must be set. The agent must echo all Breakpoint specification fields in the update. */
  var breakpoint: js.UndefOr[Breakpoint] = js.native
}
object UpdateActiveBreakpointRequest {
  
  @scala.inline
  def apply(): UpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActiveBreakpointRequest]
  }
  
  @scala.inline
  implicit class UpdateActiveBreakpointRequestOps[Self <: UpdateActiveBreakpointRequest] (val x: Self) extends AnyVal {
    
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
    def setBreakpoint(value: Breakpoint): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoint: Self = this.set("breakpoint", js.undefined)
  }
}
