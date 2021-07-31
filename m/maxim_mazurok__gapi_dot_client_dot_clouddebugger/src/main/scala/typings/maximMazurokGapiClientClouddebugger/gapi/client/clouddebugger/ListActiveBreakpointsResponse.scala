package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListActiveBreakpointsResponse extends StObject {
  
  /** List of all active breakpoints. The fields `id` and `location` are guaranteed to be set on each breakpoint. */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.undefined
  
  /** A token that can be used in the next method call to block until the list of breakpoints changes. */
  var nextWaitToken: js.UndefOr[String] = js.undefined
  
  /**
    * If set to `true`, indicates that there is no change to the list of active breakpoints and the server-selected timeout has expired. The `breakpoints` field would be empty and should
    * be ignored.
    */
  var waitExpired: js.UndefOr[Boolean] = js.undefined
}
object ListActiveBreakpointsResponse {
  
  @scala.inline
  def apply(): ListActiveBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveBreakpointsResponse]
  }
  
  @scala.inline
  implicit class ListActiveBreakpointsResponseMutableBuilder[Self <: ListActiveBreakpointsResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setWaitExpired(value: Boolean): Self = StObject.set(x, "waitExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitExpiredUndefined: Self = StObject.set(x, "waitExpired", js.undefined)
  }
}
