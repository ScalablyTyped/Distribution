package typings.googleapis.dataplexV1Mod.dataplexV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsLakesTasksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the task: projects/{project_number\}/locations/{location_id\}/lakes/{lake_id\}/task/{task_id\}.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsLakesTasksDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsLakesTasksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsLakesTasksDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsLakesTasksDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
