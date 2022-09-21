package typings.googleapis.doubleclickbidmanagerV2Mod.doubleclickbidmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceQueriesReportsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. ID of the query the report is associated with.
    */
  var queryId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. ID of the report to retrieve.
    */
  var reportId: js.UndefOr[String] = js.undefined
}
object ParamsResourceQueriesReportsGet {
  
  inline def apply(): ParamsResourceQueriesReportsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQueriesReportsGet]
  }
  
  extension [Self <: ParamsResourceQueriesReportsGet](x: Self) {
    
    inline def setQueryId(value: String): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    
    inline def setQueryIdUndefined: Self = StObject.set(x, "queryId", js.undefined)
    
    inline def setReportId(value: String): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
  }
}
