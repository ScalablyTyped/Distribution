package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A summary of perf metrics collected and performance environment info
  */
@js.native
trait SchemaPerfMetricsSummary extends js.Object {
  
  var appStartTime: js.UndefOr[SchemaAppStartTime] = js.native
  
  /**
    * A tool results execution ID.
    */
  var executionId: js.UndefOr[String] = js.native
  
  /**
    * Graphics statistics for the entire run. Statistics are reset at the
    * beginning of the run and collected at the end of the run.
    */
  var graphicsStats: js.UndefOr[SchemaGraphicsStats] = js.native
  
  /**
    * A tool results history ID.
    */
  var historyId: js.UndefOr[String] = js.native
  
  /**
    * Describes the environment in which the performance metrics were collected
    */
  var perfEnvironment: js.UndefOr[SchemaPerfEnvironment] = js.native
  
  /**
    * Set of resource collected
    */
  var perfMetrics: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The cloud project
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * A tool results step ID.
    */
  var stepId: js.UndefOr[String] = js.native
}
object SchemaPerfMetricsSummary {
  
  @scala.inline
  def apply(): SchemaPerfMetricsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerfMetricsSummary]
  }
  
  @scala.inline
  implicit class SchemaPerfMetricsSummaryOps[Self <: SchemaPerfMetricsSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppStartTime(value: SchemaAppStartTime): Self = this.set("appStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStartTime: Self = this.set("appStartTime", js.undefined)
    
    @scala.inline
    def setExecutionId(value: String): Self = this.set("executionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionId: Self = this.set("executionId", js.undefined)
    
    @scala.inline
    def setGraphicsStats(value: SchemaGraphicsStats): Self = this.set("graphicsStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphicsStats: Self = this.set("graphicsStats", js.undefined)
    
    @scala.inline
    def setHistoryId(value: String): Self = this.set("historyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryId: Self = this.set("historyId", js.undefined)
    
    @scala.inline
    def setPerfEnvironment(value: SchemaPerfEnvironment): Self = this.set("perfEnvironment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfEnvironment: Self = this.set("perfEnvironment", js.undefined)
    
    @scala.inline
    def setPerfMetricsVarargs(value: String*): Self = this.set("perfMetrics", js.Array(value :_*))
    
    @scala.inline
    def setPerfMetrics(value: js.Array[String]): Self = this.set("perfMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerfMetrics: Self = this.set("perfMetrics", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setStepId(value: String): Self = this.set("stepId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepId: Self = this.set("stepId", js.undefined)
  }
}
