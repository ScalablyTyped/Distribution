package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate
  extends StObject
     with StandardParameters {
  
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.undefined
  
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.undefined
  
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaPerfMetricsSummary] = js.undefined
  
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate {
  
  inline def apply(): ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate]
  }
  
  extension [Self <: ParamsResourceProjectsHistoriesExecutionsStepsPerfmetricssummaryCreate](x: Self) {
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setRequestBody(value: SchemaPerfMetricsSummary): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
