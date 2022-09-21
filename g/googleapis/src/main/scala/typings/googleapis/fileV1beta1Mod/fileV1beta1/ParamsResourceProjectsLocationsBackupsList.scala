package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupsList
  extends StObject
     with StandardParameters {
  
  /**
    * List filter.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * Sort results. Supported values are "name", "name desc" or "" (unsorted).
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The next_page_token value to use if there are additional results to retrieve for this list request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The project and location for which to retrieve backup information, in the format `projects/{project_id\}/locations/{location\}`. In Filestore, backup locations map to GCP regions, for example **us-west1**. To retrieve backup information for all locations, use "-" for the `{location\}` value.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBackupsList {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupsList](x: Self) {
    
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
