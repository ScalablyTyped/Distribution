package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsEnvironmentsList
  extends StObject
     with StandardParameters {
  
  /**
    * Required. An Execution id.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A History id.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of Environments to fetch. Default value: 25. The server will use this default if the field is not set or has a value of 0.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A Project id.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesExecutionsEnvironmentsList {
  
  inline def apply(): ParamsResourceProjectsHistoriesExecutionsEnvironmentsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsEnvironmentsList]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesExecutionsEnvironmentsList](x: Self) {
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
