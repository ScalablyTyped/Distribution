package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardingRulesScopedList extends StObject {
  
  /** A list of forwarding rules contained in this scope. */
  var forwardingRules: js.UndefOr[js.Array[ForwardingRule]] = js.undefined
  
  /** Informational warning which replaces the list of forwarding rules when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object ForwardingRulesScopedList {
  
  inline def apply(): ForwardingRulesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ForwardingRulesScopedList]
  }
  
  extension [Self <: ForwardingRulesScopedList](x: Self) {
    
    inline def setForwardingRules(value: js.Array[ForwardingRule]): Self = StObject.set(x, "forwardingRules", value.asInstanceOf[js.Any])
    
    inline def setForwardingRulesUndefined: Self = StObject.set(x, "forwardingRules", js.undefined)
    
    inline def setForwardingRulesVarargs(value: ForwardingRule*): Self = StObject.set(x, "forwardingRules", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
