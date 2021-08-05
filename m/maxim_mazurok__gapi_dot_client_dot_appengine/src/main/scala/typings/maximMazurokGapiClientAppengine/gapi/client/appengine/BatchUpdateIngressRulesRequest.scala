package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateIngressRulesRequest extends StObject {
  
  /** A list of FirewallRules to replace the existing set. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.undefined
}
object BatchUpdateIngressRulesRequest {
  
  inline def apply(): BatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateIngressRulesRequest]
  }
  
  extension [Self <: BatchUpdateIngressRulesRequest](x: Self) {
    
    inline def setIngressRules(value: js.Array[FirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    inline def setIngressRulesVarargs(value: FirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
