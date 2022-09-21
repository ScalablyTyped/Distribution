package typings.googleapis.memcacheV1beta2Mod.memcacheV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesApplyparameters
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Resource name of the Memcached instance for which parameter group updates should be applied.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaApplyParametersRequest] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesApplyparameters {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesApplyparameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesApplyparameters]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesApplyparameters](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaApplyParametersRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
