package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesEnvironmentsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the environment: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/environments/{environment_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesEnvironmentsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesEnvironmentsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesEnvironmentsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesEnvironmentsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
