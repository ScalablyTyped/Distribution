package typings.googleapis.datacatalogV1beta1Mod.datacatalogV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsEntrygroupsEntriesList
  extends StObject
     with StandardParameters {
  
  /**
    * The maximum number of items to return. Default is 10. Max limit is 1000. Throws an invalid argument for `page_size \> 1000`.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Token that specifies which page is requested. If empty, the first page is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The name of the entry group that contains the entries, which can be provided in URL format. Example: * projects/{project_id\}/locations/{location\}/entryGroups/{entry_group_id\}
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * The fields to return for each Entry. If not set or empty, all fields are returned. For example, setting read_mask to contain only one path "name" will cause ListEntries to return a list of Entries with only "name" field.
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
