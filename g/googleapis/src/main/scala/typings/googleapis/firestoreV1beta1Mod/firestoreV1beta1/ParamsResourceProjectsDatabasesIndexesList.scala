package typings.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDatabasesIndexesList
  extends StObject
     with StandardParameters {
  
  /**
    *
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The standard List page size.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The standard List page token.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The database name. For example: `projects/{project_id\}/databases/{database_id\}`
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDatabasesIndexesList {
  
  inline def apply(): ParamsResourceProjectsDatabasesIndexesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDatabasesIndexesList]
  }
  
  extension [Self <: ParamsResourceProjectsDatabasesIndexesList](x: Self) {
    
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
