package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDebuggeesResponse extends js.Object {
  
  /**
    * List of debuggees accessible to the calling user. The fields `debuggee.id` and `description` are guaranteed to be set. The `description` field is a human readable field provided by
    * agents and can be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[Debuggee]] = js.native
}
object ListDebuggeesResponse {
  
  @scala.inline
  def apply(): ListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDebuggeesResponse]
  }
  
  @scala.inline
  implicit class ListDebuggeesResponseOps[Self <: ListDebuggeesResponse] (val x: Self) extends AnyVal {
    
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
    def setDebuggeesVarargs(value: Debuggee*): Self = this.set("debuggees", js.Array(value :_*))
    
    @scala.inline
    def setDebuggees(value: js.Array[Debuggee]): Self = this.set("debuggees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebuggees: Self = this.set("debuggees", js.undefined)
  }
}
