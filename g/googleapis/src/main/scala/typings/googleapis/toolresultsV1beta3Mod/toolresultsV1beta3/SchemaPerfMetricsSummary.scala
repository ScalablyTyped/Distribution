package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPerfMetricsSummary extends StObject {
  
  var appStartTime: js.UndefOr[SchemaAppStartTime] = js.undefined
  
  /**
    * A tool results execution ID. @OutputOnly
    */
  var executionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Graphics statistics for the entire run. Statistics are reset at the beginning of the run and collected at the end of the run.
    */
  var graphicsStats: js.UndefOr[SchemaGraphicsStats] = js.undefined
  
  /**
    * A tool results history ID. @OutputOnly
    */
  var historyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Describes the environment in which the performance metrics were collected
    */
  var perfEnvironment: js.UndefOr[SchemaPerfEnvironment] = js.undefined
  
  /**
    * Set of resource collected
    */
  var perfMetrics: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The cloud project @OutputOnly
    */
  var projectId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A tool results step ID. @OutputOnly
    */
  var stepId: js.UndefOr[String | Null] = js.undefined
}
object SchemaPerfMetricsSummary {
  
  inline def apply(): SchemaPerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfMetricsSummary]
  }
  
  extension [Self <: SchemaPerfMetricsSummary](x: Self) {
    
    inline def setAppStartTime(value: SchemaAppStartTime): Self = StObject.set(x, "appStartTime", value.asInstanceOf[js.Any])
    
    inline def setAppStartTimeUndefined: Self = StObject.set(x, "appStartTime", js.undefined)
    
    inline def setExecutionId(value: String): Self = StObject.set(x, "executionId", value.asInstanceOf[js.Any])
    
    inline def setExecutionIdNull: Self = StObject.set(x, "executionId", null)
    
    inline def setExecutionIdUndefined: Self = StObject.set(x, "executionId", js.undefined)
    
    inline def setGraphicsStats(value: SchemaGraphicsStats): Self = StObject.set(x, "graphicsStats", value.asInstanceOf[js.Any])
    
    inline def setGraphicsStatsUndefined: Self = StObject.set(x, "graphicsStats", js.undefined)
    
    inline def setHistoryId(value: String): Self = StObject.set(x, "historyId", value.asInstanceOf[js.Any])
    
    inline def setHistoryIdNull: Self = StObject.set(x, "historyId", null)
    
    inline def setHistoryIdUndefined: Self = StObject.set(x, "historyId", js.undefined)
    
    inline def setPerfEnvironment(value: SchemaPerfEnvironment): Self = StObject.set(x, "perfEnvironment", value.asInstanceOf[js.Any])
    
    inline def setPerfEnvironmentUndefined: Self = StObject.set(x, "perfEnvironment", js.undefined)
    
    inline def setPerfMetrics(value: js.Array[String]): Self = StObject.set(x, "perfMetrics", value.asInstanceOf[js.Any])
    
    inline def setPerfMetricsNull: Self = StObject.set(x, "perfMetrics", null)
    
    inline def setPerfMetricsUndefined: Self = StObject.set(x, "perfMetrics", js.undefined)
    
    inline def setPerfMetricsVarargs(value: String*): Self = StObject.set(x, "perfMetrics", js.Array(value*))
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdNull: Self = StObject.set(x, "projectId", null)
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdNull: Self = StObject.set(x, "stepId", null)
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
  }
}
