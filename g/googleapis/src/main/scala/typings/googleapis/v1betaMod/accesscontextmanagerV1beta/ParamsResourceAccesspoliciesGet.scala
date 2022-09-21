package typings.googleapis.v1betaMod.accesscontextmanagerV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccesspoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name for the access policy to get. Format `accessPolicies/{policy_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccesspoliciesGet {
  
  inline def apply(): ParamsResourceAccesspoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccesspoliciesGet]
  }
  
  extension [Self <: ParamsResourceAccesspoliciesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
