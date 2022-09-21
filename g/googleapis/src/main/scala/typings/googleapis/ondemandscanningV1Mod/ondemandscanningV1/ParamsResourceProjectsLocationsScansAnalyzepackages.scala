package typings.googleapis.ondemandscanningV1Mod.ondemandscanningV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsScansAnalyzepackages
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent of the resource for which analysis is requested. Format: projects/[project_name]/locations/[location]
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyzePackagesRequestV1] = js.undefined
}
object ParamsResourceProjectsLocationsScansAnalyzepackages {
  
  inline def apply(): ParamsResourceProjectsLocationsScansAnalyzepackages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsScansAnalyzepackages]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsScansAnalyzepackages](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaAnalyzePackagesRequestV1): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
