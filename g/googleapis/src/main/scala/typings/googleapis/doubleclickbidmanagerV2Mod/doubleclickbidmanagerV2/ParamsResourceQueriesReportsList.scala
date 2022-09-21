package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesReportsList
  extends StObject
     with StandardParameters {
  
  /**
    * Name of a field used to order results. The default sorting order is ascending. To specify descending order for a field, append a " desc" suffix. For example "key.reportId desc". Sorting is only supported for the following fields: * `key.reportId`
    */
  var orderBy: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum number of results per page. Must be between `1` and `100`. Defaults to `100` if unspecified.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A page token, received from a previous list call. Provide this to retrieve the subsequent page of reports.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the query with which the reports are associated.
    */
  var queryId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQueriesReportsList {
  
  inline def apply(): ParamsResourceQueriesReportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesReportsList]
  }
  
  extension [Self <: ParamsResourceQueriesReportsList](x: Self) {
    
    inline def setOrderBy(value: String): Self = StObject.set(x, "orderBy", value.asInstanceOf[js.Any])
    
    inline def setOrderByUndefined: Self = StObject.set(x, "orderBy", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
  }
}
