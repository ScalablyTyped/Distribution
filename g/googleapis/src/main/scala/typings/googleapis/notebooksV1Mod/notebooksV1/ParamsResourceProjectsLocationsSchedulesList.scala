package typings.googleapis.notebooksV1Mod.notebooksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSchedulesList
  extends StObject
     with StandardParameters {
  
  /**
    * Filter applied to resulting schedules.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Field to order results by.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum return size of the list call.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A previous returned page token that can be used to continue listing from the last result.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Format: `parent=projects/{project_id\}/locations/{location\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSchedulesList {
  
  inline def apply(): ParamsResourceProjectsLocationsSchedulesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSchedulesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSchedulesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
