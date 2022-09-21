package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkloadidentitypoolsUndelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the pool to undelete.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUndeleteWorkloadIdentityPoolRequest] = js.undefined
}
object ParamsResourceProjectsLocationsWorkloadidentitypoolsUndelete {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkloadidentitypoolsUndelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkloadidentitypoolsUndelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkloadidentitypoolsUndelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaUndeleteWorkloadIdentityPoolRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
