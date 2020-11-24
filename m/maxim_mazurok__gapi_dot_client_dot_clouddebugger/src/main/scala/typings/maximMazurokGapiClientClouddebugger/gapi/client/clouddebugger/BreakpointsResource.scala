package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClouddebugger.anon.Accesstoken
import typings.maximMazurokGapiClientClouddebugger.anon.Actionvalue
import typings.maximMazurokGapiClientClouddebugger.anon.Alt
import typings.maximMazurokGapiClientClouddebugger.anon.BreakpointId
import typings.maximMazurokGapiClientClouddebugger.anon.Callback
import typings.maximMazurokGapiClientClouddebugger.anon.CanaryOption
import typings.maximMazurokGapiClientClouddebugger.anon.ClientVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BreakpointsResource extends js.Object {
  
  /** Deletes the breakpoint from the debuggee. */
  def delete(): Request[js.Object] = js.native
  def delete(request: BreakpointId): Request[js.Object] = js.native
  
  /** Gets breakpoint information. */
  def get(): Request[GetBreakpointResponse] = js.native
  def get(request: BreakpointId): Request[GetBreakpointResponse] = js.native
  
  /**
    * Returns the list of all active breakpoints for the debuggee. The breakpoint specification (`location`, `condition`, and `expressions` fields) is semantically immutable, although the
    * field values may change. For example, an agent may update the location line number to reflect the actual line where the breakpoint was set, but this doesn't change the breakpoint
    * semantics. This means that an agent does not need to check if a breakpoint has changed when it encounters the same breakpoint on a successive call. Moreover, an agent should
    * remember the breakpoints that are completed until the controller removes them from the active list to avoid setting those breakpoints again.
    */
  /** Lists all breakpoints for the debuggee. */
  def list(): Request[ListActiveBreakpointsResponse] = js.native
  def list(request: Accesstoken): Request[ListActiveBreakpointsResponse] = js.native
  def list(request: Actionvalue): Request[ListBreakpointsResponse] = js.native
  
  /** Sets the breakpoint to the debuggee. */
  def set(request: CanaryOption): Request[SetBreakpointResponse] = js.native
  def set(request: ClientVersion, body: Breakpoint): Request[SetBreakpointResponse] = js.native
  
  /**
    * Updates the breakpoint state or mutable fields. The entire Breakpoint message must be sent back to the controller service. Updates to active breakpoint fields are only allowed if
    * the new value does not change the breakpoint specification. Updates to the `location`, `condition` and `expressions` fields should not alter the breakpoint semantics. These may only
    * make changes such as canonicalizing a value or snapping the location to the correct line of code.
    */
  def update(request: Alt): Request[js.Object] = js.native
  def update(request: Callback, body: UpdateActiveBreakpointRequest): Request[js.Object] = js.native
}
