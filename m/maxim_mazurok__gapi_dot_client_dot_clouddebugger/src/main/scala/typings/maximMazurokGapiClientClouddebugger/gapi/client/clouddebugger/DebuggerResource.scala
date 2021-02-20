package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebuggerResource extends StObject {
  
  var debuggees: DebuggeesResource = js.native
}
object DebuggerResource {
  
  @scala.inline
  def apply(debuggees: DebuggeesResource): DebuggerResource = {
    val __obj = js.Dynamic.literal(debuggees = debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebuggerResource]
  }
  
  @scala.inline
  implicit class DebuggerResourceMutableBuilder[Self <: DebuggerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggees(value: DebuggeesResource): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
  }
}
