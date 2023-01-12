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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebuggerResource] (val x: Self) extends AnyVal {
    
    inline def setDebuggees(value: DebuggeesResource): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
  }
}
