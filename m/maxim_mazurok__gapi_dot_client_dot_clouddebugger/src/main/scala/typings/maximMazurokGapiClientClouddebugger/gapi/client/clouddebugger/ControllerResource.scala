package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ControllerResource extends js.Object {
  
  var debuggees: DebuggeesResource = js.native
}
object ControllerResource {
  
  @scala.inline
  def apply(debuggees: DebuggeesResource): ControllerResource = {
    val __obj = js.Dynamic.literal(debuggees = debuggees.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControllerResource]
  }
  
  @scala.inline
  implicit class ControllerResourceOps[Self <: ControllerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDebuggees(value: DebuggeesResource): Self = this.set("debuggees", value.asInstanceOf[js.Any])
  }
}
