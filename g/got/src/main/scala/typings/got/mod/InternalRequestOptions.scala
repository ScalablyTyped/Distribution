package typings.got.mod

import typings.node.httpsMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InternalRequestOptions
  extends StObject
     with RequestOptions {
  
  @JSName("agent")
  var agent_InternalRequestOptions: js.UndefOr[js.Any] = js.undefined
  
  // Redeclare options with `any` type for allow specify types incompatible with http.RequestOptions.
  @JSName("timeout")
  var timeout_InternalRequestOptions: js.UndefOr[js.Any] = js.undefined
}
object InternalRequestOptions {
  
  @scala.inline
  def apply(): InternalRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalRequestOptions]
  }
  
  @scala.inline
  implicit class InternalRequestOptionsMutableBuilder[Self <: InternalRequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAgent(value: js.Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    @scala.inline
    def setTimeout(value: js.Any): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
