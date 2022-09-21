package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSecuritypoliciesGetrule
  extends StObject
     with StandardParameters {
  
  /**
    * The priority of the rule to get from the security policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the security policy to which the queried rule belongs.
    */
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceSecuritypoliciesGetrule {
  
  inline def apply(): ParamsResourceSecuritypoliciesGetrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSecuritypoliciesGetrule]
  }
  
  extension [Self <: ParamsResourceSecuritypoliciesGetrule](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    inline def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
