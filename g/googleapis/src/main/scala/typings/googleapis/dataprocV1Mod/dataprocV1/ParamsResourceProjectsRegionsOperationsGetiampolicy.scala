package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsRegionsOperationsGetiampolicy
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGetIamPolicyRequest] = js.undefined
  
  /**
    * REQUIRED: The resource for which the policy is being requested. See Resource names (https://cloud.google.com/apis/design/resource_names) for the appropriate value for this field.
    */
  var resource: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsRegionsOperationsGetiampolicy {
  
  inline def apply(): ParamsResourceProjectsRegionsOperationsGetiampolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsRegionsOperationsGetiampolicy]
  }
  
  extension [Self <: ParamsResourceProjectsRegionsOperationsGetiampolicy](x: Self) {
    
    inline def setRequestBody(value: SchemaGetIamPolicyRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
