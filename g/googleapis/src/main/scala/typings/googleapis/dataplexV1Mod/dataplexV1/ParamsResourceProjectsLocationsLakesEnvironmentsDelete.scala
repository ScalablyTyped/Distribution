package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesEnvironmentsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the environment: projects/{project_id\}/locations/{location_id\}/lakes/{lake_id\}/environments/{environment_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesEnvironmentsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesEnvironmentsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesEnvironmentsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesEnvironmentsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
