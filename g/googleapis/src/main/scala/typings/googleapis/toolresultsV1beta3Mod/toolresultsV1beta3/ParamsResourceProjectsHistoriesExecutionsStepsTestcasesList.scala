package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList
  extends StObject
     with StandardParameters {
  
  /**
    * A Execution id Required.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * A History id. Required.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of TestCases to fetch. Default value: 100. The server will use this default if the field is not set or has a value of 0. Optional.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * A continuation token to resume the query at the next item. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A Project id. Required.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * A Step id. Note: This step must include a TestExecutionStep. Required.
    */
  var stepId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList {
  
  inline def apply(): ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesExecutionsStepsTestcasesList](x: Self) {
    
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
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
