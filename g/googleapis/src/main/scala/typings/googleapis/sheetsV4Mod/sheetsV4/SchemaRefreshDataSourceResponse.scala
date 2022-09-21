package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRefreshDataSourceResponse extends StObject {
  
  /**
    * All the refresh status for the data source object references specified in the request. If is_all is specified, the field contains only those in failure status.
    */
  var statuses: js.UndefOr[js.Array[SchemaRefreshDataSourceObjectExecutionStatus]] = js.undefined
}
object SchemaRefreshDataSourceResponse {
  
  inline def apply(): SchemaRefreshDataSourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRefreshDataSourceResponse]
  }
  
  extension [Self <: SchemaRefreshDataSourceResponse](x: Self) {
    
    inline def setStatuses(value: js.Array[SchemaRefreshDataSourceObjectExecutionStatus]): Self = StObject.set(x, "statuses", value.asInstanceOf[js.Any])
    
    inline def setStatusesUndefined: Self = StObject.set(x, "statuses", js.undefined)
    
    inline def setStatusesVarargs(value: SchemaRefreshDataSourceObjectExecutionStatus*): Self = StObject.set(x, "statuses", js.Array(value*))
  }
}
