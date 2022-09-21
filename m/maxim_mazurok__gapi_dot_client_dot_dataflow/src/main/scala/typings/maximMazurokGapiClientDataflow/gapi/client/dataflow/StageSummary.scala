package typings.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StageSummary extends StObject {
  
  /** End time of this stage. If the work item is completed, this is the actual end time of the stage. Otherwise, it is the predicted end time. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Metrics for this stage. */
  var metrics: js.UndefOr[js.Array[MetricUpdate]] = js.undefined
  
  /** Progress for this stage. Only applicable to Batch jobs. */
  var progress: js.UndefOr[ProgressTimeseries] = js.undefined
  
  /** ID of this stage */
  var stageId: js.UndefOr[String] = js.undefined
  
  /** Start time of this stage. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** State of this stage. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Straggler summary for this stage. */
  var stragglerSummary: js.UndefOr[StragglerSummary] = js.undefined
}
object StageSummary {
  
  inline def apply(): StageSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageSummary]
  }
  
  extension [Self <: StageSummary](x: Self) {
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setMetrics(value: js.Array[MetricUpdate]): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMetricsVarargs(value: MetricUpdate*): Self = StObject.set(x, "metrics", js.Array(value*))
    
    inline def setProgress(value: ProgressTimeseries): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    inline def setStageId(value: String): Self = StObject.set(x, "stageId", value.asInstanceOf[js.Any])
    
    inline def setStageIdUndefined: Self = StObject.set(x, "stageId", js.undefined)
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStragglerSummary(value: StragglerSummary): Self = StObject.set(x, "stragglerSummary", value.asInstanceOf[js.Any])
    
    inline def setStragglerSummaryUndefined: Self = StObject.set(x, "stragglerSummary", js.undefined)
  }
}
