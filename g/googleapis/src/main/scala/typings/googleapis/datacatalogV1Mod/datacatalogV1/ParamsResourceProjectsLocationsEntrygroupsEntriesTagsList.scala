package typings.googleapis.datacatalogV1Mod.datacatalogV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of tags to return. Default is 10. Maximum limit is 1000.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Pagination token that specifies the next page to return. If empty, the first page is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the Data Catalog resource to list the tags of. The resource can be an Entry or an EntryGroup (without `/entries/{entries\}` at the end).
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList {
  
  inline def apply(): ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsEntrygroupsEntriesTagsList](x: Self) {
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
