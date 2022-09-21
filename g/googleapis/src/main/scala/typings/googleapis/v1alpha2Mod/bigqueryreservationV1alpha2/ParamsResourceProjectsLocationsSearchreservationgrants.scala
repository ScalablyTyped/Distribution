package typings.googleapis.v1alpha2Mod.bigqueryreservationV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSearchreservationgrants
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value returned from a previous List request, if any.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The parent resource name (containing project and location), which owns the grants. e.g.: "projects/myproject/locations/us-central1".
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Please specify resource name as grantee in the query. e.g., "grantee=projects/myproject" "grantee=folders/123" "grantee=organizations/456"
    */
  var query: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSearchreservationgrants {
  
  inline def apply(): ParamsResourceProjectsLocationsSearchreservationgrants = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSearchreservationgrants]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSearchreservationgrants](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
