package typings.googleapis.cloudtasksV2Mod.cloudtasksV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsQueuesTasksDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The task name. For example: `projects/PROJECT_ID/locations/LOCATION_ID/queues/QUEUE_ID/tasks/TASK_ID`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsQueuesTasksDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsQueuesTasksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsQueuesTasksDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsQueuesTasksDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
