package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListBreakpointsResponse extends js.Object {
  
  /**
    * List of breakpoints matching the request. The fields `id` and `location` are guaranteed to be set on each breakpoint. The fields: `stack_frames`, `evaluated_expressions` and
    * `variable_table` are cleared on each breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.native
  
  /** A wait token that can be used in the next call to `list` (REST) or `ListBreakpoints` (RPC) to block until the list of breakpoints has changes. */
  var nextWaitToken: js.UndefOr[String] = js.native
}
object ListBreakpointsResponse {
  
  @scala.inline
  def apply(): ListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBreakpointsResponse]
  }
  
  @scala.inline
  implicit class ListBreakpointsResponseOps[Self <: ListBreakpointsResponse] (val x: Self) extends AnyVal {
    
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
    def setBreakpointsVarargs(value: Breakpoint*): Self = this.set("breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setBreakpoints(value: js.Array[Breakpoint]): Self = this.set("breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBreakpoints: Self = this.set("breakpoints", js.undefined)
    
    @scala.inline
    def setNextWaitToken(value: String): Self = this.set("nextWaitToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextWaitToken: Self = this.set("nextWaitToken", js.undefined)
  }
}
