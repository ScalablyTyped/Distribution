package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of items to return. Default is 10. Maximum limit is 1000. Throws an invalid argument if `page_size` is more than 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Pagination token that specifies the next page to return. If empty, the first page is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the entry group that contains the entries to list. Can be provided in URL format.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The fields to return for each entry. If empty or omitted, all fields are returned. For example, to return a list of entries with only the `name` field, set `read_mask` to only one path with the `name` value.
    */
  var readMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsEntriesList {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsEntriesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsEntriesList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsEntriesList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setReadMask(value: String): Self = StObject.set(x, "readMask", value.asInstanceOf[js.Any])
    
    inline def setReadMaskUndefined: Self = StObject.set(x, "readMask", js.undefined)
  }
}
