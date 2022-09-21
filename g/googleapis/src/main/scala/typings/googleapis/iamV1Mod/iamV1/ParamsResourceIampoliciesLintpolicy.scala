package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIampoliciesLintpolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaLintPolicyRequest] = js.undefined
}
object ParamsResourceIampoliciesLintpolicy {
  
  inline def apply(): ParamsResourceIampoliciesLintpolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIampoliciesLintpolicy]
  }
  
  extension [Self <: ParamsResourceIampoliciesLintpolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaLintPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
