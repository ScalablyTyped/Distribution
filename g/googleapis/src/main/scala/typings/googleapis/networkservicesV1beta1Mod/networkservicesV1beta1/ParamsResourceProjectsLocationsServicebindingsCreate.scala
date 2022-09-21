package typings.googleapis.networkservicesV1beta1Mod.networkservicesV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsServicebindingsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent resource of the ServiceBinding. Must be in the format `projects/x/locations/global`.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaServiceBinding] = js.undefined
  
  /**
    * Required. Short name of the ServiceBinding resource to be created.
    */
  var serviceBindingId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsServicebindingsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsServicebindingsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsServicebindingsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsServicebindingsCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaServiceBinding): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setServiceBindingId(value: String): Self = StObject.set(x, "serviceBindingId", value.asInstanceOf[js.Any])
    
    inline def setServiceBindingIdUndefined: Self = StObject.set(x, "serviceBindingId", js.undefined)
  }
}
