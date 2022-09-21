package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListDashboardsResponse extends StObject {
  
  /**
    * The list of requested dashboards.
    */
  var dashboards: js.UndefOr[js.Array[SchemaDashboard]] = js.undefined
  
  /**
    * If there are more results than have been returned, then this field is set to a non-empty value. To see the additional results, use that value as page_token in the next call to this method.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
}
object SchemaListDashboardsResponse {
  
  inline def apply(): SchemaListDashboardsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListDashboardsResponse]
  }
  
  extension [Self <: SchemaListDashboardsResponse](x: Self) {
    
    inline def setDashboards(value: js.Array[SchemaDashboard]): Self = StObject.set(x, "dashboards", value.asInstanceOf[js.Any])
    
    inline def setDashboardsUndefined: Self = StObject.set(x, "dashboards", js.undefined)
    
    inline def setDashboardsVarargs(value: SchemaDashboard*): Self = StObject.set(x, "dashboards", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
