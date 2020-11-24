package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListActiveBreakpointsResponse extends js.Object {
  
  /** List of all active breakpoints. The fields `id` and `location` are guaranteed to be set on each breakpoint. */
  var breakpoints: js.UndefOr[js.Array[Breakpoint]] = js.native
  
  /** A token that can be used in the next method call to block until the list of breakpoints changes. */
  var nextWaitToken: js.UndefOr[String] = js.native
  
  /**
    * If set to `true`, indicates that there is no change to the list of active breakpoints and the server-selected timeout has expired. The `breakpoints` field would be empty and should
    * be ignored.
    */
  var waitExpired: js.UndefOr[Boolean] = js.native
}
object ListActiveBreakpointsResponse {
  
  @scala.inline
  def apply(): ListActiveBreakpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListActiveBreakpointsResponse]
  }
  
  @scala.inline
  implicit class ListActiveBreakpointsResponseOps[Self <: ListActiveBreakpointsResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setWaitExpired(value: Boolean): Self = this.set("waitExpired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitExpired: Self = this.set("waitExpired", js.undefined)
  }
}
