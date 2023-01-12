package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirewallResource extends StObject {
  
  var ingressRules: IngressRulesResource
}
object FirewallResource {
  
  inline def apply(ingressRules: IngressRulesResource): FirewallResource = {
    val __obj = js.Dynamic.literal(ingressRules = ingressRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallResource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirewallResource] (val x: Self) extends AnyVal {
    
    inline def setIngressRules(value: IngressRulesResource): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
  }
}
