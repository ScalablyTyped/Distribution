package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBreakpointResponse extends StObject {
  
  /** Complete breakpoint state. The fields `id` and `location` are guaranteed to be set. */
  var breakpoint: js.UndefOr[Breakpoint] = js.native
}
object GetBreakpointResponse {
  
  @scala.inline
  def apply(): GetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBreakpointResponse]
  }
  
  @scala.inline
  implicit class GetBreakpointResponseMutableBuilder[Self <: GetBreakpointResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
