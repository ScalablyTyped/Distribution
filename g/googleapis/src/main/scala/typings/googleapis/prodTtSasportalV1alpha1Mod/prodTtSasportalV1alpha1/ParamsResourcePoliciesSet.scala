package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePoliciesSet
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSasPortalSetPolicyRequest] = js.undefined
}
object ParamsResourcePoliciesSet {
  
  inline def apply(): ParamsResourcePoliciesSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePoliciesSet]
  }
  
  extension [Self <: ParamsResourcePoliciesSet](x: Self) {
    
    inline def setRequestBody(value: SchemaSasPortalSetPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
