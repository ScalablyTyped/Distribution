package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateIngressRulesResponse extends StObject {
  
  /** The full list of ingress FirewallRules for this application. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.undefined
}
object BatchUpdateIngressRulesResponse {
  
  inline def apply(): BatchUpdateIngressRulesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateIngressRulesResponse]
  }
  
  extension [Self <: BatchUpdateIngressRulesResponse](x: Self) {
    
    inline def setIngressRules(value: js.Array[FirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    inline def setIngressRulesVarargs(value: FirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
