package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaStageSummary extends StObject {
  
  /**
    * End time of this stage. If the work item is completed, this is the actual end time of the stage. Otherwise, it is the predicted end time.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Metrics for this stage.
    */
  var metrics: js.UndefOr[js.Array[SchemaMetricUpdate]] = js.undefined
  
  /**
    * Progress for this stage. Only applicable to Batch jobs.
    */
  var progress: js.UndefOr[SchemaProgressTimeseries] = js.undefined
  
  /**
    * ID of this stage
    */
  var stageId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Start time of this stage.
    */
  var startTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * State of this stage.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Straggler summary for this stage.
    */
  var stragglerSummary: js.UndefOr[SchemaStragglerSummary] = js.undefined
}
object SchemaStageSummary {
  
  inline def apply(): SchemaStageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStageSummary]
  }
  
  extension [Self <: SchemaStageSummary](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMetrics(value: js.Array[SchemaMetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: SchemaMetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setProgress(value: SchemaProgressTimeseries): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStageId(value: String): Self = StObject.set(x, "stageId", value.asInstanceOf[js.Any])
    
    inline def setStageIdNull: Self = StObject.set(x, "stageId", null)
    
    inline def setStageIdUndefined: Self = StObject.set(x, "stageId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStragglerSummary(value: SchemaStragglerSummary): Self = StObject.set(x, "stragglerSummary", value.asInstanceOf[js.Any])
    
    inline def setStragglerSummaryUndefined: Self = StObject.set(x, "stragglerSummary", js.undefined)
  }
}
