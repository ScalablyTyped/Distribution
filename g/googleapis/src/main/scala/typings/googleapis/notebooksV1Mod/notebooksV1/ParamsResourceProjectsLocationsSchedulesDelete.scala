package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSchedulesDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Format: `projects/{project_id\}/locations/{location\}/schedules/{schedule_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSchedulesDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsSchedulesDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSchedulesDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSchedulesDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
