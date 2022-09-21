package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesInventoriesList
  extends StObject
     with StandardParameters {
  
  /**
    * If provided, this field specifies the criteria that must be met by a `Inventory` API resource to be included in the response.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A pagination token returned from a previous call to `ListInventories` that indicates where this listing should continue from.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource name. Format: `projects/{project\}/locations/{location\}/instances/-` For `{project\}`, either `project-number` or `project-id` can be provided.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Inventory view indicating what information should be included in the inventory resource. If unspecified, the default view is BASIC.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesInventoriesList {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesInventoriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesInventoriesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesInventoriesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
