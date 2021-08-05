package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerResource extends StObject {
  
  var debuggees: DebuggeesResource
}
object ControllerResource {
  
  inline def apply(debuggees: DebuggeesResource): ControllerResource = {
    val __obj = js.Dynamic.literal(debuggees = debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerResource]
  }
  
  extension [Self <: ControllerResource](x: Self) {
    
    inline def setDebuggees(value: DebuggeesResource): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
  }
}
