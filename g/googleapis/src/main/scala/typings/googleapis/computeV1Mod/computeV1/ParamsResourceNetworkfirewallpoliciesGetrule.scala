package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworkfirewallpoliciesGetrule
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to which the queried rule belongs.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The priority of the rule to get from the firewall policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworkfirewallpoliciesGetrule {
  
  inline def apply(): ParamsResourceNetworkfirewallpoliciesGetrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworkfirewallpoliciesGetrule]
  }
  
  extension [Self <: ParamsResourceNetworkfirewallpoliciesGetrule](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
