package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSchedulesCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSchedule] = js.undefined
  
  /**
    * Required. User-defined unique ID of this schedule.
    */
  var scheduleId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSchedulesCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsSchedulesCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSchedulesCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSchedulesCreate](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaSchedule): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setScheduleId(value: String): Self = StObject.set(x, "scheduleId", value.asInstanceOf[js.Any])
    
    inline def setScheduleIdUndefined: Self = StObject.set(x, "scheduleId", js.undefined)
  }
}
