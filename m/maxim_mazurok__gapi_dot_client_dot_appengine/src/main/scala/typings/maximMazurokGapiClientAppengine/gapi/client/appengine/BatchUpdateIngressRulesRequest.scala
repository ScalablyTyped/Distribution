package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateIngressRulesRequest extends StObject {
  
  /** A list of FirewallRules to replace the existing set. */
  var ingressRules: js.UndefOr[js.Array[FirewallRule]] = js.native
}
object BatchUpdateIngressRulesRequest {
  
  @scala.inline
  def apply(): BatchUpdateIngressRulesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateIngressRulesRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateIngressRulesRequestMutableBuilder[Self <: BatchUpdateIngressRulesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIngressRules(value: js.Array[FirewallRule]): Self = StObject.set(x, "ingressRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressRulesUndefined: Self = StObject.set(x, "ingressRules", js.undefined)
    
    @scala.inline
    def setIngressRulesVarargs(value: FirewallRule*): Self = StObject.set(x, "ingressRules", js.Array(value :_*))
  }
}
