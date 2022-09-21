package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsMembershipsListadmin
  extends StObject
     with StandardParameters {
  
  /**
    * Optional. Lists Memberships of admin clusters that match the filter expression.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. One or more fields to compare and use to sort the output. See https://google.aip.dev/132#ordering.
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. When requesting a 'page' of resources, `page_size` specifies number of resources to return. If unspecified or set to 0, all resources will be returned.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional. Token returned by previous call to `ListAdminClusterMemberships` which specifies the position in the list from where to continue listing the resources.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent (project and location) where the Memberships of admin cluster will be listed. Specified in the format `projects/x/locations/x`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsMembershipsListadmin {
  
  inline def apply(): ParamsResourceProjectsLocationsMembershipsListadmin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsMembershipsListadmin]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsMembershipsListadmin](x: Self) {
    
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
