package typings.googleapis.firestoreV1beta2Mod.firestoreV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesCollectiongroupsIndexesList
  extends StObject
     with StandardParameters {
  
  /**
    * The filter to apply to list results.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The number of results to return.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, returned from a previous call to FirestoreAdmin.ListIndexes, that may be used to get the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A parent name of the form `projects/{project_id\}/databases/{database_id\}/collectionGroups/{collection_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesCollectiongroupsIndexesList {
  
  inline def apply(): ParamsResourceProjectsDatabasesCollectiongroupsIndexesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesCollectiongroupsIndexesList]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesCollectiongroupsIndexesList](x: Self) {
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
