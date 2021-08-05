package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActiveBreakpointRequest extends StObject {
  
  /** Required. Updated breakpoint information. The field `id` must be set. The agent must echo all Breakpoint specification fields in the update. */
  var breakpoint: js.UndefOr[Breakpoint] = js.undefined
}
object UpdateActiveBreakpointRequest {
  
  inline def apply(): UpdateActiveBreakpointRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateActiveBreakpointRequest]
  }
  
  extension [Self <: UpdateActiveBreakpointRequest](x: Self) {
    
    inline def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
    
    inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
  }
}
