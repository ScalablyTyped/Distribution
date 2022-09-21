package typings.googleapis.tpuV2alpha1Mod.tpuV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGenerateserviceidentity
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource name.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGenerateServiceIdentityRequest] = js.undefined
}
object ParamsResourceProjectsLocationsGenerateserviceidentity {
  
  inline def apply(): ParamsResourceProjectsLocationsGenerateserviceidentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGenerateserviceidentity]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGenerateserviceidentity](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaGenerateServiceIdentityRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
