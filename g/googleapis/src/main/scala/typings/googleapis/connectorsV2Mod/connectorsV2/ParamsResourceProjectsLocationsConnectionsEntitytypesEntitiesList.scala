package typings.googleapis.connectorsV2Mod.connectorsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList
  extends StObject
     with StandardParameters {
  
  /**
    * Conditions to be used when listing entities. From a proto standpoint, There are no restrictions on what can be passed using this field. The connector documentation should have information about what format of filters/conditions are supported.
    */
  var conditions: js.UndefOr[String] = js.undefined
  
  /**
    * Number of entity rows to return. Defaults page size = 25. Max page size = 200.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token value if available from a previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Resource name of the Entity Type. Format: projects/{project\}/locations/{location\}/connections/{connection\}/entityTypes/{type\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * List of 'sort_by' columns to use when returning the results.
    */
  var sortBy: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList {
  
  inline def apply(): ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsConnectionsEntitytypesEntitiesList](x: Self) {
    
    inline def setConditions(value: String): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setSortBy(value: js.Array[String]): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortByVarargs(value: String*): Self = StObject.set(x, "sortBy", js.Array(value*))
  }
}
