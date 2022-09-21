package typings.googleapis.memcacheV1Mod.memcacheV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesList
  extends StObject
     with StandardParameters {
  
  /**
    * List filter. For example, exclude all Memcached instances with name as my-instance by specifying `"name != my-instance"`.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Sort results. Supported values are "name", "name desc" or "" (unsorted).
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of items to return. If not specified, a default value of 1000 will be used by the service. Regardless of the `page_size` value, the response may include a partial list and a caller should only rely on response's `next_page_token` to determine if there are more instances left to be queried.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The `next_page_token` value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The resource name of the instance location using the form: `projects/{project_id\}/locations/{location_id\}` where `location_id` refers to a GCP region
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesList {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesList](x: Self) {
    
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
