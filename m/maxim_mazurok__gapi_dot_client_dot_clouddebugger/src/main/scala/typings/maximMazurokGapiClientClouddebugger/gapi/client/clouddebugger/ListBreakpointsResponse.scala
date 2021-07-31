package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBreakpointsResponse extends StObject {
  
  /**
    * List of breakpoints matching the request. The fields `id` and `location` are guaranteed to be set on each breakpoint. The fields: `stack_frames`, `evaluated_expressions` and
    * `variable_table` are cleared on each breakpoint regardless of its status.
    */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  
  /** A wait token that can be used in the next call to `list` (REST) or `ListBreakpoints` (RPC) to block until the list of breakpoints has changes. */
  var nextWaitToken: js.UndefOr[String] = js.undefined
}
object ListBreakpointsResponse {
  
  @scala.inline
  def apply(): ListBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBreakpointsResponse]
  }
  
  @scala.inline
  implicit class ListBreakpointsResponseMutableBuilder[Self <: ListBreakpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoints(value: js.Array[Breakpoint]): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointsUndefined: Self = StObject.set(x, "breakpoints", js.undefined)
    
    @scala.inline
    def setBreakpointsVarargs(value: Breakpoint*): Self = StObject.set(x, "breakpoints", js.Array(value :_*))
    
    @scala.inline
    def setNextWaitToken(value: String): Self = StObject.set(x, "nextWaitToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextWaitTokenUndefined: Self = StObject.set(x, "nextWaitToken", js.undefined)
  }
}
