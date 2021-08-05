package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBreakpointResponse extends StObject {
  
  /** Complete breakpoint state. The fields `id` and `location` are guaranteed to be set. */
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
}
object GetBreakpointResponse {
  
  inline def apply(): GetBreakpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBreakpointResponse]
  }
  
  extension [Self <: GetBreakpointResponse](x: Self) {
    
    inline def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
