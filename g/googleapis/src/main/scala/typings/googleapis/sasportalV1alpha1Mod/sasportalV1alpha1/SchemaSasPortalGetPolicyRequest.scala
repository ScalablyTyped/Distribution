package typings.googleapis.sasportalV1alpha1Mod.sasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalGetPolicyRequest extends StObject {
  
  /**
    * Required. The resource for which the policy is being requested.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalGetPolicyRequest {
  
  inline def apply(): SchemaSasPortalGetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalGetPolicyRequest]
  }
  
  extension [Self <: SchemaSasPortalGetPolicyRequest](x: Self) {
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
