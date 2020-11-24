package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientClouddebugger.anon.Fields
import typings.maximMazurokGapiClientClouddebugger.anon.IncludeInactive
import typings.maximMazurokGapiClientClouddebugger.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggeesResource extends js.Object {
  
  var breakpoints: BreakpointsResource = js.native
  
  /** Lists all the debuggees that the user has access to. */
  def list(): Request[ListDebuggeesResponse] = js.native
  def list(request: IncludeInactive): Request[ListDebuggeesResponse] = js.native
  
  /**
    * Registers the debuggee with the controller service. All agents attached to the same application must call this method with exactly the same request content to get back the same
    * stable `debuggee_id`. Agents should call this method again whenever `google.rpc.Code.NOT_FOUND` is returned from any controller method. This protocol allows the controller service
    * to disable debuggees, recover from data loss, or change the `debuggee_id` format. Agents must handle `debuggee_id` value changing upon re-registration.
    */
  def register(request: Fields): Request[RegisterDebuggeeResponse] = js.native
  def register(request: Key, body: RegisterDebuggeeRequest): Request[RegisterDebuggeeResponse] = js.native
}
