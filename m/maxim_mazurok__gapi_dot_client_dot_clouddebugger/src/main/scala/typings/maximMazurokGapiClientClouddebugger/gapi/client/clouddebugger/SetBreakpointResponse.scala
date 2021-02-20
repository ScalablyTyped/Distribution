package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBreakpointResponse extends StObject {
  
  /** Breakpoint resource. The field `id` is guaranteed to be set (in addition to the echoed fields). */
  var breakpoint: js.UndefOr[Breakpoint] = js.native
}
object SetBreakpointResponse {
  
  @scala.inline
  def apply(): SetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBreakpointResponse]
  }
  
  @scala.inline
  implicit class SetBreakpointResponseMutableBuilder[Self <: SetBreakpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
