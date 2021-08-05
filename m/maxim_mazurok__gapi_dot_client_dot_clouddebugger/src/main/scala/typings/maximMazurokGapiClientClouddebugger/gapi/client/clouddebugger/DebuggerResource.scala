package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebuggerResource extends StObject {
  
  var debuggees: DebuggeesResource
}
object DebuggerResource {
  
  inline def apply(debuggees: DebuggeesResource): DebuggerResource = {
    val __obj = js.Dynamic.literal(debuggees = debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerResource]
  }
  
  extension [Self <: DebuggerResource](x: Self) {
    
    inline def setDebuggees(value: DebuggeesResource): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
  }
}
