package typings.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDebuggeeResponse extends StObject {
  
  /** A unique ID generated for the agent. Each RegisterDebuggee request will generate a new agent ID. */
  var agentId: js.UndefOr[String] = js.undefined
  
  /**
    * Debuggee resource. The field `id` is guaranteed to be set (in addition to the echoed fields). If the field `is_disabled` is set to `true`, the agent should disable itself by
    * removing all breakpoints and detaching from the application. It should however continue to poll `RegisterDebuggee` until reenabled.
    */
  var debuggee: js.UndefOr[Debuggee] = js.undefined
}
object RegisterDebuggeeResponse {
  
  inline def apply(): RegisterDebuggeeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterDebuggeeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterDebuggeeResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: String): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setDebuggee(value: Debuggee): Self = StObject.set(x, "debuggee", value.asInstanceOf[js.Any])
    
    inline def setDebuggeeUndefined: Self = StObject.set(x, "debuggee", js.undefined)
  }
}
