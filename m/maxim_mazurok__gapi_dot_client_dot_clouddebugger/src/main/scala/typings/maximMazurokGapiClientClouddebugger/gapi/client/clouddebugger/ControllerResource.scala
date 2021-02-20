package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerResource extends StObject {
  
  var debuggees: DebuggeesResource = js.native
}
object ControllerResource {
  
  @scala.inline
  def apply(debuggees: DebuggeesResource): ControllerResource = {
    val __obj = js.Dynamic.literal(debuggees = debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerResource]
  }
  
  @scala.inline
  implicit class ControllerResourceMutableBuilder[Self <: ControllerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggees(value: DebuggeesResource): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
  }
}
