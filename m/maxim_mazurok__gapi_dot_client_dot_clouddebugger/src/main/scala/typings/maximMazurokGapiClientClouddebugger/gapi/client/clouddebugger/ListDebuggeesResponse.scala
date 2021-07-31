package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDebuggeesResponse extends StObject {
  
  /**
    * List of debuggees accessible to the calling user. The fields `debuggee.id` and `description` are guaranteed to be set. The `description` field is a human readable field provided by
    * agents and can be displayed to users.
    */
  var debuggees: js.UndefOr[js.Array[Debuggee]] = js.undefined
}
object ListDebuggeesResponse {
  
  @scala.inline
  def apply(): ListDebuggeesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDebuggeesResponse]
  }
  
  @scala.inline
  implicit class ListDebuggeesResponseMutableBuilder[Self <: ListDebuggeesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDebuggees(value: js.Array[Debuggee]): Self = StObject.set(x, "debuggees", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDebuggeesUndefined: Self = StObject.set(x, "debuggees", js.undefined)
    
    @scala.inline
    def setDebuggeesVarargs(value: Debuggee*): Self = StObject.set(x, "debuggees", js.Array(value :_*))
  }
}
