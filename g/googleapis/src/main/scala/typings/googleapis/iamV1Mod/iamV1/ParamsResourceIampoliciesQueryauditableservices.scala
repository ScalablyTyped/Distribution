package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIampoliciesQueryauditableservices
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaQueryAuditableServicesRequest] = js.undefined
}
object ParamsResourceIampoliciesQueryauditableservices {
  
  inline def apply(): ParamsResourceIampoliciesQueryauditableservices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIampoliciesQueryauditableservices]
  }
  
  extension [Self <: ParamsResourceIampoliciesQueryauditableservices](x: Self) {
    
    inline def setRequestBody(value: SchemaQueryAuditableServicesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
