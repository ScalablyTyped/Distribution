package typings.googleapis.networkmanagementV1beta1Mod.networkmanagementV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalConnectivitytestsList
  extends StObject
     with StandardParameters {
  
  /**
    * Lists the `ConnectivityTests` that match the filter expression. A filter expression filters the resources listed in the response. The expression must be of the form ` ` where operators: `<`, `\>`, `<=`, `\>=`, `!=`, `=`, `:` are supported (colon `:` represents a HAS operator which is roughly synonymous with equality). can refer to a proto or JSON field, or a synthetic field. Field names can be camelCase or snake_case. Examples: - Filter by name: name = "projects/proj-1/locations/global/connectivityTests/test-1 - Filter by labels: - Resources that have a key called `foo` labels.foo:* - Resources that have a key called `foo` whose value is `bar` labels.foo = bar
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Field to use to sort the list.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Number of `ConnectivityTests` to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token from an earlier query, as returned in `next_page_token`.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent resource of the Connectivity Tests: `projects/{project_id\}/locations/global`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalConnectivitytestsList {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalConnectivitytestsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalConnectivitytestsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalConnectivitytestsList](x: Self) {
    
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
