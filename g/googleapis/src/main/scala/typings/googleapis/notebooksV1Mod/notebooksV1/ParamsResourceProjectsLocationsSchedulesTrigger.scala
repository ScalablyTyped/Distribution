package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSchedulesTrigger
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `parent=projects/{project_id\}/locations/{location\}/schedules/{schedule_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaTriggerScheduleRequest] = js.undefined
}
object ParamsResourceProjectsLocationsSchedulesTrigger {
  
  inline def apply(): ParamsResourceProjectsLocationsSchedulesTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSchedulesTrigger]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSchedulesTrigger](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaTriggerScheduleRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
